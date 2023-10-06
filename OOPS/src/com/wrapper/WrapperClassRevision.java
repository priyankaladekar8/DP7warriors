package com.wrapper;

public class WrapperClassRevision {
	public static void main(String args[])
	{

			{
				//autoboxing; 
				//primitive to wrapping;
				int num = 23;
				Integer i = new Integer(45);

				Integer j = Integer.valueOf(num);

				Integer k = num;
				System.out.println(num + " " + i + " " + j + " " + k);
				
				//unboxing;
				//wrapping to primitive;
				
				Float f1 = new Float(23.4);
				Float f2 = f1.floatValue();

				Float f3 = f1;
				System.out.println(f1 + " " + f2 + " +f3");

			}

		}

		
	}


