package com.constructor;

public class Testify {
	String name;

	Testify() {

	}

	Testify(String name) {   // diff btn instance variable and local variable
		this.name = name;
	}

	void display() {
		System.out.println("Hi " + name);
		this.show();  // to return current method
		// show
	}

	void show() {
		System.out.println("Welcome to thinkQuotinet :" + name);

	}

	Testify changeName() {  //to return current obj
		name = name + " ThinkQ";
		return this;
	}

	public static void main(String args[]) {
		Testify t1 = new Testify("Priyanka");
		t1.display();
		// t1.show();

		Testify dummy;
		dummy = t1.changeName();
	}

}
