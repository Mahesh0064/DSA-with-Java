package com.heaps;

import java.util.*;

public class InsertHeap {
	
	static class Heap
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		// add at last inx
		public void add(int data)
		{
		arr.add(data);
		
		int x=arr.size()-1;// x is child idx
		int par=(x-1)/2;   // parent idx
		
		while(arr.get(x)<arr.get(par))
		{
			// swap
			int temp=arr.get(x);
			arr.set(x, arr.get(par));
			arr.set(par,temp);
			x=par;
			par=(x-1)/2;
			
		}
		}
		
		// peek method
		public int peek()
		{
			return arr.get(0);
		}
		
		private void heapify(int i)
		{
			int left=2*i+1;
			int right=2*i+2;
			int minIdx=i;
			if(left<arr.size() && arr.get(minIdx)>arr.get(left))
			{
				minIdx=left;
			}
			if(right<arr.size() && arr.get(minIdx)>arr.get(right))
			{
				minIdx=right;
			}
			
			if(minIdx!=i)
			{
				// swap
				int temp=arr.get(i);
				arr.set(i, arr.get(minIdx));
				arr.set(minIdx, temp);
				
				heapify(minIdx);
			}
		}
		public int remove()
		{
			int data=arr.get(0);
			
			// step 1 swap first and last 
			int temp=arr.get(0);
			arr.set(0,arr.get(arr.size()-1));
			arr.set(arr.size()-1,temp);
			
			// step 2 delete last
			arr.remove(arr.size()-1);
			
			// step 3 heapify
			heapify(0);
			return data;
		}
		
		public boolean isEmpty()
		{
			return arr.size()==0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Heap h=new Heap();
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(9);
		h.add(12);
		h.add(8);
		
		while(!h.isEmpty())
		{
			System.out.print(h.peek()+" ");
			h.remove();
		}
	}

}
