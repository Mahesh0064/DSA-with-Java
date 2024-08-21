package com.functions;

public class DecToBin {
	public static void decToBin(int n)
	{
		int pow=0;
		int binNum=0;
		int myNum=n;
		while(n>0)
		{
			int lastDigit=n%2;
			binNum=binNum+(lastDigit*(int)Math.pow(10,pow));
			pow++;
			n=n/2;
		}
		System.out.println("Binary number of "+myNum+" is : "+binNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		decToBin(7);

	}

}
