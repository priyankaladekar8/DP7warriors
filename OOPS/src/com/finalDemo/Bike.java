package com.finalDemo;

 class Honda {
	final int speed=80;
	final String bname;
	final float price;
	{
		String Bname="Bajaj";
	}
	public Honda(int speed, String bname,float price)
	{
		this.speed=speed;
		this.bname=bname;
		this.price=price;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public String getBname()
	{
		return bname;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public float getPrice()
	{
		return price;
	}
	
}
 public class Bike{
	 public static void main(String args[])
	 {
		 Honda h= new Honda();
		 System.out.println(h.speed+ " "+h.bname+" " +h.price);
		 h.setSpeed(90);
		 System.out.println(h.bname+" "+h.bname+" "+h.price);
		 
		 
	 }


	

}
