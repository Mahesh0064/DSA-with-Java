package com.sorting;

public class InsertionSort {

	public static void insertionSort(int a[])
	{
		for(int i=1; i<a.length; i++)
		{
			int curr=a[i];
			int prev=i-1;
			
			// finding out to correct pos to  insert
		while(prev>=0 && a[prev]>curr)
				{
					a[prev+1]=a[prev];
					prev--;
				}
				
				// Insertion
				a[prev+1]=curr;
			}
		}
	
	
	public static void printArray(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {23,56,76,4,3,21,1,80};
		
		insertionSort(a);
		printArray(a);
		

	}

}
