//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package views;

import Users.Manager;
import Users.Student;
import Users.Teacher;
import Users.User;
import controllers.ApplicationController;
import controllers.CourseController;
import controllers.UserController;
import enums.CourseType;
import enums.LessonType;
import enums.SchoolName;
import enums.UserTypes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import DBs.DBContext;
import OOPproject.ResearcherDecorator;
import model.Course;
import model.CourseApplication;
import model.CourseRegister;
import model.Lesson;
import model.Message;


public class ManagerView {
    private static Manager manager;
    private static Scanner input;
    static CourseRegister cr;

    static {
        input = new Scanner(System.in);
        cr = new CourseRegister();
    }

    public ManagerView() {
    }

    public static void setManager(User user) {
        manager = (Manager)user;
    }

    public static void menu() {
        System.out.println("Welcome, Manager!");
        System.out.println("0. Exit\n1. Add News");
        System.out.println("2. Remove News");
        System.out.println("3. Create course");
        System.out.println("4. View course applications");
        System.out.println("5.  Students in the system");
        System.out.println("6.  Teachers in the system");
        System.out.println("7.  All courses in the system");
        System.out.println("8.  Assign teacher for course");
        System.out.println("9.  Student in the course");
        System.out.println("10.  View lessons");
        System.out.println("11.  Teacher in course");
        System.out.println("12.  Teacher in lesson");
        System.out.println("13.  Send message");
        System.out.println("14. View messages");
        System.out.println("15. View student offers about become Researcher");
        System.out.println("16. View complaints");
        
        int option = input.nextInt();
        if (option == 0) {
            BaseView.welcome();
        }
        else if (option == 1) {
        	sendNews();
        } 
        else if (option == 2) {
        	removeNews();
        }

        if (option == 3) {
        	createCourse();
        } 
//                viewCourseApplications();

		else if (option == 4) {
        	viewCourseApplications();

        } 
		else if (option == 5) {
        	 viewStudents();
      	} 
		else if (option == 6) {
        	viewTeachers();
        } 
		else if (option == 7) {
        	viewCourses();
        } 
		else if(option == 8) {
			assignTeacher();
		}
		else if(option == 9) {
			viewStudentsInCourse();
		}
		else if(option == 10) {
			viewLessons();
		}
		else if(option == 11) {
			TeacherInCourse();
		}
		else if(option == 12) {
			teacherInLesson();
		}
		else if(option == 13) {
			sendMessage();
		}
		else if(option == 14) {
			viewMessages();
		}
		else if(option == 15) {
			viewStudentResearcherOffers();
		}
		else if(option == 16) {
			viewComplaints();
		}



    }
    
    
    public static void viewMessages() {
    	System.out.println("Loading");
    	int i = 1;
    	for(Message m:manager.messages) {
    		System.out.println(i+ ": "+ m);
    		i++;
    	}
    	menu();
    }
    
    
    public static void sendMessage() {
    	System.out.println("Name: ");
    	input.nextLine();
    	String name = input.nextLine();
    	
    	
    	System.out.println("Message: ");
    	String message = input.nextLine();
    	
    	User user = DBContext.getUserByName(name);
    	Message mess = new Message(user,manager,message);
    	
    	user.addMessage(mess);
    	manager.addMessage(mess);
       

        
         DBContext.saveUsers();

         System.out.println("Message successfully sent!");
         menu();
    	
    	
    	System.out.println("Succesfully");
    	menu();
    }
  


	public static void sendNews() {
		System.out.println("Topic: ");
		input.nextLine();
        String topic = input.nextLine().trim();
        input.nextLine();
        System.out.println("Main: ");
        String main = input.nextLine();
		manager.addNews(topic, main, DBContext.user);
		System.out.println("You successfully added latest News!");
		
		menu();
	}
    
    public static void removeNews() {
		try {
			System.out.println("0. Quit");
			System.out.println("Which news you want to delete: ");
			int option = input.nextInt();
			if(option == 0) {
				menu();
			}
			for(User user : DBContext.user) {
				user.news.remove(option-1);
			}
			System.out.println("You successfully deleted this new");
			DBContext.saveUsers();
			menu();
		}catch(RuntimeException e) {
			System.out.println("No news with this id");
			removeNews();
		}
	}
    
    
    public static void createCourse() {
    	input.nextLine(); 
    	System.out.println("Course Code: ");
        String CourseCode = input.nextLine();
        
    	System.out.println("Course name: ");
        String CourseName = input.nextLine();
        
        System.out.println("Course credits: ");
        Integer CourseCredits = input.nextInt();
        
        System.out.println("Course Year: ");
        Integer CourseYear = input.nextInt();
        
        CourseType selectedType = null;
        System.out.println("Available course types: ");
        int i = 0;
        for (CourseType type : CourseType.values()) {
        	i++;
            System.out.println(i + ": "+  type);
        }
        System.out.println("Course type: ");
        int type = input.nextInt();
        if(type == 1) {
        	selectedType = CourseType.MAJOR;
        }
        else if(type == 2) {
        	selectedType = CourseType.MINOR;
        }
        else if(type == 3) {
        	selectedType = CourseType.ELECTIVE;
        }
        
        SchoolName selectedTypes = null;
        System.out.println("Available course schools: ");
        int j = 0;
        for (SchoolName type2 : SchoolName.values()) {
        	j++;
            System.out.println(j + ": "+  type2);
        }
        System.out.println("School type: ");
        int type2 = input.nextInt();
        if(type2 == 1) {
        	selectedTypes = SchoolName.SITE;
        }
        else if(type2 == 2) {
        	selectedTypes = SchoolName.BS;
        }
        else if(type2 == 3) {
        	selectedTypes = SchoolName.SAM;
        }
        
        boolean result = CourseController.createCourse(CourseCode,CourseName,CourseCredits,CourseYear,selectedType,selectedTypes);
        System.out.println(result ? "Course created successfully." : "Failed to create course.");
        menu();
    }
    
    public static void viewCourses() {
    	System.out.println("Loading courses...");
        var courses = DBContext.getCourses();

        if (courses == null || courses.isEmpty()) {
            System.out.println("No courses found.");
        } else {
        	int i =0;
            for (Course course : courses) {
            	if(course instanceof Course) {
            		i++;
            		System.out.println(i +": "+ course.getCourseName());}
            }
        }
        System.out.println("Хотите создать урок?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("Что выбираете?");
        int createLesson = input.nextInt();
        if(createLesson == 2) {
        	menu();
        }
        else if(createLesson == 1) {
	        System.out.println("Create lesson for course:");
	        int courseType = input.nextInt();
	        input.nextLine();
	        Course selectedCourse = courses.get(courseType-1);
	        System.out.println("Create lesson...");
	        System.out.println("Lesson topic:");
	        String name = input.nextLine();
	        LessonType selectedType = null;
	        System.out.println("Available lesson types: ");
	        int i = 0;
	        for (LessonType type : LessonType.values()) {
	        	i++;
	            System.out.println(i + ": "+  type);
	        }
	        System.out.println("Lesson type: ");
	        int type = input.nextInt();
	        if(type == 1) {
	        	selectedType = LessonType.LECTURE;
	        }
	        else if(type == 2) {
	        	selectedType = LessonType.PRACTICE;
	        }
	        input.nextLine();
	        System.out.println("Lesson start (dd/MM/yyyy HH:mm:ss): ");
	
	
	        String start = input.nextLine(); 
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	        
	        LocalDateTime dateTime = LocalDateTime.parse(start, formatter); 
	        
	        
	        System.out.println("Lesson end (dd/MM/yyyy HH:mm:ss): ");
	        String end = input.nextLine(); 
	        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	        
	        LocalDateTime dateTime2 = LocalDateTime.parse(end, formatter2); 
	        
	        Course existingCourse = DBContext.getCourseByName(selectedCourse.getCourseName());
	        Lesson l = new Lesson(name,dateTime,dateTime2,selectedCourse,selectedType);
	        existingCourse.enrollLesson(l);
	        System.out.println("Lesson created.");
	        menu();
        }
    }
    
    
    
    
    
    
    
    
    public static void viewLessons() {
    	List<Course> courses = DBContext.getCourses();
    	for(Course c:courses) {
    		System.out.println(c.getCourseName());
    		List<Lesson> l = c.getLessons();
    		int i =1;
    		for(Lesson type:l) {
    			System.out.println(i + ": " + type);
    		}
    	}
    	menu();
    }
    
    
    
    
    
    public static void viewTeachers() {
    	System.out.println("Loading teachers...");
        var teachers = DBContext.getUsers();

        if (teachers == null || teachers.isEmpty()) {
            System.out.println("No teachers found.");
        } else {
            for (User teacher : teachers) {
            	if(teacher instanceof Teacher) {
            		System.out.println(teacher.getUserName());
            	}
            }
        }
        System.out.println();
        menu();
    }
    
    
    
    
    
    public static void viewStudents() {
    	System.out.println("Loading students...");
        var students = DBContext.getUsers();

        if (students == null || students.isEmpty()) {
            System.out.println("No student found.");
        } else {
            for (User student : students) {
            	if(student instanceof Student) {
            		System.out.println(student.getUserName());
            	}
            }
        }
        System.out.println();
        menu();
    }
    
    
    
    
    
    public static void viewCourseApplications() {
//    	List<CourseApplication> applications = DBContext.getApplications();
    	List<CourseApplication> applications = CourseRegister.getUncheckedApplications();
    	int i =0;
    	for(CourseApplication application:applications) {
    		i++;
    		System.out.println(i + ": " +application);
    	}
    	System.out.println("Application number:");
    	int type = input.nextInt();
    	
    	CourseApplication c =  applications.get(type-1);
    	
    	System.out.println("1. Approve");
    	System.out.println("2. Reject");
    	System.out.println("What did you choose?");
    	int type2 = input.nextInt();
    	if(type2 == 1) {
    		c.Approved();
    		
    	}
    	else if(type2 == 2) {
    		c.Rejected();
  		
    	}
    	
    	menu();
    }
    
    
    
    
    
    
    
    
    public static void assignTeacher() {
	    	System.out.println("Loading courses...");
	        var courses = DBContext.getCourses();
	
	        if (courses == null || courses.isEmpty()) {
	            System.out.println("No courses found.");
	        } else {
	        	int i =0;
	            for (Course course : courses) {
	            	if(course instanceof Course) {
	            		i++;
	            		System.out.println(i +": "+ course.getCourseName());}
	            }
	        }
	        
	        System.out.println("Course: ");
	        int i = input.nextInt();
	        Course c = courses.get(i-1);
	        
	        System.out.println("Assigning...");
	        System.out.println("1. For course");
	    	System.out.println("2. For lesson");
	    	System.out.println("I Choose:");
	    	int ty= input.nextInt();
	    	
	    	if(ty==1) {
		    	List<User> teachers = DBContext.getUsers();
		    	
		    	 if (teachers == null || teachers.isEmpty()) {
		             System.out.println("No teacher found.");
		         } else {
		        	 List<Teacher> newTeachers = new ArrayList<>();
		        	 int j = 1; 
		        	 for (User teacher : teachers) {
		        	     if (teacher instanceof Teacher) {
		        	         Teacher t = (Teacher) teacher;
		        	         SchoolName school = c.getSchoolName(); 
		        	         
		        	         if (t.getSchool() != null && t.getSchool().equals(school)) {
		        	        	 newTeachers.add(t);
		        	             System.out.println(j + ": " + t.getUserName() + " (" + t.getSchool() + ")");
		        	             j++;
		        	         }
		        	     }
		        	 }
		             System.out.println("Teacher: ");
		             int q  = input.nextInt();
		             Teacher t = newTeachers.get(q-1);
		             Course existingCourse = DBContext.getCourseByName(c.getCourseName());
		             Teacher teach = DBContext.getTeacherByName(t.getUserName());
		             teach.addCourse(existingCourse);
		             existingCourse.enrollTeacher(t);
		             System.out.println("Teacher added");}
	    	 }
	    	else if(ty==2) {
	    		List<Lesson> lessons = c.getLessons();
	    		int k = 1;
	    		for(Lesson l:lessons) {
	    			System.out.println(k + ": " + l.getName());
	    			k++;
	    		}
	    		System.out.println("I chose:");
	    		int q = input.nextInt();
	    		Lesson l = lessons.get(q-1);
	    		if(l.getTeacher()!=null) {
	    			System.out.print("Этот урок уже преподает другой уччитель.Вы точно хотите это изменит?");
	    			System.out.print("1. Да");
	    			System.out.print("2. Нет");
	    			System.out.print("I chose:");
	    			int type = input.nextInt();
		    			if(type==1) {
		    				List<Teacher> teachers = c.getTeachers();
		    				int d = 1;
		    				for(Teacher teacher:teachers) {
		    					System.out.println(d+ ": "+ teacher.getUserName());
		    					d++;
		    				}
		    				System.out.print("I chose:");
		    				int type2 = input.nextInt();
		    				Teacher teacher = teachers.get(type2-1);
		    				Teacher teach = DBContext.getTeacherByName(teacher.getUserName());
		    				l.setTeacher(teacher);
		    				teach.addLesson(l);
		    				
		    			}
		    			else if(type == 2){
		    				menu();	}
		    		}
	    		else if(l.getTeacher()== null) {
	    			List<Teacher> teachers = c.getTeachers();
    				int d = 1;
    				for(Teacher teacher:teachers) {
    					System.out.println(d+ ": "+ teacher.getUserName());
    					d++;
    				}
    				System.out.println("I chose:");
    				int type2 = input.nextInt();
    				Teacher teacher = teachers.get(type2-1);
    				Course existingCourse = DBContext.getCourseByName(c.getCourseName());
    				
    				for (Lesson lesson : existingCourse.getLessons()) {
    				    if (lesson.getName().equals(l.getName())) {
    				        lesson.setTeacher(teacher); 
    				        teacher.addLesson(l);
    				        DBContext.saveCourses();
    				        System.out.println("Учитель успешно назначен на урок: " + lesson.getName());
    				        break;
    				    }
    				}
	    		}
	   
	    		}
	    	else System.out.println("Error");
	    		
	    	 
	    	
             
    	 menu();
             }
    	
    
    public static void teacherInLesson() {
    	List<Course> c = DBContext.getCourses();
    	for(Course course:c) {
    		System.out.println(course.getCourseName());
    		List<Lesson> l =  course.getLessons();
    		for(Lesson lesson:l) {
    			System.out.println(lesson.getTeacher());
    		}
    	}
    	
    	menu();
    }
    
    
    
    
    
    
    
    
    public static void viewStudentsInCourse() {
    	List<Course> courses = DBContext.getCourses();
    	for(Course c :courses) {
    		System.out.println(c.getStudents());
    	}
    	menu();
    }
    
    
    
    
    public static void TeacherInCourse() {
    	System.out.println("Loading courses...");
        var courses = DBContext.getCourses();

        if (courses == null || courses.isEmpty()) {
            System.out.println("No courses found.");
        } else {
        	int i =0;
            for (Course course : courses) {
            	if(course instanceof Course) {
            		i++;
            		System.out.println(i +": "+ course.getTeachers());}
            }
        }
        menu();
    }
    
    public static void viewStudentResearcherOffers() {
    	int num = 1;
    	for(Student student : DBContext.studentOffers) {
    		System.out.println(num + ". " + student.getUserName()+", year of study: "+student.getYearOfStudy());
    		num++;
    	}
    	
    	System.out.println("0. Quit\nOr select a student");
    	int option = input.nextInt();
    	if(option == 0) {
    		menu();
    	}
    	System.out.println("0. Quit\n1. Accept\n2. Reject");
    	
    	int answer = input.nextInt();
    	if(answer == 1) {
    		for(User user : DBContext.user) {
    			if(user instanceof Student) {
    				Student s = (Student) user;
    				if(s.equals(DBContext.studentOffers.get(option-1))) {
        				s.setStudentResearcher(new ResearcherDecorator(s));
        				DBContext.saveUsers();
        				DBContext.studentOffers.remove(option - 1);
        	    		DBContext.saveStudentOffers();
        				break;
        			}
    			}
    			
    		}
    	}else if(answer == 2) {
    		DBContext.studentOffers.remove(option - 1);
    		DBContext.saveStudentOffers();
    	}
    	menu();
    	
    }
    
    public static void viewComplaints() {
    	int num = 1;
    	for(var entry : DBContext.complaint.entrySet()) {
    		System.out.println(num + ". " + entry.getKey().getUserName() + ": " + entry.getValue());
    		num++;
    	}
    	menu();
    }
    
}