package com.linkedlist;

public class RecursiveSearch {

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
	
	public int helper(Node head, int key)
	{
		if(head==null)
		{
			return -1;
		}
		
		if(head.data==key)
		{
			return 0;
		}
		int idx=helper(head.next, key);
		if(idx==-1)
		{
			return -1;
		}
		return idx+1;
	}
	
	public int recSearch(int key)
	{
		return helper(head,key);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedList ll=new LinkedList();
	 RecursiveSearch ll=new RecursiveSearch();
		
		
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.add(2,3);
		ll.print();
		
		System.out.println(ll.recSearch(5));
		System.out.println(ll.recSearch(100));
		
	}

}
