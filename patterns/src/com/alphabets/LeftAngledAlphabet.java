package com.alphabets;

public class LeftAngledAlphabet {
	
		
		public static void main(String[] args) {
			
			int n=7;
			
			for(int i=1;i<=n;i++)
			{
				// for spaces
				for(int j=1;j<=(n-i);j++)
				{
					System.out.print("  ");
				}
				//for alphabets
				char ch='A';
				for(int j=1;j<=i;j++)
				{
					System.out.print(ch+" ");
					ch++;
				}
				
				System.out.println();
			}
			
		}

	}


