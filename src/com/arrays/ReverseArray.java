package com.arrays;

public class ReverseArray {

	public static void reverse(int numbers[])
	{
		int first=0, last=numbers.length-1;
		
		while(first<last)
		{
			// swap
			int temp=numbers[last];
			numbers[last]=numbers[first];
			numbers[first]=temp;
			first++;
			last--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= {2,4,6,8,10,12,14};
		
		reverse(numbers);
		
		// print
		for(int i=0; i<numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
		}
   System.out.println();
	}

}
