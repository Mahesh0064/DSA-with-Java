package com.stacks;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {6,8,0,1,3};
		Stack <Integer> s=new Stack<>();
		int nxtGreater[]=new int[arr.length];
		
		// for left  nxtGeater i need to start loop from 0 to length
		
		for(int i=arr.length-1; i>=0;i--)// this is for right nxtGreater
		{
			// 1 while
			while(! s.isEmpty() && arr[s.peek()]<=arr[i])
			{
				s.pop();
			}
			
			// 2 if-else
			
			if(s.isEmpty())
			{
				nxtGreater[i]=-1;
			}
			else
			{
				nxtGreater[i]=arr[s.peek()];
			}
			// 3 push in Stack
			s.push(i);
			
		}
		
     for(int i=0; i<nxtGreater.length; i++)
     {
    	 System.out.print(nxtGreater[i] +" ");
     }
     System.out.println();
	}

}
