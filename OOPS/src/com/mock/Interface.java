package com.mock;

interface Bakery {
	
	String bname = "mycake";

	void bake();
}

class Cake implements Bakery {

	@Override
	public void bake() {
		System.out.println("we can bake cake:chocolatecake ,buttercake");

	}
}

	class Biscuit implements Bakery {

		public void bake() {
			System.out.println("we bake cake: chocolate , buttercake");
		}

		public class Interface {
			public static void main(String args) {
				System.out.println("bakery name:" + Bakery.bname);
				Cake c = new Cake();
				c.bake();

				Biscuit b = new Biscuit();
				b.bake();
			

			}
		}
	}


