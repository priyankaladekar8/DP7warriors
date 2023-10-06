package com.numbers;

public class LeftAngledNumbers2 {

		
		public static void main(String[] args) {
			
			int n=7;
			
			for(int i=n;i>=1;i--)
			{
				
				for(int j=1;j<=(n-i);j++)//for space
				{
					System.out.print("  ");
				}
				
				for(int j=i;j<=i;j++)//for numbers
				{
					System.out.print(j+" ");
				}
				
				System.out.println();
			}
			
		}

	}





