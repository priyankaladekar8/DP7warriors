package com.stars;

public class ReversPyaramid {
	public static void main(String args[])
	{
		
		int n=7;
		for (int i=n; i>=1; i--)
		{
			//for spaces
			for (int j=1; j<=(n-i); j++)
			{
				System.out.print(" ");
			}
			//for space
			for (int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
