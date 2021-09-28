package com.myproject.advanceJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
// import java.nio.file.Files;
// import java.util.ArrayList;
import java.util.List;
//import java.io.BufferedReader;
//import java.util.List;
import java.util.Scanner;



public class EmployeeMain {

	public static Scanner in = new Scanner(System.in);
	private static List <Employee> employees;
	private static final String FIELD_SEP  = "\t";
	private static final String employeefile = "resources/employee.txt";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		       
			// File employeefile = new File ("resources/employee.txt");
			    
			    	 System.out.println("-----------------------------------------------");
			    	 System.out.println("<== Welcome to Employee Managment System  ==> ");
			    	 System.out.println("------------------------------------------------");
			         //choice = (int) System.in.read();
			          
			    	 displayMenu();
			          
			    	 
			    	 String choice = "";
					
				 
			    	 while(!choice.equalsIgnoreCase("List")) {
			    		   
			    		 //get the input from the user
			    		 
			    		 System.out.println("Enter Choice:");
			    		 choice = in.next();
			    		 System.out.println("");
			    		 
			    		 if(choice.equalsIgnoreCase("List")) {
			    			  displayAllEmployee();
			    		 } else if(choice.equalsIgnoreCase("Add")) {
			    			 addEmployee();
			    		 } else if (choice.equalsIgnoreCase("Edit")) {
			    			  deleteEmployee();
			    		 } else if(choice.equalsIgnoreCase("Exit")) {
			    			 System.out.println("Bye.\n");
			    		 }
			    		 else {
			    			 System.out.println("Error! not a valid command.\n");
			    		 }
			    	 }
			 		
			    	
			 		   // choice = in.nextInt();
			 		   // System.out.println("");
			 				  
			    	
	        
	}




	public static void displayMenu() {
		
		
		
   	    System.out.println(" Employee Menu ");
   	    System.out.println("");
   	    System.out.println("1. List - Display List of Employees");
		System.out.println("2. Add -  Add a New Employee");
		System.out.println("3. Delete -Delete Employee");
		System.out.println("4. Exit - Exit this application");
		System.out.println("Enter option ?:");

	}
		 
	 /**	
	  * 
	   for(Employee e: empList) {
			System.out.println(e.getEmployeeId());
		}
	 * @throws IOException 
	**/
	
	
	
	public static void addEmployee() throws IOException {
		  String name,gender, department;
		  int number, age;
		  double salary;
		  
		  
		  System.out.println("Add employee information here");
		  System.out.println("Enter Name:");
		  name = in.next();
		  System.out.println("Gender:");
		  gender = in.next();
		  System.out.println("Department:");
		  department = in.next();
		  System.out.println("Number:");
		  number = in.nextInt();
		  System.out.println("Age:");
		  age = in.nextInt();
		  System.out.println("Salary:");
		  salary = in.nextDouble();
		  
		  
		  Employee employee = new Employee();
		  employee.setName(name);
		  employee.setGender(gender);
		  employee.setDepartment(department);
		  employee.setNumber(number);
		  employee.setAge(age);
		  employee.setSalary(salary);
		 
		  
          EmployeeMain.add(employee);
          System.out.println("");
          System.out.println(name + "" + gender + " " + department + "" + number + "" + age + ""
        		                  + salary + " "  + " has been added.\n"); 
      }
	
	
	public static void deleteEmployee() throws IOException {
		  
		
		
		System.out.println("Enter name to delete:");
		String name = in.next();
		
		Employee employee = EmployeeMain.getEmployee(name);
		
		if(employee == null) {
			System.out.println("\nError! Unable to get product.");
			
		}else {
			EmployeeMain.delete(employee);
			System.out.println("\n" + employee.getName()  
			                   + " was delete from the file");
		}
		
	}
	
	
	// read record from file and display only records 
	
	
	public static void displayAllEmployee() {
		
		 
		 //File efile = new File(fileName);
		
		try(FileReader fileReader = new FileReader(employeefile);
			 BufferedReader reader = new BufferedReader(fileReader);){
			
			System.out.println("<== CONTENTS OF 'employee.txt ==>\n");
			// System.out.printf("%-10s%-12s%-10s% -10s%12s%10s%n", "Employee ID","Name", "Gender", "Department","Contact","Age", "Salary","JobStandard");
			System.out.println("------------------------------------------------------");
			
			//while(input.hasNext())
			// {
			//	System.out.printf("%-10s%-12s%-12s%10.2f%n", input.nextInt(), input.next(),input.next(), input.next(),input.nextInt(), input.nextInt(), input.nextDouble(), input.next() );
			// }
			
			String line;
		   // List<String> emptemps = new ArrayList<String>();
			while ((line = reader.readLine()) != null) {
				
				System.out.println(line);
				// emptemps.add(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("EXCEPTION could not find file");
		} catch (IOException e) {
			System.out.println("EXCEPTION could not read character");
		} 
		  System.exit(1);
	}
	
	
	//
    
	 public static Employee getEmployee(String name) throws IOException {
   	  
   	 //  employees = getAll();
   	   for(Employee e : employees) {
   		   if(e.getName().equals(name)) {
   			   return e;
   		   }
   	   }
   	   return null;
     }

	private static boolean saveAll() throws IOException {
		
	 //employees = getAll();
   	  try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(employeefile)))){
   		  
   		  // Write all employee in the array list to the file
   		  
   		   for(Employee e: employees) {
   			   out.print(e.getName() + FIELD_SEP);
   			   out.print(e.getGender() +  FIELD_SEP);
   			   out.print(e.getDepartment() + FIELD_SEP);
   			   out.print(e.getNumber() + FIELD_SEP);
   			   out.print(e.getAge() + FIELD_SEP);
   			   out.print(e.getSalary() + FIELD_SEP);
   			   out.print(e.getJobStandard() + FIELD_SEP);
   		   }
   	  } catch(IOException e) {
   		    System.out.println(e);
   		    return false;
   	  }
   	  return true;
     }
     

      public static boolean add(Employee e) throws IOException {
   	   
   	  // employees = getAll();
   	    employees.add(e);
   	    return saveAll();
      }
      
      public static boolean delete(Employee e) throws IOException {
   	        // employees = getAll();
   	        employees.remove(e);
   	        return saveAll();
      }
      
      public static boolean update(Employee newEmployee) throws IOException {
   	   
   	   // get the old employee and remove it
   	   
   	     //   employees = getAll();
   	        
   	       Employee oldEmployee = getEmployee(newEmployee.getName());
   	       int inx = employees.indexOf(oldEmployee);
   	       employees.remove(inx);
   	       
   	       //add the update products
   	       
   	       employees.add(inx, newEmployee);
   	       
   	       return saveAll();
      }
	
	
	
	/**
      public static List<Employee> getAll() {
    	  
     	 if(employees != null) {
     		  return employees;
     	 }
     	 
     	 employees = new ArrayList<>();
     	 if(Files.exists(employeesPath)) {
     		  
     		 try(BufferedReader reader = new BufferedReader(new FileReader(employeesFile))){
     			 
     			 // read all employee stored in the file into the array list
     			 
     			  String line = reader.readLine();
     			  while(line != null) {
     				String[] columns = line.split(FIELD_SEP);
     				
     				  String name = columns[0];
     				  String gender = columns[1];
     				  String department  = columns[2];
     				  String contact    = columns[3];
     				  String age  = columns[4];
     				  String salary = columns[5];
     				  String JobStandard = columns[6];
     				  
     				  Employee e = new Employee();
     				  e.setName(name);
     				  e.setGender(gender);
     				  e.setDepartment(department);
     				  e.setContact(Integer.parseInt(contact));
     				  e.setAge(Integer.parseInt(age));
     				  e.setSalary(Double.parseDouble(salary));
     				  e.setJobStandard(JobStandard(JobStandard));
     				  employees.add(e);
     				  
     				  
     				  
     				  line = reader.readLine();
     			  }
     		 } catch(IOException e) {
     			    System.out.println(e);
     			    return null;
     		 }
     	 }
     	 return employees;
     }
	*/
      
      /**
 	 public static void displayAllEmployee() throws IOException {
 		
 		System.out.println("Employee List ");
 		
 		List<Employee> employees1;
 		employees1 = EmployeeIO.getAll();
 		Employee e;
 		StringBuilder sb = new StringBuilder();
 		for(Employee empl : employees1) {
 			 e = empl;
 			 sb.append(e.getName());
 			 sb.append(e.getGender());
 			 sb.append(e.getDepartment());
 			 sb.append(e.getContact());
 			 sb.append(e.getAge());
 			 sb.append(e.getSalary());
 			 sb.append(e.getJobStandard());
 			 
 		}
 		System.out.println(sb.toString());
 	 }
 	 */
	
	
}
