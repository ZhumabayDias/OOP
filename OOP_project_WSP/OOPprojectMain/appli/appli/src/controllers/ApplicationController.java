package controllers;

import java.util.Iterator;

import DBs.DBContext;
import Users.Student;
import Users.User;
import enums.CourseType;
import enums.SchoolName;
import model.Course;
import model.CourseApplication;

public class ApplicationController {
	public static boolean createApplication(Student s,Course c) {
		CourseApplication ca = new CourseApplication(s,c);
		
		DBContext.application.add(ca);
        return DBContext.saveApplications();
	}
	
	
	public static boolean removeApplication(Student s,Course c) {
//		Vector<User> users = DBContext.getUsers();
		for(CourseApplication application : DBContext.application) {
			if(application.getCourse().equals(c) && application.getStudent().equals(s)) {
				DBContext.application.remove(application);
				DBContext.saveApplications();
				System.out.println("Succesfully");
				return true;
			}
		}
        System.out.println("Deletions failed for user: " + s);
        return false;
	}
	}
