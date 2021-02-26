package com.project.userauthentication;

import java.util.Scanner;
public class Authentication {
	

	public static void main(String[] args) {
		Scanner sc	=ScannerInstance.getScannerInstance();
		
		do {
			System.out.println("Use option 1 for User creation");
			System.out.println("Use option 2 for User login");
			System.out.println("Use option 3 for all user info");
			System.out.println("other than any option will exit application");
			
			int option=sc.nextInt();
			
			switch(option){

			case 1:
				Users.addUser();
				break;

			case 2:
				Users.login();
				break;

			case 3:
				System.out.println(Users.getAllUser());
				
				break;
			default:
				// exit
				System.out.println(" Exist from application");
				sc.close();
				System.exit(1);

			}
			
			
			

		}while(true);
		
		
		
		
		
	/*	Users userDetails = new Users();
		Validation validate = new Validation();
		
		// FirstName
		String firstName = validate.validateFirstName();

		// LastName
		String lastName = validate.validateLastName();

		// EmailId
		String emailId = validate.validateEmail();

		// MobileNumber
		String mobileNumber = validate.validateMobileNumber();

		// UserId
		String userId = validate.validateUserId();
		// Password
		String password = validate.validatePassword();
		
		userDetails.addUser(firstName, lastName, emailId, mobileNumber, userId, password);
		
		

		System.out.println("Account Created Successfully");*/
		

	}
}
