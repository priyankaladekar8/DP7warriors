package com.inheritance;

public class AccessDemo {
	
		private int a;
		int b; // default
		protected int c; // : used in inheritance
		public int d;
		
		private void show()
		{
			System.out.println("Hello");
		}
		
		void display()
		{
			System.out.println("Welcome");
		}
		
		protected void printMe()
		{
			System.out.println("hi");
		}
		
		public void test()
		{
			System.out.println("Test");
		}
			
		public static void main(String[] args) {
			
			// Inside the class everything is accessible
			AccessDemo obj= new AccessDemo();
			obj.a=89;
			obj.b=67;
			obj.d=56;
			obj.c=89;
			
			obj.show();
			obj.display();
			obj.test();
			obj.printMe();
			
		}

	}



