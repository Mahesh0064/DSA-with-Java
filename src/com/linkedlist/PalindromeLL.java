package com.linkedlist;

import com.linkedlist.RemoveFirst.Node;

public class PalindromeLL {

public static class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	
	// addfirst method
	public void addFirst(int data)
	{
		// step 1-> create new node
		Node newNode=new Node(data);
		size++;
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		
		// step 2 -> newNode->next=head
		newNode.next=head;  // link
		
		// step 3-> head=newNode
		head=newNode;
		
	}
	
	// addlast method
	public void addLast(int data) {
		
		Node newNode=new Node(data);
		size++;
		
		if(head==null)
		{
			head=tail=null;
			return;
		}
		
		tail.next=newNode;
		tail=newNode;
	}
	
	// Print the element
		public void print() {
			if(head==null)
			{
				System.out.println("Linked list is empty");
				return;
			}
			Node temp=head;
			
			while(temp!=null)
			{
				System.out.print(temp.data+" ->" );
				temp=temp.next;
			}
			System.out.println("Null");;
		}
		
	// add middle
	public void add(int idx,int data)
	{
		if(idx==0)
		{
			addFirst(data);
			return;
		}
		Node newNode =new Node(data);
		size++;
		Node temp=head;
		int i=0;
		while(i<idx-1)
		{
			temp=temp.next;
			i++;
				
		}
		// i=idx-1 ; temp->prev
		
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	// slow fast approach
	public Node findMid(Node head)// helper
	{
		Node slow=head;
		Node fast=head;
		
		while(fast !=null && fast.next !=null)
		{
			slow=slow.next; // +1
			fast=fast.next.next; // +2
		}
		return slow; // slow is my midNode
	}
	
	public boolean checkPalindrome() {
		if(head==null || head.next ==null)
		{
			return true;
		}
		// step 1- find mid
		Node mid=findMid(head);
		
		// step2 reverse 2nd half
	
		Node prev=null;
		Node curr=mid;
		Node next;
		while(curr!=null)
		{
		    next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		Node right=prev;  // right half head
		Node left=head;
		
		// check left half & right half
		while(right!=null)
		{
			if(left.data!=right.data)
			{
				return false;
			}
			left=left.next;
			right=right.next;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedList ll=new LinkedList();
	 PalindromeLL p=new PalindromeLL();
		
		
	
		p.addLast(1);
		p.addLast(2);	
		p.addLast(3);
		p.addLast(2);
		p.addLast(1);
		p.print();
	
		
		System.out.println(p.checkPalindrome());
		
		
		
	}

}
