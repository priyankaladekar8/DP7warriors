package com.encapsulation;

import java.util.Scanner;
import com.encapsulation.Book;

public class Library2 {
    static  Scanner sc = new Scanner(System.in);

	 static void insertBook(Book b) {
		System.out.println("Enter book id:");
		b.setBookId(sc.nextInt());

		System.out.println("Enter book name:");
		b.setBname(sc.next());

		System.out.println("Enter book price");
		b.setPrice(sc.nextFloat());

	}

	public static void main(String args[]) {
		Book b1 = new Book();
		insertBook(b1);
	
		
		
		Book b2 = new Book();
		insertBook(b2);
		
		Book b3 = new Book();
		insertBook(b3);
		
		System.out.println("---------------------");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
