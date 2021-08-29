package com.greatlearning.service;

import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialService {
	public String generateEmailAddress( Employee emp ) {
		// generate email address and return it (use the emp getters to get the first name, last name and dept)
		// firstNamelastName@dept.abc.com
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + emp.getDepartment() + ".abc.com";
	}
	
	public String generatePassword() {
		Random random = new Random();
		
		// generate a random password of length 8 characters
		String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$*()?.=+^&*<>";
		
		char[] password = new char[8];
		
		for( int i = 0; i < 8; i++ ) {
			int idx = random.nextInt( allowedChars.length() ); // generates an integer between 0 - length of allowedChars string
			password[i] = allowedChars.charAt( idx );
		}
		
		return new String( password );
	}
	
	public void showCredentials( Employee emp, String email, String password ) {
		// print the employee name, email and password as shown in the word document
		System.out.println( "Dear " + emp.getFirstName() + " - here are your credentials" );
		System.out.println( "Email : " + email );
		System.out.println( "Password : " + password );
	}
}
