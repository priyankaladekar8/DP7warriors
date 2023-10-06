package com.interfaces;

interface Showable
{
	void display();
	}

interface PrintMe{
	
	void display();
	
}
class Demo implements Showable, PrintMe{
	public void display()
	{
		System.out.println("welcome");
	}
}

public class MultipelInheritance {

	public class MultipleInheritanceDemo {
		
		public static void main(String[] args) {
				
		Demo d1= new Demo();
		d1.display();
		}
	}
}
