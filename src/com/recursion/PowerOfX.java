package com.recursion;

public class PowerOfX {
	
	public static int power(int x, int n)
	{
		// base case
		if(n==0)
		{
			return 1;
		}
		
		int pnm1=power(x,n-1);
		int pn=x*pnm1;
		return pn;
		
		//return x*power(x,n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(power(2,10));

	}

}
