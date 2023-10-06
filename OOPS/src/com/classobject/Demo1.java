package com.classobject;

import com.accessmodifier.AccessDemo;

//import com.accessmodifier.*;  // All class will be imported
public class Demo1 {

	public static void main(String[] args) {  // class AccessDemo.java

		AccessDemo obj = new AccessDemo();
	
		// default is accessible within the package
		// obj.a=67;
		// obj.b=78;
		obj.d = 67;

		// obj.show();
		// obj.display();
		obj.test();

	}
}
