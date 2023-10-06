package Conatainment2.java;

public class Library {

		
		public static void main(String[] args) {
			
			Author a1= new Author(101,"JKRowling");
			Author a2=new Author(102,"SudhaMurthy");
			
			Book b1= new Book(1, "Harry Potter", 1000f, a1);
			Book b2= new Book(2,"Magic of lost temple",450f,a2);
			
			System.out.println(b1);
			System.out.println(b2);
		}

	}


