package views;

import java.util.*;

import DBs.DBContext;
import Users.User;
import controllers.UserController;
import enums.UserTypes;
import Users.Admin;
import Users.Student;
import Users.Teacher;

public class BaseView {

	private static Scanner in = new Scanner(System.in);

	public static void welcome() {
	    while (true) {
	        System.out.println("Welcome to WSP\nSelect your role: ");
	        System.out.println("0. Quit\n1. Admin\n2. Teacher\n3. Manager\n4. Finance Manager\n5. Student");
	        int option = getValidOption();

	        switch (option) {
	            case 0:
	                System.out.println("Goodbye!");
	                return;
	            case 1:
	                authorize(UserTypes.ADMIN);
	                break;
	            case 2:
	                authorize(UserTypes.TEACHER);
	                break;
	            case 3:
	            	authorize(UserTypes.MANAGER);
	                break;
	            case 4:
	            	authorize(UserTypes.FINANCE_MANAGER);
	            case 5:
	            	authorize(UserTypes.STUDENT);
	            default:
	                System.out.println("Invalid option. Try again.");
	        }
	    }
	}

	
	//AUTHORIZATION--------------------------
    public static void authorize(UserTypes userType) {
        System.out.println("Please, enter your credentials:");

        System.out.print("Username: ");
        String username = in.nextLine();

        System.out.print("Password: ");
        String password = in.nextLine();

        User authorized = UserController.authorize(userType, username, password);

        if (authorized != null) {
            switch (userType) {
                case ADMIN:
                    AdminView.welcome();
                    break;
                case TEACHER:
                	TeacherView.setTeacher(authorized);
                    TeacherView.menu();
                    break;
                case MANAGER:
                	ManagerView.setManager(authorized);
                	ManagerView.menu();
                case FINANCE_MANAGER:
                	FinanceManagerView.setFinanceManager(authorized);
                	FinanceManagerView.menu();
                case STUDENT:
                	StudentView.setStudent(authorized);
                	StudentView.menu();
                default:
                    System.out.println("Unknown user type.");
            }
        } else {
            System.out.println("Wrong login or password. Please try again.");
        }
    } 
    

    private static int getValidOption() {
        while (true) {
            try {
                return Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
	
}
