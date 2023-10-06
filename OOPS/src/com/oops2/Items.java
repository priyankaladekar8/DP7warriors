package com.oops2;

public class Items {
	int itemId;
	String name;
	float price;
	
	void Display()
	{
		System.out.println("name:"  +name+"itmeId :"+itemId+ "price:" +price);
	}
	public static void main(String args[])
	{
		Items i1=new Items();
		i1.itemId=101;
		i1.name="mobile";
		i1.price=120000;
		
		i1.Display();
	}
	
	

}
