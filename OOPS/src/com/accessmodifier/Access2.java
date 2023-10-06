package com.accessmodifier;

public class Access2 {

		private int a;
		int b;
		public int d;
		
		private void show()
		{
			System.out.println(" helo priyanka");
		}

		void display() {
			System.out.println("hi dipati");
		}

		public void test() {
			System.out.println(" this is Test");
		}

		public static void main(String[] args) {

	
			AccessDemo obj = new AccessDemo();
			obj.a = 60;
			obj.b = 45;
			obj.d = 67;

			obj.show();
			obj.display();
			obj.test();

		}

	}


