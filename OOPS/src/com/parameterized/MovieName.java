package com.parameterized;


 class movie
	{
	   private int m_id;
	   private String mname;
	   private float rating;
	   
	   movie()
	   {
		   
	   }
	   
	   movie(int m_id, String mname,float rating)
	   {
		   this.m_id=m_id;
		   this.mname= mname;
		   this.rating=rating;
	   }
	   
	   public void setRating(float rating)
	   {
		   this.rating=rating;
		   
	   }
	   
	   public float getRating()
	   {
		   return rating;
	   }
	   
	   public String toString()
	   {
		   return m_id+" "+mname+" "+rating;
				   
	   }

	}

	public class MovieName{
		
		static void cheakRating(movie m)
		{
			if(m.getRating()>7)
			{
				//float R= m.getRating();
				System.out.println(m);
			}
		}
		
		public static void main(String[] args) {
			
			movie m1= new movie(11, "perfect", 8f);
			movie m2= new movie(2,"dune",6f);
			movie m3= new movie(3,"tailgate",5f);
			movie m4= new movie(4,"strays",7f);
			movie m5= new movie(5,"the drive",8f);
			
			System.out.println("-------------before rating---------------------");
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
			System.out.println(m4);
			System.out.println(m5);
			
			System.out.println("----after rating-----");
             cheakRating(m1);
			cheakRating(m2);
			cheakRating(m3);
			cheakRating(m4);
			cheakRating(m5);
		
		}

	}



