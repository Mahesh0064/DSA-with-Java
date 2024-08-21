package com.queues;
import java.util.*;
public class DequeImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> deque=new LinkedList<>();
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		deque.addLast(4);
		deque.addLast(5);
		
		System.out.println(deque);
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		System.out.println("First element : "+deque.getFirst());
		System.out.println("Last element : "+deque.getLast());
		
		

	}

}
