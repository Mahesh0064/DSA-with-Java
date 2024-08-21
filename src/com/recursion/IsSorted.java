package com.recursion;

public class IsSorted {
	
	public static boolean isSorted(int arr[], int i) {
		
		if(i==arr.length-1)
		{
			return true;
		}
		if(arr[i]>arr[i+1])
		{
		return false;
		}
		
		return isSorted(arr, i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(isSorted(arr, 0));

	}

}
