  package com.myproject.advanceJava;

public class CompanyClass {
	
	private String name;
	private String department;
	private int size;
	
	
	
	public CompanyClass()
	{
		this("N/A","N/A", -1);
	}
	
	public CompanyClass(String name, String department, int size) {
		this.name = name;
		this.department = department;
		//this.employee = new Employee[25];
	}

	public int getEmployeeSize() {
		return size;
	}

	public void setEmployeeSize(int size) {
		this.size = size;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String Department) {
		this.department = Department;
	}

	public String getCompanyName() {
		return name;
	}

	public void setCompanyName(String Name) {
		this.name = Name;
	}
   
	// Get, add, and delete Employee
	
	//
	
	/** private int indexOfEmployee(int id) {
		for(int e = 0; e < employee.length; e++) {
			if(employee[e] == null) { 
				//check first  not null
				continue;
			}
			else if(employee[e].getEmployeeId() == id) {
				return e;
			}
			
		}
		return -1;
	}
	*/
	
	// get employee
	
	/**
	public Employee getEmployee(int id) {
		  int index = indexOfEmployee(id);
		  
		  if(index  != -1) {
			  return employee[index];
		  }
		  return null;
	  }
	  */
	/**
	  // add new employee
	     public Employee addEmployee(Employee newEmployee) {
	    	  if(size == employee.length) {
	    		  return null;
	    	  }
	    	  
	    	  if(getEmployee(newEmployee.getEmployeeId()) == null) {
	    		  
	    			  for(int e = 0; e <employee.length; e++) {
	    				  if(employee[e] == null) {
	    					  employee[e] = newEmployee;
	    					  size++;
	    					  return newEmployee;
	    				  }
	    			  }
	    	  }
	    	  return null;
	     }
	     */
	/**
	// delete employee
	     public Employee removeEmployee(int id) {
	    	 
	    	 int index = indexOfEmployee(id);
	    	 
	    	 if(index != -1) {
	    		 Employee temp = employee[index];
	    		 employee[index] = null;
	    		 size--;
	    		 return temp;
	    	 }
	    	 return null;
	     }
	     */
	 // print Employee in
	     /**
	     public void listEmployee() {
	    	  
	    	 if(size == 0) {
	    		 System.out.println("No employee in " + department);
	    	 }
	    	 else {
	    		 for(Employee e : employee) {
	    			 if(e != null) {
	    				 System.out.println(e);
	    			 }
	    		 }
	    	 }
	     }
        */
	     @Override
	 	public String toString() {
	 		return "CompanyClass [name=" + name + ", department=" + department + "]";
	 	}
}
