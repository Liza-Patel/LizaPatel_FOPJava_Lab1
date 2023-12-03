package com.greatlearning.AdminApp;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialServiceImpl;

public class AdminApp extends CredentialServiceImpl {

	public static void main(String[] args) {
		
		CredentialServiceImpl obj1 = new CredentialServiceImpl();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = scanner.next();
		
		System.out.println("Enter last name: ");
		String lastName = scanner.next();

		int choice;
		
		String email = "";
		String password = "";

			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			System.out.println("5. Exit");
			
			
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1: email = obj1.generateEmailAddress(firstName, lastName, "tech");
	
			break;
			
			case 2: email = obj1.generateEmailAddress(firstName, lastName, "admin");
		
			break;
			
			case 3: email = obj1.generateEmailAddress(firstName, lastName, "hr");
	
			break;
			
			case 4: email = obj1.generateEmailAddress(firstName, lastName, "legal");
			break;
			
			case 5: System.out.println("Exited application");
			System.exit(0);
			
			default: System.out.println("Please enter valid choice");
			
			}
			
			password = obj1.generatePassword();
			
			
			Employee employee = new Employee();
			employee.setFirstName(firstName);
			employee.setLastName(lastName);
			employee.setEmail(email);
			employee.setPassword(password);
			obj1.showCredentials(employee);
	
	}

}
