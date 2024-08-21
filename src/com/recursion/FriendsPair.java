package com.recursion;

public class FriendsPair {
	
	public static int friendsPairs(int n)
	{
		
		if(n==1 || n==2)
		{
			return n;
		}
		// choice
		
		/* single
		int fnm1=friendsPairs(n-1);
		
		// pairs
		int fnm2=friendsPairs(n-2);
		int totalsPairs=(n-1)*fnm2;
		
		// totals ways
		int totalsWays=fnm1+totalsPairs;
		
		return totalsWays; */
		
		// in single line output
		
		return friendsPairs(n-1)+(n-1)*friendsPairs(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(friendsPairs(3));
	}

}
