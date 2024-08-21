package com.linkedlist;



public class RemoveNthNode {
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
	
	public void deleteNthfromEnd(int n)
	{
		// calculate size of LL
		int sz=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			sz++;
		}
		
		if(n==sz)
		{
			head=head.next;  // Remove First
			return ;
		}
		
		// sz-n
		int i=1;
		int iTofind=sz-n;
		Node prev=head;
		while(i<iTofind)
		{
			prev=prev.next;
			i++;
		}
		prev.next=prev.next.next;
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedList ll=new LinkedList();
	 RemoveNthNode ll=new RemoveNthNode();
		
		
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.add(2,3);
		ll.print();
		
		ll.deleteNthfromEnd(3);
		ll.print();
		
		
		
		
	}

}
