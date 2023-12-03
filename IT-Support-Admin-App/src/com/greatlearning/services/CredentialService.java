package com.greatlearning.services;

import com.greatlearning.model.Employee;

public interface CredentialService {
	
	String generatePassword();
	String generateEmailAddress(String firstName, String lastName, String department);
	void showCredentials(Employee e);
	


}
