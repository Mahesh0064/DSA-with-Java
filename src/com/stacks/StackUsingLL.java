package com.stacks;

public class StackUsingLL {

	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	
	static class StackA
	{
		static Node head=null;
		
		public static boolean isEmpty()
		{
			return head==null;
		}
		// push
		public static void push(int data)
		{
			Node newNode=new Node(data);
			
			if(isEmpty()
					) {
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
		}
		
		// pop
		public static int pop()
		{
			if(isEmpty())
			{
				return -1;
			}
			int top=head.data;
			head=head.next;
			return top;
		}
		
		// peek
		public static int peek()
		{
			if(isEmpty())
			{
				return -1;
			}
			
			return head.data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackA s=new StackA();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		while(!s.isEmpty())
		{
			System.out.print(s.peek()+" ");
            s.pop();
		}
		

	}

}
