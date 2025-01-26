package views;

import java.util.*;

import DBs.DBContext;
import Users.Employee;
import Users.FinanceManager;
import Users.User;

public class FinanceManagerView {

	private static FinanceManager financeManager;
	private static Scanner input = new Scanner(System.in);
	
	public static void setFinanceManager(User user) {
		if (user instanceof FinanceManager) {
            financeManager = (FinanceManager) user; 
            System.out.println("Finance Manager set successfully.");
        } else {
            System.out.println("Error: User is not a Finance Manager.");
        }
	}
	
	public static void menu() {
		System.out.println("Welcome, Finance Manager!");
		System.out.println("0. Exit\n1. Give a salary\n2. View total budget");
		int option = input.nextInt();
		
		if(option == 0) {
			BaseView.welcome();
		}else if(option == 1) {
			giveSalary();
		}else if(option == 2) {
			viewTotalBudget();
		}
	}
	
	public static void giveSalary() {
		System.out.println("0. Quit\n1. Give salary");
		int option = input.nextInt();
		if(option == 0) {
			menu();
		}else if(option == 1) {
			for(User user : DBContext.user) {
				if(user instanceof Employee) {
					financeManager.giveSalary((Employee)user);
				}
			}
			DBContext.saveUsers();
		}
		menu();
	}
	
	public static void viewTotalBudget() {
		System.out.println(financeManager.viewBudget());
		menu();
	}
	
}
