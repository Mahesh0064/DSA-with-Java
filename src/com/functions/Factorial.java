package com.functions;

public class Factorial {
	
	public static int printFact(int n)
	{
		int f=1;
		for(int i=1; i<=n; i++)
		{
			f=f*i;
		}
		
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int n=10;
       
       int fact=printFact(n);
       
       System.out.println("Factorial of "+n+" is :"+fact);
       
	}

}
