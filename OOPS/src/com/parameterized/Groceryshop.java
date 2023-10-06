package com.parameterized;

class Item
{
   private int id;
   private String iname;
   private float price;
   
   Item()
   {
	   
   }
   
   Item(int id, String iname,float price)
   {
	   this.id=id;
	   this.iname= iname;
	   this.price=price;
   }
   
   public void setPrice(float price)
   {
	   this.price=price;
	   
   }
   
   public float getPrice()
   {
	   return price;
   }
   
   public String toString()
   {
	   return id+" "+iname+" "+price;
			   
   }

}

public class Groceryshop{
	
	static void giveDiscount(Item i)
	{
		if(i.getPrice()>200)
		{
			float p= i.getPrice();
			p= (p-(0.1f*p));
			i.setPrice(p);
		}
	}
	
	public static void main(String[] args) {
		
		Item i1= new Item(1, "Flour", 260f);
		Item i2= new Item(2,"Sugar",150f);
		Item i3= new Item(3,"Milk",60f);
		Item i4= new Item(4,"Chocolates",250f);
		Item i5= new Item(5,"Coffee",500f);
		
		System.out.println("-------------------------------------");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		
		
		giveDiscount(i1);
		giveDiscount(i2);
		giveDiscount(i3);
		giveDiscount(i4);
		giveDiscount(i5);
		
		System.out.println("-------------After Discount------------------------");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		
		
		
		
	}

}
