package com.queues;

import java.util.*;

public class QUsingJCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Queue<Integer> q=new LinkedList<>();  // ArrayDeque
		
		// we can use either Linkedlist or ArrayDeque both are same
		Queue<Integer> q=new ArrayDeque<>();//
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		while(! q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
		

	}

}
