package DBs;

import java.io.File;
import java.util.*;

import OOPproject.ResearchProject;
import Users.FinanceManager;
import Users.Manager;
import Users.Student;
import Users.Teacher;
import Users.User;
import enums.SchoolName;
import model.Course;
import model.CourseApplication;
import model.Lesson;

public class DBContext {

	private static final String fullPath = "/Users/apple/Desktop/OOP_project_WSP/OOPprojectMain/appli/appli/src/files/";
	public static String getFullPath() {
		return fullPath;
	}
    private static DBContext db = new DBContext();
    
    public static Vector<User> user;
    public static Vector<Course>course;
    public static Vector<CourseApplication>application;
    public static Vector<Student> studentOffers;
    public static Vector<ResearchProject> projects;
    public static Map<Student,String> complaint;
    
    static {
        user = getUsers();
        if(user == null) user = new Vector<>();

        course = getCourses();
        if(course == null) course = new Vector<>();
        
        application = getApplications();
        if(application == null) application = new Vector<>();
        
        studentOffers = getStudentOffers();
        if(studentOffers == null) studentOffers = new Vector<>();
        
        projects = getProjects();
        if(projects == null) projects = new Vector<>();
        
        complaint = getComplaints();
        if(complaint == null) complaint = new HashMap<>();
    }

    private DBContext() {}

    public static Vector<User> getUsers(){
    	Object o = ReaderWriter.deserialize(fullPath + "user.txt");
        if (o instanceof Vector) {
            return (Vector<User>) o;
        }
        return new Vector<>(); 
    }
    
    public static Vector<Course> getCourses(){
    	Object o = ReaderWriter.deserialize(fullPath + "course.txt");
        if (o instanceof Vector) {
            return (Vector<Course>) o;
        }
        return new Vector<>(); 
    }
    
    public static Vector<CourseApplication> getApplications(){
    	Object o = ReaderWriter.deserialize(fullPath + "application.txt");
        if (o instanceof Vector) {
            return (Vector<CourseApplication>) o;
        }
        return new Vector<>(); 
    }
    
    public static Vector<Student> getStudentOffers(){
    	Object o = ReaderWriter.deserialize(fullPath + "studentOffers.txt");
        if (o instanceof Vector) {
            return (Vector<Student>) o;
        }
        return new Vector<>(); 
    }
    
    public static Vector<ResearchProject> getProjects(){
    	Object o = ReaderWriter.deserialize(fullPath + "projects.txt");
        if (o instanceof Vector) {
            return (Vector<ResearchProject>) o;
        }
        return new Vector<>(); 
    }
    
    public static Map<Student, String> getComplaints(){
    	Object o = ReaderWriter.deserialize(fullPath + "complaints.txt");
        if (o instanceof Vector) {
            return (Map<Student, String>) o;
        }
        return new HashMap<>(); 
    }

    
    
    
    public static boolean saveUsers() {
    	return ReaderWriter.serialize(user, fullPath + "user.txt");
    }
    public static boolean saveCourses() {
    	return ReaderWriter.serialize(course, fullPath + "course.txt");
    }
    public static boolean saveApplications() {
    	return ReaderWriter.serialize(application, fullPath + "application.txt");
    }
    public static boolean saveStudentOffers() {
    	return ReaderWriter.serialize(studentOffers, fullPath + "studentOffers.txt");
    }
    public static boolean saveProjects() {
    	return ReaderWriter.serialize(projects, fullPath + "projects.txt");
    }
    public static boolean saveComplaint() {
    	return ReaderWriter.serialize(complaint, fullPath + "complaints.txt");
    }
    
    
    public static Course getCourseByName(String name) {
        return course.stream()
                      .filter(c -> c.getCourseName().equals(name))
                      .findFirst()
                      .orElse(null);
    }
    
    public static Course getLessonByName(String name) {
        return course.stream()
                      .filter(c -> c.getLessons().get(0).getName().equals(name))
                      .findFirst()
                      .orElse(null);
    }

    public static Student getStudentByName(String name) {
        return (Student) user.stream()
                       .filter(s -> s.getUserName().equals(name))
                       .findFirst()
                       .orElse(null);
    }
    
    public static Teacher getTeacherByName(String name) {
        return (Teacher) user.stream()
                       .filter(s -> s.getUserName().equals(name))
                       .findFirst()
                       .orElse(null);
    }
    
    public static User getUserByName(String email) {
    		
    			 return user.stream()
                         .filter(s -> s.getUserName().equals(email))
                         .findFirst()
                         .orElse(null);
    		
    
    }
    
//    public static Teacher getTeacherBySchool(SchoolName school) {
//        return (Teacher) user.stream()
//                       .filter(s -> s.g().equals(name))
//                       .findFirst()
//                       .orElse(null);
//    }


    public static DBContext getDb() {
        return db;
    }
    
    
}
