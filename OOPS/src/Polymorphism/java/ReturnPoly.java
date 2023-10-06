package Polymorphism.java;

class Shape2 {
	int area(int side) {
		return (side * side);
	}

	int area(int len, int bre) {
		return (len * bre);
	}

	float area(float radius) {
		float pi = 3.14f;
		return (pi * radius * radius);
	}

}

public class ReturnPoly {
	public static void main(String args[]) {
		Shape2 square = new Shape2();
		System.out.println("Area of square is :" + square.area(7));

		Shape2 rectangle = new Shape2();
		System.out.println("Area of Rectangle is:" + rectangle.area(7,8));

		Shape2 Circle = new Shape2();
		System.out.println("Area of circle is :" + Circle.area(2.3f));
	}

}
