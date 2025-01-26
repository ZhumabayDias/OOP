package views;

import java.util.*;

import DBs.DBContext;
import controllers.UserController;
import enums.UserTypes;
import Users.Admin;
import Users.FinanceManager;
import Users.Manager;
import Users.Student;
import Users.Teacher;
import Users.User;

public class AdminView {
	
	private static Scanner input = new Scanner(System.in);

    public static void welcome() {
        System.out.println("Welcome to Admin screen!");
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("0. Quit\n1. Create User\n2. Remove User\n3. View Users");
            int option = input.nextInt();

            if (option == 0) {
                BaseView.welcome();
            } else if (option == 1) {
                createUser();
            }else if(option == 2) {
            	removeUser();
            }else if(option == 3) {
            	viewUser();
            }
        }
    }
    
    //DELETIONS---------------------------
    public static void removeUser() {
    	System.out.println("Enter 0 to quit\n1. Teacher\n2. Student\n3. Manager\n4. Finance Manager");
        int optionCreate = input.nextInt();
        input.nextLine(); 

        if (optionCreate == 0) {
            return;
        }
        
        System.out.print("User email: ");
        String email = input.nextLine();

        System.out.print("User password: ");
        String password = input.nextLine();

        if (optionCreate == 1) {
        	UserController.removeUser(email, password);
        }else if(optionCreate == 2) {
        	UserController.removeUser(email, password);
        }else if(optionCreate == 3) {
        	UserController.removeUser(email, password);
        }else if(optionCreate == 4) {
        	UserController.removeUser(email, password);
        }
        removeUser();
    }

    
    //CREATIONS---------------------------
    private static void createUser() {
        System.out.println("0. Quit\n1. Teacher\n2. Student\n3. Manager\n4. Finance Manager");
        int optionCreate = input.nextInt();
        input.nextLine(); 

        if (optionCreate == 0) {
            return;
        }

        System.out.print("User email: ");
        String email = input.nextLine();

        System.out.print("User password: ");
        String password = input.nextLine();

        if (optionCreate == 1) {
            boolean result = UserController.createUser(email, password, UserTypes.TEACHER);
            System.out.println(result ? "Teacher created successfully." : "Failed to create teacher.");
        }else if(optionCreate == 2) {
        	boolean result = UserController.createUser(email, password, UserTypes.STUDENT);
            System.out.println(result ? "Student created successfully." : "Failed to create student.");
        }else if(optionCreate == 3) {
        	boolean result = UserController.createUser(email, password, UserTypes.MANAGER);
            System.out.println(result ? "Manager created successfully." : "Failed to create manager.");
        }else if(optionCreate == 4) {
        	boolean result = UserController.createUser(email, password, UserTypes.FINANCE_MANAGER);
            System.out.println(result ? "Finance Manager created successfully." : "Failed to create finance manager.");
        }
    }
    
    public static void viewUser() {
    	System.out.println("0. Quit\n1. Teacher\n2. Student\n3. Manager\n4. Finance Manager\n5. All Users");
        int optionCreate = input.nextInt();
        input.nextLine(); 
        if (optionCreate == 1) {
            viewTeacher();
        }else if(optionCreate == 2) {
        	viewStudent();
        }else if(optionCreate == 3) {
        	viewManager();
        }else if(optionCreate == 4) {
        	viewFinanceManager();
        }else if(optionCreate == 5){
        	viewAllUsers();
        }else if(optionCreate == 0) {
        	menu();
        }
    }
    
    public static void viewTeacher() {
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
        viewUser();
    }
    
    public static void viewStudent() {
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
        viewUser();
    }
    
    public static void viewManager() {
    	System.out.println("Loading manager...");
        var managers = DBContext.getUsers();

        if (managers == null || managers.isEmpty()) {
            System.out.println("No manager found.");
        } else {
            for (User manager : managers) {
            	if(manager instanceof Manager) {
            		System.out.println(manager.getUserName());
            	}
            }
        }
        System.out.println();
        viewUser();
    }
    
    public static void viewFinanceManager() {
    	System.out.println("Loading finance manager...");
        var financeManagers = DBContext.getUsers();

        if (financeManagers == null || financeManagers.isEmpty()) {
            System.out.println("No finance manager found.");
        } else {
            for (User financeManager : financeManagers) {
            	if(financeManager instanceof FinanceManager) {
            		System.out.println(financeManager.getUserName());
            	}
            }
        }
        System.out.println();
        viewUser();
    }
    
    public static void viewAllUsers() {
    	System.out.println("Loading users...");
        var users = DBContext.getUsers();

        if (users == null || users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            for (User user : users) {
                System.out.println(user.getUserName());
            }
        }
        System.out.println();
        viewUser();
    }
	
}
