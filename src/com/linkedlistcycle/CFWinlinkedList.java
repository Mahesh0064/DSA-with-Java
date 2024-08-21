package com.linkedlistcycle;

import java.util.LinkedList;

public class CFWinlinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create LinkedList
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		// add
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addFirst(0);
		// 0->1->2->3
		System.out.println(ll);
		
		// remove
		ll.removeFirst();
		ll.removeLast();
		ll.remove(2);
		System.out.println(ll);

	}

}
