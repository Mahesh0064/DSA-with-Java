package com.sorting;

public class BubbleSort {
	
	public static void bubblesorting(int a[]) {
		
		for(int turn=0; turn<a.length-1; turn++)
		{
			for(int j=0; j<a.length-1-turn; j++)
			{
				if(a[j]>a[j+1])
				{
					// swap
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					}
			}
		}
		
	}
	public static void printArray(int a[])
	{
		for(int i=0;i<=a.length-1; i++)
		{
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,54,62,11,76,80,31,50};
		bubblesorting(a);
		printArray(a);
	}

}
