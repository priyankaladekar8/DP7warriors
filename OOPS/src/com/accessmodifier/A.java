package com.accessmodifier;

public class A {
	private int i=10;
	int j=20;
	protected int k=30;
	public int m=40;
	void display()
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}
}
class B{
	A b=new A();
	void display()
	{
		System.out.println(b.j);
		System.out.println(b.k);
		System.out.println(b.m);
	}
}
class C extends A{
	void display()
	{
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}
}




	

