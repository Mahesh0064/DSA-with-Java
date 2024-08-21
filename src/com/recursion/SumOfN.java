package com.recursion;

public class SumOfN {
	
	public static int printSum(int n) {
		
		if(n==1)
		{
			return 1 ;
		}
		int snm1=printSum(n-1);
		int sn=n+snm1;
		
		return sn;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=20;
		
    System.out.println("Sum of "+n+" is : "+printSum(n));
	}

}
