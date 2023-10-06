package com.encapsulation;  //EmployeeofBank 

public class Employee{
		
		public static void main(String args[]) 
		{
			
			
			
			 Employee e1 = new Employee();
			// implicit // hard core values
			
			e1.setEmployeeId(101);
	        e1.setEname("priyanka");
	        e1.setSalary(50,000);
	        e1.setDesignation("PO");
	        
	        System.out.println(e1.getEmployeeId()+"  "+e1.getEname()+"  "+e1.getSalary()+""+e1.getDesignation());
			//b1.display();
	        
	        // Ctrl+Shift+t ---- open any class
	        // Ctrl+O  ---> open method inside it
	        
	        System.out.println(e1); // hashcode
	        
	        
		}

	}




