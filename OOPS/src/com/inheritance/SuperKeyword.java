package com.inheritance;

class Animal {
	int speedOfRunning;
	{
		speedOfRunning = 112;
	}

	void display() {
		System.out.println("SpeedOfRunning");
	}

}

class Tiger extends Animal {

	int speedOfRunning;
	{
		speedOfRunning = 190;

	}

	void printSpeed() {
		System.out.println("Animal value:" + super.speedOfRunning);
		System.out.println("TIger value:" + speedOfRunning);
		super.display();
	}

	void display() {
		// super.display();
		System.out.println("Speed");
	}

	public class SuperKeyword {

		public static void main(String[] args) {
			Tiger c1 = new Tiger();
			c1.printSpeed();

		}

	}

}
