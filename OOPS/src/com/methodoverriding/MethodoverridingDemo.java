package com.methodoverriding;

class Person {
	void display() {
		System.out.println("I am a person");
	}

}

class Employee extends Person {

	@Override
	public void display() // protected or public but not default or private
	{
		// super.display();
		System.out.println("I am an employee");

	}

}

class Celebrity extends Person {
	@Override
	void display() {
		System.out.println("I am an celebrity");

	}

}

public class MethodoverridingDemo {

	public static void main(String[] args) {

		Person p = new Person();
		p.display();

		Employee e1 = new Employee();
		e1.display();

		Celebrity c1 = new Celebrity();
		c1.display();

	}

}
