package model;

import Users.Admin;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Admin admin = Admin.getInstance();
		
		while(true) {
			System.out.println("Enter 0 to quit\nEnter 1 to login as Admin\nEnter 2 to login as Manager\nEnter 3 to login as Teacher"
					+ "\nEnter 4 to login as Student\nEnter 5 to login as Finance Manager");
			int command = input.nextInt();
			if(command == 0) {
				break;
			}
			if(command == 1) {
				System.out.print("Enter email here: ");
				System.out.println();
				System.out.print("Enter password here: ");
				System.out.println();
				
//				if() {
//					
//				}
				
				System.out.println("Welcome to Admin menu");
				System.out.println("Enter 0 to 'quit'\nEnter 1 to add User\nEnter 2 to remove User\nEnter 3 to view all Users");
				int adminCommand = input.nextInt();
				if(adminCommand == 0) {
					continue;
				}
				while(true) {
					if(adminCommand == 1) {
						while(true) {
							int adminAddCommand = input.nextInt();
							System.out.println("Enter 0 to quit from adding process\nEnter 1 to add User");
							if(adminAddCommand == 0) {
								break;
							}else if(adminAddCommand == 1) {
								String email = input.nextLine();
								String password = input.nextLine();
							}
						}
						
						
					}
				}
			}
			
		}

	}

}
