package com.classobject;

public class Car {
	int carId;
	String brand;
	float price;
	String carName;

	// instance method
	void displayCarDetails() {
		System.out.println(carId + ": " + carName);
		System.out.println("Brand:" + brand);
		System.out.println("price:" + price);
	}

	public static void main(String args[]) {
		Car c1 = new Car();
		c1.carId = 101;
		c1.carName = "Ferrari Roma";
		c1.brand = "Ferrari";
		c1.price = 890000.0f;

		Car c2 = new Car();
		c2.carId = 102;
		c2.carName = "Fortuner";
		c2.brand = "Toyato";
		c2.price = 750000.0f;

		c1.displayCarDetails();
		c2.displayCarDetails();
	}

}

//there are two memory in jvm stack and heap
//c1 and c2 s data stored in stack and this detail stack is stored in the heap memory
//when we print displaycardetails() then print data on the scrin