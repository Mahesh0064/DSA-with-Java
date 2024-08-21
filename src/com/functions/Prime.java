package com.functions;

public class Prime {
	
	// 1st way
	public static boolean isPrime(int n)
	{
		boolean isPrime=true;
		for(int i=2; i<=n-1; i++)
		{
			if(n%i==0)// completely dividing
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	// 2nd way
	public static boolean isPrime2(int n)
	{
		if(n==2)
		{
			return true;
		}
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(13));
		
		System.out.println(isPrime2(16));

	}

}
