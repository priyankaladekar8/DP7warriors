package com.interfaceadvantages;

interface Calculation {
	float pi = 3.147f;

	void area();
}

class Square implements Calculation {

	int side;

	public Square() {
		super();
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	public void area() {
		System.out.println("area of squate is:" + (side * side));
	}
}

class Cube implements Calculation {
	int side;

	Cube() {

	}

	public Cube(int side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("are of cube is:" + (6 * side * side));

	}

	public void valume()
	{
		System.out.println("Volumen of cube")
	}
}

public class DefaultMethodDemo {
	public static void main(String args[]) {
		
	}

}

	