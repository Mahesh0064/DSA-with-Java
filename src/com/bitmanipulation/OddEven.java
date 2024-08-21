package com.bitmanipulation;

public class OddEven {
	
	public static void oddEven(int n)
	{
		int bitMask=1;
		
		if((n & bitMask)==0)
		{
			System.out.println("Even Number ");
		}
		else
		{
			System.out.println("Odd Number ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      oddEven(5);
      oddEven(8);
      oddEven(11);
	}

}
