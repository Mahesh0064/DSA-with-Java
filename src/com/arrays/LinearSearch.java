package com.arrays;

public class LinearSearch {
	
	public static int linearSearch(int numbers[],int key)
	{
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]==key)
			{
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= {1,34,23,21,65,78,90,65,44,10,78};
		int key=10;
		
		int index=linearSearch(numbers, key);
		if(index==-1)
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println("Key is at index : "+ index);
		}

	}

}
