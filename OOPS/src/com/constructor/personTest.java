package com.constructor;

class Person {

	private int id;
	private String name;
	private int age;

	// Constructor is a special method in java used to initialize the instance
	// variable
	// int : 0
	// String :null
	// float: 0.0

	// JVM : default constructor

	// same name of class
	// no return type not even void : return current class instance/object

	public Person() {
		id = 100;
		name = "Unknown";
		age = 18;
	}

	public String toString() {
		return id + " " + name + " " + age;
	}

}

public class personTest {
	public static void main(String[] args) {

		personTest p = new personTest();
		System.out.println(p);

	}

}
