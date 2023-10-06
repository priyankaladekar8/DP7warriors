package com.constructor;

// Calling one constructor from another constructor with respect to current object

// done through this() ... with the same class

// duplicate code removal

class Test {
	int a;
	int b;
	String name;

	Test() {
		System.out.println("Default constructor");
		this.a = 10;
		this.b = 20;
		this.name = "unknown";
		System.out.println("Task has to be done everytime");
	}

	Test(int a, int b) {
		this();
		System.out.println("Param constructor 1");
		this.a = a;
		this.b = b;

	}

	Test(int a, int b, String name) {
		this();
		System.out.println("Param constructor 2");
		this.a = a;
		this.b = b;
		this.name = name;
	}

	public String toString() {
		return " a:" + a + "\n b:" + b + "\n name:" + name;
	}

}

public class ConstructorChaning2 {

	public static void main(String[] args) {

		System.out.println("------------------------------------------");
		Test d1 = new Test();
		System.out.println(d1);

		System.out.println("------------------------------------------");
		Test d2 = new Test(30, 40);
		System.out.println(d2);

		System.out.println("------------------------------------------");
		Test d3 = new Test(100, 200, "Shuruti");
		System.out.println(d3);

		// to assign the task that has to be done while each object creation

	}

}
