package com.dynamicprograming;

public class ClimbingStairs {
	
	public static int countWays(int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n<0)
		{
			return 0;
		}
		
		return countWays(n-1)+countWays(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=5; // n=3->3 n=4->5 =>8
     
     System.out.println("Total number of ways : "+countWays(n));
     
	}

}
