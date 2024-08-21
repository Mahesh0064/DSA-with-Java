package com.recursion;

public class LastOccurence {
	
	public static int lastOcc(int arr[],int key,int i)
	{
		if(i==arr.length)
		{
			return -1;
		}
		int isfound=lastOcc(arr, key, i+1);
				if(isfound==-1 && arr[i]==key)
				{
					return i;
				}
				
	return isfound;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6,7,4,2,4,5,8,9,10};
		
		System.out.println(lastOcc(arr, 4, 0));
	}

}
