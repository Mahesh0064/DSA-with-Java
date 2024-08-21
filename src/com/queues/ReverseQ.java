package com.queues;

import java.util.*;

public class ReverseQ {
	
	public static void reverseQ(Queue<Integer> q)
	{
		Stack<Integer> s=new Stack<>();
		
		while(! q.isEmpty())
		{
			int q1=q.remove();
			s.push(q1);
		// s.push(q.remove()); or we can write in a single like this
		}
		
		while(!s.isEmpty())
		{
			q.add(s.pop());
		}
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		
		reverseQ(q);
		
		while(!q.isEmpty())
		{
			System.out.print(q.remove()+" ");
		}

	}

}
