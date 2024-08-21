package com.functions;

public class FunOverloading2 {

	// fun to calculate sum of 2 num
		public static int sum(int a,int b)
		{
			return a+b;
		}
		
		// fun to calculate sum of 2 num
		public static float sum(int a,float b)
		{
			return a+b;
		}
		
	public static void main(String args[])
	{
		System.out.println(sum(4,5));
		System.out.println(sum(5,5.67f));
	}

	}
