package com.interfaces;     // call through interface

interface Mother1 {
	default void Loan() {
		System.out.println("loan taken by mother:");
	}
}

interface Father1 {
	default void Loan() {
		System.out.println("loan taken by father:");
	}
}

class Mother implements Mother1 {
	public void Loan() {
		System.out.println("loan taken by mother:");

	}

}

class Father implements Father1 {
	public void loan() {
		System.out.println("loan taken by father");
	}
}

class Child implements Mother1, Father1 {
	Mother m = new Mother();
	Father f = new Father();

	public void loan() {
		m.Loan();
		System.out.println("mother loan paid by child");
	}

	@Override
	public void Loan() {
		f.loan();
		System.out.println("father loan paid by child");
	}

}

public class DimondPattern1 {
	public static void main(String args[]) {
		Mother1 m = new Child();
		m.Loan();
		Father1 f = new Child();
		f.Loan();
	}

}
