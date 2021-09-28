package com.myproject.advanceJava;

public class EmployeeAgeException extends Exception {
	private static final long serialVersionUID = 362524981480868099L;
	private static int minAge = 17;
	public EmployeeAgeException(int age) {
		// TODO Auto-generated constructor stub
		super(" Must be at least 17 years old to " + "Work in high level industries !! You have " + (minAge - age) 
				+ " years to wait sadly!! :");
		
	}
	
	public EmployeeAgeException() {
		super("Employee Id not less than 1");
	}

}
