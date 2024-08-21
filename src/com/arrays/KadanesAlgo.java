package com.arrays;

public class KadanesAlgo {
	
	public static void kadanes(int numbers[])
	{
		int cs=0; // current sum
		int ms=Integer.MIN_VALUE;  // maxSum
		
		for(int i=0; i<numbers.length; i++)
		{
			cs=cs+numbers[i];
			if(cs<0)
			{
				cs=0;
			}
			ms=Math.max(cs, ms);
		}
		
		System.out.println("Our max subarray sum is : "+ms);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= {-2,-3,4,-1,-2,1,5,-3};
		kadanes(numbers);

	}

}
