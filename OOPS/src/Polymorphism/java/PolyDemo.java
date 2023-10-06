package Polymorphism.java;

class Shape {
	void area(int side) {
		System.out.println("Area of the square is" + (side * side));
	}

	void area(int len, int bre) {
		System.out.println("Area of the Reactangle is" + (len * bre));
	}

	void area(float radius) {
		float pi = 3.14f;
		System.out.println("Area of circle is" + (pi * radius * radius));
	}
}

public class PolyDemo {
	public static void main(String args[]) {
		Shape square = new Shape();
		square.area(7);

		Shape rectangle = new Shape();
		rectangle.area(7);

		Shape Circle = new Shape();
		Circle.area(2.3f);
	}

}
