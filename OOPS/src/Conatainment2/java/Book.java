package Conatainment2.java;

public class Book {

		private int bookId;
		private String bname;
		private float price;
		private Author author;
		
		public Book() {
			
		}

		public Book(int bookId, String bname, float price, Author author) {
			this.bookId = bookId;
			this.bname = bname;
			this.price = price;
			this.author = author;
		}

		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		public String getBname() {
			return bname;
		}

		public void setBname(String bname) {
			this.bname = bname;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public Author getAuthor() {
			return author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}
		
		public String toString()
		{
			return "\nBook:"+ bookId+" "+bname+" "+price+"  "+author.toString();
		}
		
		
		
		

	}


