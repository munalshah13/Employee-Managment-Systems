package com.myproject.advanceJava;



//import java.io.Serializable;


import com.myproject.advanceJava.EnumEployee.JobStandard;




public class Employee {

	/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;


	//private static int idCounter = 1; //keep track of ids for employee
	
	
    private String name;
    private String gender;
    private String department;
    private int number;
    private int age;
    private double salary;
    private JobStandard jobStandard;



   
    
    
	
    
	//Default Constructor
	
	//Constructor
    
	public Employee( String name,String gender, String department, int number,int age, double salary, JobStandard jobStandard) {
		// TODO Auto-generated constructor stub
		super();
		
		if(name == null) {
			 throw new NullPointerException("Employee name cannot be null");
		}
		
		
		
		this.name = name;
		this.gender = gender;
		this.setDepartment(department);
		this.number = number;
		setAge(age);
		this.salary = salary;
		this.jobStandard = jobStandard;
		
		
		
	}
	
	

	public Employee() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

    
	public int getNumber() {
		return  number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public JobStandard getJobStandard() {
		return jobStandard;
	}

	public void setJobStandard(JobStandard jobStandard) {
		this.jobStandard = jobStandard;
	}
	
	
	
	public String toString() {

		return "Employee [ name=" + name + ", gender = " + gender + ",   department=" + department + ", Number = " + number +",  age = " + age + ", Salary = " + salary + ", JobStandard = " + jobStandard + "]";

	}



	

	
}

