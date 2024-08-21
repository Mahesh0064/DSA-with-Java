package com.sorting;

import java.util.*;

public class InbuiltSort {
	
	public static void printArray(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {2,45,1,67,3,78,90,12,14};
		Arrays.sort(a);
		printArray(a);

	}

}
