package com.inheritance;

public class Demo {
		
		public static void main(String[] args) {
			
			AccessDemo obj1= new AccessDemo();
			//obj1.a=56;   // private is not accessible outside the class
			obj1.b=56;
			obj1.d=90;
			obj1.c=34;
			
			//obj1.show();
			obj1.display();
			obj1.test();
			obj1.printMe();
		}

	}


