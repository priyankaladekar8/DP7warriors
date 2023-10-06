package com.covarient;

class Person {
	int id;
	String name;

	Person() {

	}

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Person showDetails() {
		name = name + "India";
		return this;
	}

	public String display() {
		return "Id:" + id + " " + "name" + name;
	}
}

class Employee extends Person {

	float salary;

	Employee() {

	}

	Employee(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;

	}

	Employee showDetails() {
		name = name + "ThinkQ";
		salary = salary + 1000;
		return this;
	}

	public String show() {
		return "Id:" + id + " " + "name" + name + " " + "salary" + salary;
	}

}

public class CovarientDemo {
	public static void main(String args[]) {
		Person ref;
		Employee eref;

		Person p = new Person(101, "priyanka");
		ref = p.showDetails();
		System.out.println(ref.display());

		Employee e = new Employee(1001, "snehal", 45000f);
		eref = (Employee) e.showDetails(); // casting
		System.out.println(eref.show());

		Employee e1 = new Employee(1002, "pallavi ", 55000f);
		eref = e.showDetails(); // no type casting required now
		System.out.println(eref.show());

	}

}
