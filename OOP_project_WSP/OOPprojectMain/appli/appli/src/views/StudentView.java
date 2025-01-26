package views;

import Users.Student;
import Users.User;
import controllers.ApplicationController;
import model.Attendance;
import model.Course;
import model.News;
import model.Subject;
import model.CourseApplication;
import model.CourseRegister;
import model.Lesson;
import model.Message;

import java.util.*;
import java.util.stream.Collectors;

import DBs.DBContext;

public class StudentView {

  private static Student student;
  private static Course course;
  private static Scanner input = new Scanner(System.in);
  
  public static void setStudent(User user) {
    student = (Student) user;
  }
  
  public static void menu() {
    System.out.println("Welcome, Student!");
    System.out.println("0. Exit\n1. View News");
    System.out.println("2. View courses");
    System.out.println("3. Add application for course");
    System.out.println("4. My application for course");
    System.out.println("5. Send message");
    System.out.println("6. View messages");
    System.out.println("7. Mark Attendance");
    System.out.println("8. View Attendance");
    System.out.println("9. Register for lesson");
    System.out.println("10. My Registers for lesson");
    System.out.println("11. Become Researcher");
    if(student.getStudentResearcher() != null) {
    	System.out.println("12. Researcher menu");
    }
    
    int option = input.nextInt();
    
    if(option == 0) {
      BaseView.welcome();
    }
    else if(option == 1) {
      viewNews();
    }
    else if(option == 2) {
      viewCourses();
    }
    else if(option == 3) {
      addApplication();
    }
    else if(option == 4) {
      myApplication();
    }
    else if(option == 5) {
      sendMessages();
    }
    else if(option == 6) {
      viewMessages();
    }
    else if(option == 7) {
      markAttendance();
    }
    else if(option == 8) {
      viewAttendance();
    }
    else if(option == 9) {
        registerForLesson();
      }
    else if(option == 10) {
        myRegisterForLesson();
      }
    else if(option == 11) {
    	becomeResearcher();
    }
    else if(option == 12) {
    	ResearcherView.setResearcherView(student.getStudentResearcher());
    	ResearcherView.welcome();
    }
  }
  
  public static void myRegisterForLesson() {
	  Student existingStudent = DBContext.getStudentByName(student.getUserName());
	  List<Lesson> lessons = existingStudent.getLessons();
		 
	    if (lessons.isEmpty()) {
	      System.out.println("No lessons created.");
	    } else {
	      System.out.println("My lessons:");
	      int i =0;
	      for (Lesson l : lessons) {
	        i++;
	        System.out.println(i+ ":  Topic: " + l.getName() + ", start lesson :" + l.getStartLesson());
	      }
	    }
	    menu();
  }
  
  public static void registerForLesson() {
	  List<Course> courses = student.getCourses();
	  
	  getCourses();
	  System.out.println("Выбери");
	  int courseType = input.nextInt();
	  Course existingCourse = DBContext.getCourseByName(courses.get(courseType-1).getCourseName());
	  System.out.println("Lessons ...");
	  List<Lesson> lessons = existingCourse.getLessons();
	 
	    if (lessons.isEmpty()) {
	      System.out.println("No lessons created.");
	    } else {
	      System.out.println("Created lessons:");
	      int i =0;
	      for (Lesson l : lessons) {
	        i++;
	        System.out.println(i+ ":  Topic: " + l.getName() + ", start lesson :" + l.getStartLesson());
	      }
	    }
	    
	    System.out.println("Выбери");
		int lessonType = input.nextInt();
		Student existingStudent = DBContext.getStudentByName(student.getUserName());
		Lesson les = lessons.get(lessonType-1);
		les.addStudent(existingStudent);
		existingStudent.enrollInLesson(les);
		
		System.out.println("Succesfully");
		menu();
	  }
  
  public static void viewAttendance() {
    int i = 1;
    System.out.println("Choose subject:");
    for(Subject s : student.getLastSemester().getSubjects()) {
      System.out.println(i+ ": "+ s.getName());
      i++;
    }
    Integer option = input.nextInt();
    if (option < 1 || option > student.getLastSemester().getSubjects().size()) {
          System.out.println("Invalid option. Please try again.");
          menu();
      }
    else {
      i = 1;
      for(Attendance a : student.getLastSemester().getSubject(student.getLastSemester().getSubjects().get(option).getName()).getAttendances()) {
        System.out.println(i+ ": " + a.getStatus());
        i++;
      }
      menu();
    }
  }
  
  public static void markAttendance() {
	    int i = 1;
	    System.out.println("Open attendances:");
	    Vector<Vector<Integer>> v = new Vector<>();
	    int si = 0;

	    for (Subject s : student.getLastSemester().getSubjects()) {
	        int ai = 0;
	        for (Attendance a : s.getAttendances()) {
	            if (!a.getStatus() && a.getIsOpen()) {
	                System.out.println(i + ": " + s.getName());
	                Vector<Integer> v0 = new Vector<>();
	                v0.add(si); 
	                v0.add(ai); 
	                v.add(v0);
	                i++;
	            }
	            ai++;
	        }
	        si++;
	    }

	    if (v.isEmpty()) {
	        System.out.println("No open attendances available.");
	        menu();
	        return;
	    }

	    int option = input.nextInt();
	    if (option < 1 || option > v.size()) {
	        System.out.println("Invalid option. Please try again.");
	        menu();
	        return;
	    }

	    int subjectIndex = v.get(option - 1).get(0);
	    int attendanceIndex = v.get(option - 1).get(1);

	    Subject subject = student.getLastSemester().getSubjects().get(subjectIndex);
	    Attendance attendance = subject.getAttendances().get(attendanceIndex);

	    attendance.changeStatus();

	    System.out.println("Attendance marked successfully!");
	    menu();
	}
  
   public static void viewMessages() {
        int i = 1;
        for(Message m:student.messages) {
          System.out.println(i+ ": "+ m);
          i++;
        }
        System.out.println("It is all list of messages");
        menu();
      }
  
   
   public static void sendMessages() {
        System.out.println("Name: ");
        input.nextLine();  
        String name = input.nextLine();

        System.out.println("Message: ");
        String message = input.nextLine();

        User recipient = DBContext.getUserByName(name);
        if (recipient == null) {
            System.out.println("User not found.");
            menu();
            return;
        }

        Message mess = new Message(recipient, student, message);

        student.addMessage(mess);
        recipient.addMessage(mess);

        DBContext.saveUsers();
        System.out.println("Message successfully sent!");
        menu();
    }
  
  
  
  
  
  
  public static void viewNews() {
    System.out.println("0. Quit");
    for(News news : student.news) {
      System.out.println(news);
    }
    
    menu();
    
  }
  
  
  
  
  public static void getCourses() {
	  List<Course> courses = student.getCourses();
	    
	    if (courses.isEmpty()) {
	      System.out.println("No courses enrolled.");
	    } else {
	      System.out.println("Enrolled Courses:");
	      int i =0;
	      for (Course course : courses) {
	        i++;
	        System.out.println(i+ ": " +course.getCourseName());
	      }
	    }
  }
  
  
  public static void viewCourses() {
	  getCourses();
	  menu();
  }
  
  
  
  
  
  
  
  
  
  
  
  public static void addApplication(){
    CourseRegister register = new CourseRegister();
    List<Course> availableCourses =  register.getAvailableCourses(student);

    if(availableCourses.isEmpty()) {
      System.out.println("No courses for registration");
    }
    else {
      for (int i = 0; i < availableCourses.size(); i++) {
        Course course = availableCourses.get(i);
        
        System.out.println(i + 1 + ": " + course.getCourseName());
      }
      
      while(true) {
        int index = input.nextInt();
        if (index > 0 && index <= availableCourses.size()) {
              Course selectedCourse = availableCourses.get(index - 1);
      
              ApplicationController.createApplication(student, selectedCourse);
              System.out.println("Successfully added!");
              break;
          } else {
              System.out.println("Invalid index. Please try again.");
          }
      }
    }
    
    menu();
  }
  
  public static void myApplication() {
    List<CourseApplication> c = CourseRegister.getApplicationOfStudent(student);
    System.out.println(c);
    menu();
  }
  
  
  public static void becomeResearcher() {
	  for(User user : DBContext.user) {
		  if(user instanceof Student) {
			  Student s = (Student) user;
			  if(s.getUserName().equals(student.getUserName()) && s.getPassword().equals(student.getPassword())) {
				  DBContext.studentOffers.add(s);
				  DBContext.saveStudentOffers();
				  break;
			  }
		  }
	  }
	  menu();
  }
  
  
}
        
        
        