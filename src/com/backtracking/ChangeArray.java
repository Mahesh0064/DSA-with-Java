package com.backtracking;

public class ChangeArray {
	
	public static void changeArr(int arr[], int i, int value)
	{
		// base case
		if(i==arr.length)
		{
			printArr(arr);
			return;
		}
		// Recursion
		arr[i]=value;
		changeArr(arr, i+1, value+1);// function call step
		arr[i]=arr[i]-2;  // backtracking
		
	}
	
	public static void printArr(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int arr[]=new int[5];
		changeArr(arr, 0, 1);
		printArr(arr);
	}

}
