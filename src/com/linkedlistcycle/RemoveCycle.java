package com.linkedlistcycle;

public class RemoveCycle {

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
	
	// addFirst method
	public void addFirst(int data)
	{
		// step 1-> create new node
		Node newNode=new Node(data);
		
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
	
	// addLast method
	public void addLast(int data) {
		
		Node newNode=new Node(data);
		
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
			System.out.println("Linked listis empty");
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
	
	public static boolean isCycle()
	{
		Node slow=head;
		Node fast=head;
		
		while(fast !=null && fast.next !=null)
		{
			slow=slow.next; //+1
			fast=fast.next.next;  // +2
			if(slow==fast)
			{
				return true;  // cycle exist
			}
		}
		
		return false; // cycle does not exist
	}
	
	public static void removeCycle()
	{
		// detect cycle
		Node slow=head;
		Node fast=head;
		boolean cycle=false;
		while(fast !=null && fast.next !=null)
		{
			slow=slow.next; // +1
			fast=fast.next.next;  // +2 
			if(fast==slow)
			{
				cycle=true;
				break;
			}
		}
		
		if(cycle==false)
		{
			return;
		}
		
		// find meeting point
		slow=head;
		Node prev=null; // last node
		while(slow !=fast)
		{
			prev=fast;
			slow=slow.next;
			fast=fast.next;
		}
		
		// remove cycle--> last.next=null
		prev.next=null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedListCycle ll=new LinkedListCycle();
		head=new Node(1);
		Node temp=new Node(2);
		head.next=temp;
		head.next.next=new Node(3);
		head.next.next.next=temp;
		
		System.out.println(isCycle());
		removeCycle();
		System.out.println(isCycle());
		
		
	
	}

}
