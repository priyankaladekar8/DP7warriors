package com.methodoverriding;

class Employee {
	void display() {
		System.out.println("this is the employee class");
	}

}

class Manager extends Employee {
	 public void display() {
		System.out.println("This is the manager");

	}

	void show() {
		System.out.println("i am a manager");
	}

}

class Po extends Employee {
	void display() {
		System.out.println("this is the po");
	}
}

public class Dyankamic2 {
	public static void main(String args[]) {
		Employee e;
		e = new Employee();
		e.display();
		
		Manager m = new Manager();
		m.display();
		m.show();
		
		Po p = new Po();
		p.display();
	}

}
