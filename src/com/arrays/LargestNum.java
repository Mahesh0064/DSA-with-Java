package com.arrays;

public class LargestNum {
	
	public static int getLargest(int numbers[])
	{
		int largest=Integer.MIN_VALUE; // -infinity
		int smallest=Integer.MAX_VALUE;// +infinity
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
			if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
		}
		System.out.println("Smallest numbers is : "+smallest);
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[]= {1,34,23,21,65,78,90,65,44,10,78};
		
		System.out.println("Largest Number is : "+getLargest(numbers));
	}

}
