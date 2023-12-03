package com.greatlearning.services;

import java.util.Random;


import com.greatlearning.model.Employee;

public class CredentialServiceImpl implements CredentialService{
	

	@Override
	public String generatePassword() {
		
		String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String splchars = "!@#$%^&*()";
		
		String combined = capitals+lower+nums+splchars;
		String password = "";
		
		Random random = new Random();
		
		for(int i=1; i<=8; i++) {
			password = password + String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		
		return password;
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName,String department) {
		
	
		
		return firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".greatlearning.com";
		
		
	}

	@Override
	public void showCredentials(Employee e) {
		
		System.out.println("*****************************************************");
		
		System.out.println("Dear "+e.getFirstName()+ " "+e.getLastName()+ " your generated credentials are as follows:");
		
		System.out.println("Email    ---->" +e.getEmail());
		System.out.println("Password ---->" +e.getPassword());
		
		
	}

	

}
