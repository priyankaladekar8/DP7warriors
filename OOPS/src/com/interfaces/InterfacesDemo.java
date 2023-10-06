package com.interfaces;

interface Bakery
{
   String bname="LetsBake"; // public static final
      
    void bake();// public abstract

}

class Cake implements Bakery
{

	@Override
	public void bake() {
		System.out.println("We bake cakes : Butterscotch, Pineapple, Truffle");
	}
	

}

class Biscuit implements Bakery
{

	@Override
	public void bake() {
		
		System.out.println("We bake biscuits: Almond, Chocochips");
		
	}
	
	void minOrder()
	{
		System.out.println("Min packing is 250g");
	}
	

}

public class InterfacesDemo {
	
	public static void main(String[] args) {
		
		
		System.out.println("Bakery name:"+Bakery.bname);
		Cake c= new Cake();
		c.bake();
		
		Biscuit  b= new Biscuit();
		b.bake();
		b.minOrder();
		
		Bakery b1;
		
		b1= new Biscuit();
		b1.bake();
		//b1.minOrder();
		
	}

}
