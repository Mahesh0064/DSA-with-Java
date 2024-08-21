package com.divideandconquer;

public class MergeSort {
	
	public static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int arr[], int si, int ei)
	{
		
		if(si>=ei)
		{
			return ;
		}
		// kaam
		int mid=si+(ei-si)/2;  // (si+ei)/2
		
		mergeSort(arr, si, mid);// left
		mergeSort(arr, mid+1, ei); // right
		merge(arr,si,mid,ei);
	}
	
	public static void merge(int arr[], int si, int mid, int ei)
	{
		int temp[]=new int[ei-si+1];
		int i=si; // iterator for left part
		int j=mid+1; // iterator for right part
		int k=0 ;  //iterator for temp arr
		
		// comparision
		while(i<=mid && j<=ei)
		{
			if(arr[i]<arr[j])
			{
				temp[k]=arr[i];
				i++;
			}
			else
			{
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		
		// left part
		while(i<=mid)
		{
			temp[k++]=arr[i++];
		}
		
		// right part
				while(j<=ei)
				{
					temp[k++]=arr[j++];
				}
		
		// copy from temp arr to my original arr
				for(k=0, i=si; k<temp.length; k++,i++)
				{
					arr[i]=temp[k];
				}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {23,56,1,12,67,89,32,41,55,90,10};
		
		mergeSort(arr, 0, arr.length-1);
		
		printArray(arr);

	}

}
