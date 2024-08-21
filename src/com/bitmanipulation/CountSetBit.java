package com.bitmanipulation;

public class CountSetBit {
	
	public static int countSetBits(int n)
	{
		int count=0;
		while(n>0)
		{
			if((n&1)!=0)  // check out LSB
			{
				count++;
			}
			n=n>>1;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countSetBits(15));

	}

}
