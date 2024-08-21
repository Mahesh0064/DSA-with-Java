package com.heaps;

import java.util.*;

public class PriorityQueueA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(3);  //O(log n)
		pq.add(4);
		pq.add(5);
		pq.add(1);
		pq.add(6);
		
		while(!pq.isEmpty())  //
		{
			System.out.print(pq.peek()+" ");  //O(1	)		
			pq.remove();// o(logn)
		}
		System.out.println();
		System.out.println("Que is in ascending order");
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
		
		pq1.add(3);  //O(log n)
		pq1.add(4);
		pq1.add(5);
		pq1.add(1);
		pq1.add(6);
		
		while(!pq1.isEmpty())  //
		{
			System.out.print(pq1.peek()+" ");  //O(1	)		
			pq1.remove();// o(logn)
		}
		
	}

}
