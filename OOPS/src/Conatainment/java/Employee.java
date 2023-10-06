package Conatainment.java;

public class Employee {
	
		
		public static void main(String args[])
		{
			Department d1=new Department("devloper", "IT", 8177819);
			Department d2=new Department("clerk","Bank",7678896);
			Department d3=new Department("teacher","school",9876565);
			
			Person p1=new Person( 1,"priyanka" , 25000f, d1);
			Person p2=new Person( 2,"dipti" ,34000f,d2);
			Person p3=new Person( 3,"pratiksha" ,45000f,d3);
			Person p4=new Person( 4,"harshada" ,27000f,d1);
			Person p5=new Person( 5,"neha" ,45000f,d2);
			Person p6=new Person( 6,"shradha" ,56000f,d3);
			
			
			System.out.println(p1);
			System.out.println("----------------");
			System.out.println(p2);
			System.out.println("-----------------");
			System.out.println(p3);
			System.out.println("-----------------");
			System.out.println(p4);
			System.out.println("------------------");
		    System.out.println(p5);
		    System.out.println("-------------------");
		    System.out.println(p6);
	  }
		
		}
		





