package com.stacks;

import java.util.Stack;

public class MaxRectArea {
	
	public static void maxArea(int arr[])
	{
		int maxArea=0;
		int nsr[]=new int[arr.length];
		int nsl[]=new int[arr.length];
		
		// Next Smaller Right
		Stack<Integer> s=new Stack<>();
		
		for(int i=arr.length-1; i>=0; i--)
		{
			while(!s.isEmpty() && arr[s.peek()] >=arr[i])
			{
				s.pop();
			}
			if(s.isEmpty())
			{
				// -1
				nsr[i]=arr.length;
			}
			else
			{
				nsr[i]=s.peek();
			}
			s.push(i);
		}
		
		// Next Smaller left
		
	         s=new Stack<>();
		
		for(int i=0; i<arr.length; i++)
		{
			while(!s.isEmpty() && arr[s.peek()] >=arr[i])
			{
				s.pop();
			}
			if(s.isEmpty())
			{
				// -1
				nsl[i]=-1;
			}
			else
			{	
				nsl[i]=s.peek();
			}
			s.push(i);
		}
		
		// Current Area width=j-i-1 =nsr[i]-nsl[i]-1
		
		for(int i=0; i<arr.length; i++)
		{
			int height=arr[i];
			int width=nsr[i]- nsl[i]-1;
			int currArea=height* width;
			maxArea=Math.max(currArea, maxArea);
		}
		
		System.out.println("my Max Area of Hisogram is : "+maxArea);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,5,6,2,3}; // height in histogram
        maxArea(arr);
	}

}