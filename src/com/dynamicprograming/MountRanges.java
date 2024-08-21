package com.dynamicprograming;

public class MountRanges {
	
	public static int mountainRnages(int n)
	{
		int dp[]=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2; i<n+1; i++)
		{
			// i pairs-->mountain ranges
			for(int j=0; j<i; j++)
			{
				int inside=dp[j];
				int outside=dp[i-j-1];
				dp[i]+=inside* outside; // Ci=Cj*Ci-j-1
			}
		}
		
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int n=4;
		
		System.out.println("Number of mountain ranges is : "+ mountainRnages(n));
	}

}
