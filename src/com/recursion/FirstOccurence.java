package com.recursion;

public class FirstOccurence {

	public static int firstOccu(int arr[], int key,int i)
	{
		if(i==arr.length)
		{
			return -1;
		}
		if(arr[i]==key)
		{
			return i;
		}
		 return firstOccu(arr,key,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,3,6,7,8,9};
		
		System.out.println(firstOccu(arr, 5, 0));

	}

}
