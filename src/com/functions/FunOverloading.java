package com.functions;

public class FunOverloading {
	
	// fun to calculate sum of 2 num
	public static int sum(int a,int b)
	{
		return a+b;
	}
	
	// fun to calculate sum of 2 num
	public static int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	
public static void main(String args[])
{
	System.out.println(sum(4,5));
	System.out.println(sum(5,6,7));
}

}
