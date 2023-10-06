package com.finalDemo;

class Student {
	String name;
	int id;
	final int adharNumbe;

	{

		adharNumbe = 12456;
	}
	public Student() {
		
	}
	

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

public class ClassRoom {
	public static void main(String arsg[]) 
	{
		Student s = new Student();
		System.out.println(s.name+" "+s.id+" "+s.adharNumbe);
		s.setName("priyanka");
		s.setId(101);
	
		
		
	}
}


	// TODO Auto-generated method stub
	
}




