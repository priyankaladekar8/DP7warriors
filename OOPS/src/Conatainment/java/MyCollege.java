package Conatainment.java;

public class MyCollege {
	
	public static void main(String args[])
	{
		Course c1=new Course(101, "java", 23000f);
		Course c2=new Course(102,"python",250000f);
		Course c3=new Course(103,".net",340000f);
		
		Student s1=new Student( 1,"priyanka" ,c1);
		Student s2=new Student( 2,"dipti" ,c2);
		Student s3=new Student( 3,"pratiksha" ,c3);
		Student s4=new Student( 4,"harshada" ,c1);
		Student s5=new Student( 5,"neha" ,c2);
		Student s6=new Student( 6,"shradha" ,c3);
		
		
		System.out.println(s1);
		System.out.println("----------------");
		System.out.println(s2);
		System.out.println("-----------------");
		System.out.println(s3);
		System.out.println("-----------------");
		System.out.println(s4);
		System.out.println("------------------");
	    System.out.println(s5);
	    System.out.println("-------------------");
	    System.out.println(s6);
  }
	
	}
	


