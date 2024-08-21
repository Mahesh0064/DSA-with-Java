package com.dynamicprograming;

public class Fibonacci {
	
	
	public static int fibo(int n, int f[])
	{ 
		// base case 
		if(n==0 || n==1)
		{
			return n;
		}
		if(f[n]!=0) // fibo(n) is already calculated 
		{
			return f[n];
		}
		
		f[n]=fibo(n-1,f)+fibo(n-2,f);
		
		return f[n];
	}
	
	// tabulation 
	public static int fibTabulation(int n)
	{
		int dp[]=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2; i<=n; i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n]; // ans
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=5;
       int f[]=new int[n+1]; // 0 to n /0 ,0, 0, 0 , 0
       System.out.println(fibo(n,f));
       System.out.println(fibTabulation(n));
       
	}

}
