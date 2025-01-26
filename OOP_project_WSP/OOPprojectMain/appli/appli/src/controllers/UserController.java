package controllers;

import java.util.*;

import DBs.DBContext;
import Users.Manager;
import Users.Student;
import Users.Teacher;
import Users.Admin;
import Users.FinanceManager;
import Users.User;
import enums.SchoolName;
import enums.UserTypes;
import model.Semester;

public class UserController {

	//CREATIONS----------
	public static boolean createUser(String username, String password, UserTypes type) {
        switch (type) {
            case TEACHER:
                Teacher newTeacher = new Teacher(username, password);
                DBContext.user.add(newTeacher);
                return DBContext.saveUsers();
            case STUDENT:
			Semester firstSemester = new Semester(SchoolName.SITE,1,21);
			Student newStudent = new Student(username, password,firstSemester);
            	DBContext.user.add(newStudent);
            	return DBContext.saveUsers();
            case MANAGER:
            	Manager newManager = new Manager(username,password, null);
            	DBContext.user.add(newManager);
            	return DBContext.saveUsers();
            case FINANCE_MANAGER:
            	FinanceManager newFinanceManager = new FinanceManager(username,password);
            	DBContext.user.add(newFinanceManager);
            	return DBContext.saveUsers();
            default:
                return false;
        }
    }
	
	//DELETIONS---------------
	public static boolean removeUser(String username, String password) {
//		Vector<User> users = DBContext.getUsers();
		for(User user : DBContext.user) {
			if(user.getUserName().equals(username) && user.getPassword().equals(password)) {
				DBContext.user.remove(user);
				DBContext.saveUsers();
			}
		}
        System.out.println("Deletions failed for user: " + username);
        return false;
	}
	
	
	//AUTHORIZE----------
    public static User authorize(UserTypes userType, String username, String password) {
    	
    	switch(userType) {
    	case ADMIN:
    		if(username.equals(Admin.getInstance().getUserName()) && password.equals(Admin.getInstance().getPassword())) {
    			return Admin.getInstance();
    		}
    	}
    	
        Vector<User> users = DBContext.getUsers();

        if (users == null || users.isEmpty()) {
            System.out.println("No users found for type: " + userType);
            return null;
        }

        for (User user : users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }

        System.out.println("Authorization failed for user: " + username);
        return null;
    }

	public static boolean createUser(String email, String password, int id, UserTypes student) {
		// TODO Auto-generated method stub
		return false;
	}

    
//    private static Vector<? extends User> getUsers(UserTypes userType) {
//        switch (userType) {
//            case TEACHER:
//                return DBContext.getTeachers();
//            case STUDENT:
//            	return DBContext.getStudents();
//            case MANAGER:
//            	return DBContext.getManagers();
//            case FINANCE_MANAGER:
//            	return DBContext.getFinanceManagers();
//            default:
//                return null;
//        }
//    }
	
}
