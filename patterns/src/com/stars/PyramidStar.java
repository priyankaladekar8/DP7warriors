package com.stars;

public class PyramidStar
{
	public static void main(String args[]) 
	{
		
		int n=7;
		for (int i=1; i<=n; i++) 
		{
		                                           //for space
			for (int j=1; j<=(n-i); j++)
			{ 
				System.out.print(" ");
			}
			
		                                     //for number
			  for (int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
				
	}


