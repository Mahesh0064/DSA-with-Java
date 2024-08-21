package com.bitmanipulation;

public class Operation {

	public static int getIthBit(int n,int i)
	{
		int bitMask=1<<i;
		
		if((n & bitMask)==0) 
		{
		return 0;	
		}
		else
		{
			return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getIthBit(10, 2));

	}

}
