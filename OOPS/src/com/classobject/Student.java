package com.classobject;

public class Student {

	int stuid;
	String name;
	float marks;

	void display() {
		System.out.println(stuid + " " + name + " " + marks);
	}

	public static void main(String args[]) {
		Student s1 = new Student();
		s1.stuid=101;
		s1.name="priyanka";
		s1.marks=78;
		
		
		
		s1.display();
		
	}

}
