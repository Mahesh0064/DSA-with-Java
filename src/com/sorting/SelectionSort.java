package com.sorting;

public class SelectionSort {
	
	public static void selectionSort(int a[])
	{

		for(int i=0; i<a.length-1; i++)
		{
			int minPos=i;
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[minPos]>a[j])
				{
					minPos=j;
				}
			}
			// swap
			int temp=a[minPos];
			a[minPos]=a[i];
			a[i]=temp;
		}
	}
	
	public static void printArray(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i] +" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {23,1,45,87,21,44,76,5};
		
		selectionSort(a);
		printArray(a);

	}

}
