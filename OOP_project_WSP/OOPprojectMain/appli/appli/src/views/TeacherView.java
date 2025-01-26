package views;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

import DBs.DBContext;
import Users.Teacher;
import Users.User;
import Users.Student;
import model.Course;
import model.Message;
import model.Lesson;
import enums.Language;
import model.Translator;

import java.time.format.DateTimeFormatter;

public class TeacherView {
	public static Teacher teacher;
	private static Scanner input = new Scanner(System.in);
	
	public static void setTeacher(User user) {
		teacher = (Teacher) user;
	}
	
	public static void menu() {
		System.out.println("Welcome, Teacher!" + teacher.getUserName());

		System.out.println("0. Quit\n1. View Data");
		System.out.println("2. View messages");
		System.out.println("3. View Lessons");
		System.out.println("4. View students");
		System.out.println("5. Put Attestation");
		System.out.println("6. Add Attendance");
		System.out.println("8. Researcher menu");
	    System.out.println("9. Send Complaint");

		int option = input.nextInt();
		
		if(option == 0) {
			BaseView.welcome();
		}else if(option == 1) {
			viewInfo();
		}
		else if(option == 2) {
			viewMessages();
		}
		else if(option == 3) {
			viewLessons();
		}
		else if(option == 4) {
//			viewStudents();
		}
		else if(option == 5) {
			putAttestation();
		}
		else if(option == 6) {
			addAttendance();
		}
		else if(option == 8) {
	    	ResearcherView.setResearcherView(teacher.getResearcher());
	    	ResearcherView.welcome();
	    }else if(option == 9) {
	    	sendComplaint();
	    }
	}
	
	public static void sendComplaint() {
	      
  		System.out.println("0. Quit\n1. Write student user name");
  		int option = 0;

  		try {
  		    option = input.nextInt();
  		    input.nextLine(); 
  		} catch (InputMismatchException e) {
  		    System.out.println("Invalid input. Please enter a number.");
  		    input.nextLine();
  		    menu();
  		    return;
  		}

  		if (option == 0) {
  		    menu();
  		    return;
  		} else if (option == 1) {
  		    System.out.println("Select urgency level:");
  		    System.out.println("1. Low\n2. Medium\n3. High");

  		    int answer = 0;
  		    try {
  		        answer = input.nextInt();
  		        input.nextLine(); 
  		    } catch (InputMismatchException e) {
  		        System.out.println("Invalid input. Please enter a number.");
  		        input.nextLine(); 
  		        menu();
  		        return;
  		    }

  		    System.out.println("Enter the student's username:");
  		    String name = input.nextLine();

  		    boolean studentFound = false;
  		    for (User user : DBContext.user) {
  		        if (user instanceof Student) {
  		            Student student = (Student) user;
  		            if (student.getUserName().equals(name)) {
  		                studentFound = true;

  		                switch (answer) {
  		                    case 1:
  		                        DBContext.complaint.put(student, "Low");
  		                        break;
  		                    case 2:
  		                        DBContext.complaint.put(student, "Medium");
  		                        break;
  		                    case 3:
  		                        DBContext.complaint.put(student, "High");
  		                        break;
  		                    default:
  		                        System.out.println("Invalid urgency level selected.");
  		                        menu();
  		                        return;
  		                }

  		                System.out.println("Complaint successfully added for " + student.getUserName() + " with urgency: " +
  		                        (answer == 1 ? "Low" : answer == 2 ? "Medium" : "High"));
  		                break;
  		            }
  		        }
  		    }

  		    if (!studentFound) {
  		        System.out.println("Student with username '" + name + "' not found.");
  		    }
  		}

  		DBContext.saveComplaint();
  		menu();

    }
	
//	public static void viewStudents() {
//		int i = 1;
//		for(Lesson l : teacher.getLessons()) {
//			System.out.println(i+ ": "+ l.getName());
//			i++;
//		}
//		System.out.println("Choose");
//		int j = input.nextInt();
//
//		Lesson lesson = teacher.getLessons(j);
//		System.out.println("Course choosed");
//		int q = 1;
//		for(Student s : lesson.getStudents()) {
//			System.out.println(i+ ": "+ s.getUserName());
//			q++;
//		}
//		
//		menu();
//	}
	
	public static void addAttendance() {
		int i = 1;
		System.out.println("Choose lesson:");
		for (Lesson l : teacher.getLessons()) {
		    System.out.println(i + ": " + l.getName());
		    i++;
		}
		int indexLesson = input.nextInt();
		System.out.println("Free attendance? y/n");
		String choose = input.next();
		if (choose.equals("y")) {
		    teacher.putAttendance(indexLesson);
		} else {
		    System.out.println("How long?");
		    int time = input.nextInt();
		    teacher.addAttendance(indexLesson, time);
		}

	}
	
	public static void putAttestation() {
		int i = 1;
		System.out.println("Choose lesson:");
		Vector<Lesson> lectures = new Vector<>();
		for(Lesson l : teacher.getLessons()) {
			if(l.getType().equals("LECTURE")) {
				System.out.println(i+ ": "+ l.getName());
				lectures.add(l);
				i++;
			}
			
		}
		int indexLesson = input.nextInt();
		Lesson selectedLesson = lectures.get(indexLesson-1);
		System.out.println("Choose student:");
		i = 1;
		for(Student s: selectedLesson.getStudents()) {
			System.out.println(i+ ": "+ s.getUserName());
			i++;
		}
		int indexStudent = input.nextInt();
		System.out.println("Put mark:");
		double mark = input.nextInt();
		teacher.putMark(mark, teacher.getLessons().indexOf(selectedLesson), indexStudent);
		menu();
	}
	
	public static void viewLessons() {
		int i = 1;
		DateTimeFormatter form = DateTimeFormatter.ofPattern("HH:mm");
    	for(Lesson c: teacher.getLessons()) {
    		System.out.println(i+ ": "+ c.getName() + " " + c.getStartLesson().format(form)+ "-" +c.getEndLesson().format(form) + " " + c.getDay());
    		i++;
    	}
    	System.out.println("It is all courses");
    	menu();
	}
	
	
	 public static void viewMessages() {
	    	int i = 1;
	    	for(Message m:teacher.messages) {
	    		System.out.println(i+ ": "+ m);
	    		i++;
	    	}
	    	System.out.println("It is all list of messages");
	    	menu();
	    }
	
	public static void viewInfo() {
		System.out.println(teacher);
		menu();
	}
	
}
