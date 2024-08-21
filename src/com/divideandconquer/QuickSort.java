package com.divideandconquer;

public class QuickSort {
	
	public static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void quickSort(int arr[], int si, int ei) 
	{
		// base condition
		if(si>=ei)
		{
			return;
		}
		// last element
		int pIdx=partition(arr, si, ei);
		quickSort(arr, si, pIdx-1);// left
		quickSort(arr, pIdx+1, ei); // right
	}

	public static int partition(int arr[],int si, int ei)
	{
		int pivot=arr[ei];
		int i=si-1;// to make place for element smaller than pivot
		
		for(int j=si; j<ei; j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				// swap
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		
		i++;
		// swap
		int temp=pivot;
		arr[ei]=arr[i];
		arr[i]=temp;
		
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={2,6,8,3,9,1,6,78,22,44};
		
		quickSort(arr, 0, arr.length-1);
		printArray(arr);
	}

}
