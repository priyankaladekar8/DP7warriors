package com.interfaces; //using super call the method

interface Grandfather {
	void print();

}

interface Mother extends Grandfather {
	default void print() {
		System.out.println("loan taken by mother:");
	}
}

interface Father extends Grandfather {
	default void print() {
		System.out.println("loan taken by father:");
	}
}

class Child implements Mother, Father {
	public void print() {
		Mother.super.print();
		Father.super.print();

	}

}

public class Dimondpattern2 {
	public static void main(String args[]) {
		Grandfather g = new Grandfather();
		g.print();

	}

}
