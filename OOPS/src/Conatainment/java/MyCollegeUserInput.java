package Conatainment.java;
import java.util.Scanner;

public class MyCollegeUserInput {
	static Scanner sc=new Scanner(System.in);
	void enterStudentDetails(Student s)
	{
		System.out.println("Enter student id:");
		s.setSid(sc.nextInt());
		
		System.out.println("Enter student name:");
		s.setName(sc.next());
		
		s.setCourse(new Course());
		''
		System.out.println("Enter course id:");
		s.getCourse().setCid(sc.nextInt());
		
		System.out.println("Enter course name:");
		s.getCourse().setCname("java");
		
		System.out.println("Enter course fees:");
		s.getCourse().setFees(sc.nextFloat());
		
	}
	public static void main(String args[])
	{
		MyCollegeUserInput college=new MyCollegeUserInput();
		Student s1=new Student();
		Student s2=new Student();
		college.enterStudentDetails(s1);
		college.enterStudentDetails(s2);
		
		System.out.println(s1);
		System.out.println(s2);
	}
			

}
