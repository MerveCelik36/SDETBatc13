package com.syntaxclass12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*Store username, password and confirm password from a user and check following requirements:
*Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
*Password should be minimum 8 characters, if less → message=”Password is too short”.

*Password cannot contain username if so, → message=”Password cannot contain username”.
*Password should match confirmed password, if not  → message=“Passwords do not match”.
*Only after all requirements met → message “Your username and password has been created”

		*/ Scanner scan= new Scanner(System.in);
		String userName=scan.nextLine() ;
		String password=scan.nextLine();
		String confirmPassword=scan.nextLine();
		if (userName.isEmpty() && password.isEmpty()) {
			System.out.println("User name and password cannot be empty.");}
			else if(password.length()< 8) {
				System.out.println("Password is too short");}
			else if ( userName.contains(password)) {
				System.out.println("Password cannot conatine username");}
			else if (!password.equals(confirmPassword)) {
				System.out.println("Password do not match");}
			else{System.out.println("Your username and password has been created");}
				
		
				
			

	}

}
