package com.parameterized;

class Student {
	private int id;
	private String name;
	private int age;

	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return id + " " + name + "" + age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public class ParaConstructor {
		public static void main(String args[]) {
			// early intialization
			Student s1 = new Student (101, "shivani", 23);
			Student s2 = new Student (102, "vikas", 24);
			Student s3 = new Student (103, "priyanka", 27);

			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);

			// lazy initilization

			Student s4 = new Student();
			s4.setId(104);
			s4.setName("Dipti");
			s4.setAge(23);

			System.out.println(s4);
		}
	}
}
