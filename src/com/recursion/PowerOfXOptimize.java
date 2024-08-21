package com.recursion;

public class PowerOfXOptimize {
	
	public static int optimizePower(int a, int n)
	{
		if(n==0)
		{
			return 1;
		}
		// n=even
		 // int halfPowerSq=optimizePower(a, n/2)*optimizePower(a, n/2); or
		
		 int halfPower=optimizePower(a, n/2);
		 int halfPowerSq=halfPower*halfPower;
		 
		 //n=odd
		 if(n%2 !=0)
		 {
			 halfPowerSq=a*halfPowerSq;
		 }
		 
		 return halfPowerSq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2;
		int n=10;
		
		System.out.println(optimizePower(a, n));

	}

}
