package com.constructor;

class Customer {

	int id;
	String name;
	float balance;

	Customer() {
		this(101, "priyanka");// 2) Constr chaining
	}

	Customer(int id, String name)
	// 1)In parameterized constructor to differentiate b/w local and instance
	// variable
	{
		this.id = id;
		this.name = name;

	}

	void display() {
		String name = "priyanka";
		System.out.println(name);
		System.out.println(this.name);
		this.info();
	}

	void info() {
		System.out.println(this.id + " " + this.name);
	}
}

public class Account {
	public static void main(String args[]) {
		Customer c = new Customer(101, "priyanka");
		c.display();

	}

}
