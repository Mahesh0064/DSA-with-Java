package com.dynamicprograming;

// Matrix Chain Multipication
public class MCM {

	// By Recursion
public static int mcm(int arr[],int i, int j)
{
	if(i==j)
	{
		return 0; // single matrix case
	}
	int ans=Integer.MAX_VALUE;
	for(int k=i; k<=j-1;k++)
	{
		int cost1=mcm(arr,i,k);  // Ai....Ak  =>arr[i-1]*arr[k]
		int cost2=mcm(arr,k+1,j);  // Ai+1.....Aj => arr[k]*arr[j]
		int cost3=arr[i-1]*arr[k]*arr[j];
		int finalCost=cost1+cost2+cost3;
		ans=Math.min(ans, finalCost);
	}
	
	return ans; 
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,3}; // n=5
		int n=arr.length;

		System.out.println("Minimum Cost is : "+mcm(arr, 1, n-1));
	}

}
