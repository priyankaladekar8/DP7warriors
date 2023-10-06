package com.parameterized;

	

	class Category
	{
	   private int  bid;
	   private String bname;
	   private int bprice;
	   private String PDate;
	   private  char Categary;
	   
	   Category()
	   {
		   
	   }
	   
	   Category(int bid, String bname,int bprice, String PDate ,char Category)
	   {
		   this.bid=bid;
		   this.bname= bname;
		   this.bprice=bprice;
		   this.PDate=PDate;
		   Categary=Categary;
	   }
	   
	   public void setBid(int b_id)
	   {
		   this.bid=bid;
		   
	   }
	   
	   public int getBid()
	   {
		   return bid;
	   }
	   public void setBname(String Bname)
	   {
		   this.bname=bname;
	   }
	   public String getName()
	   {
		   return bname;
	   }
	   public void setBDate(String PDate)
	   {
		   this.PDate=PDate;
	   }
	   public void setBook(String Pdate)
	   {
		   this.PDate=PDate;
	   }
	   public void setCategory(char Category)
	   {
		   Category=Category;
	   }
	   
	   public String toString()
	   {
		   return bid+" "+bname+" "+bprice+" "+PDate;
				   
	   }

	}

	public class Library{
		
		static void Discount(StudentBook b)
		{
			if(Category=='s')
			{
				float Discount=(b.getBprice())-(b.getBprice()*0.10);
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

}
