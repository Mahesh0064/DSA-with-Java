package com.arrays;

public class BinarSearch {
	
	public static int binarSearch(int num[], int key)
	{
		int start=0, end=num.length-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			// comparision
			if(num[mid]==key) // found
			{
				return mid;
			}
			if(num[mid]<key)// right
			{
				start=mid+1;
			}
			else // left
			{
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {2,4,6,8,10,12,14,16,18,20};
		int key=18;
		
		System.out.println("Index for the key is : "+binarSearch(num, key));

	}

}
