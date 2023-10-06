package com.methodoverriding;

	// We can overload main method because main method is static and loaded during compile time
	// But JVM always call main method with string array as arguments
	// if we want to call other main method we can call it explicitly


	public class OverloadMain {
		
		static void display()
		{
			main(67);
		}
		
	    public static void main(String[] args) {
			
	    	System.out.println("In string main");
	    	display();
		}
	    
	    public static void main(int data)
	    {
	    	System.out.println("In int main");
	    }
	}


