package com.linkedlist;

public class RemoveLast {

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
	
	public int removeFirst()
	{
		if(size==0)
		{
			System.out.println("LL is Empty");
			return Integer.MIN_VALUE;
		}
		else if(size==1)
		{
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		int val=head.data;
		head=head.next;
		size--;
		return val;
	}
	
	public int RemoveLast()
	{
		 if(size==0)
		 {
			 System.out.println("LL is Empty");
			 return Integer.MIN_VALUE;
		 }
		 else if(size==1)
		 {
			 int val=head.data;
			 head=tail=null;
			 size=0;
			 return val;
		 }
		 // prev : i=size-2
		 Node prev=head;
		 for(int i=0; i<size-2; i++)
		 {
			 prev=prev.next;
		 }
		 int val=prev.next.data;// or tail.data
		 prev.next=null;
		 tail=prev;
		 size--;
		 return val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedList ll=new LinkedList();
	 RemoveLast ll=new RemoveLast();
		
		
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.add(2,3);
		ll.print();
		
		ll.removeFirst();
		ll.print();
		System.out.println("size of Linked List is :"+ll.size);
		ll.RemoveLast();
		ll.print();
		System.out.println("size of LL is : "+ll.size);
	}

}
