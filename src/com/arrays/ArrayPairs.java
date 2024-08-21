package com.arrays;

public class ArrayPairs {
	
	public static void printPairs(int numbers[])
	{
		int tp=0;
		for(int i=0; i<numbers.length; i++)
		{
			int curr=numbers[i]; // 2,4,6,8, 10,12
			for(int j=i+1; j<numbers.length; j++)
			{
				System.out.print("("+curr+","+numbers[j]+")");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Totals Numbers of Pairs : "+tp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= {2,4,6,8,10,12};
		
		printPairs(numbers);

	}

}
