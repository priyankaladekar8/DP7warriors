package Polymorphism.java;

class Room
{
	int len;
	int br;
	

Room()
{
	len=5;
	br=6;
}
Room(int len,int br)
{
	this.len=len;
	this.br=br;
}

Room(int len)
{
	System.out.println("square");
	this.len=len;
	this.br=len;
	}

void area() 
{
	System.out.println("Area of the Room is:"+(len*br));
}

}



public class ConstructorOVerloading {
	public static void main(String args[])
	{
		Room r1=new Room();
	    r1.area();
	    
	    Room r2=new Room();
	    r2.area();
	    
	    Room r3=new Room();
	    r3.area();
		
	}
	

}
