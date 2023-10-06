package com.encapsulation;
 import java.util.Scanner;

public class Library {
	
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		Book b1;
		
		b1 = new Book();
		// implicit // hard core values
		
		b1.setBookId(101);
        b1.setBname("Harry Potter");
        b1.setPrice(890);
        
        System.out.println(b1.getBookId()+"  "+b1.getBname()+"  "+b1.getPrice());
		//b1.display();
        
        // Ctrl+Shift+t ---- open any class
        // Ctrl+O  ---> open method inside it
        
        System.out.println(b1); // hashcode
        
        //user input
        Book b2=new Book();
        System.out.println("Enter book id:");
        //int id=sc.nextInt();
        // b2.setBookId(id);
        
        b2.setBookId(sc.nextInt());
        
        System.out.println("Enter book name:"); 
        b2.setBname(sc.next());
        
        System.out.println("Enter book price");
        b2.setPrice(sc.nextFloat());
        
        System.out.println(b2);
        
	}

}


