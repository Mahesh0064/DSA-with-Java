package com.dynamicprograming;

import java.util.Arrays;

public class CatalanNumber {
	
	// Recursion
	public static int catalanRec(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		int ans=0; // Cn
		for(int i=0; i<=n-1; i++)
		{
			ans+=catalanRec(i)*catalanRec(n-i-1);
		}
		
		return ans;
	}
	
	//By Memoization
	public static int catalanMemo(int dp[],int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		if(dp[n]!=-1)
		{
			return dp[n];
		}
		int ans=0;
		for(int i=0; i<n; i++)
		{
			ans+=catalanMemo(dp, i)*catalanMemo(dp, n-i-1);
		}
		
		return ans;
	}

	// By Tabulation
	public static int catalanTab(int n)
	{
		int dp[]=new int[n+1];
		 dp[0]=1;
		 dp[1]=1;
		 
		 for(int i=2; i<=n; i++)
		 {
			 for(int j=0; j<i; j++)
			 {
				 dp[i]+=dp[j]*dp[i-j-1];  // Ci=Cj*Ci-j-1
			 }
		 }
		 
		 return dp[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
	System.out.println("Catalan Number by Recurion : "+catalanRec(n));
		
	int dp[]=new int[n+1];
	 
	Arrays.fill(dp, -1);
	
	System.out.println("Catalan number By Memoization : "+catalanMemo(dp, n));
	
	System.out.println("Catalan Number by Tabulation : "+catalanTab(n));

	}

}
