package com.arrays;

public class SubArray {
	
	public static void printSubArray(int numbers[])
	{
		int ts=0;
		for(int i=0; i<numbers.length; i++)
		{
			 int start=i;
			for(int j=i; j<numbers.length; j++)
			{ 
				int end=j;
				for(int k=start; k<=end; k++)  // print
				{
					System.out.print(numbers[k]+" ");
	
				}
				ts++;
			System.out.println();
			}
			System.out.println();
		}
		System.out.println("Totals numbers of SubArrays : "+ts);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= {2,4,6,8,10,12};
		
		printSubArray(numbers);

	}

}
