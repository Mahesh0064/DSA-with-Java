package com.linkedlist;

public class AddMiddle {

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
	
	// addfirst method
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
	
	// addlast method
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
	
	// add middle
	public void add(int idx,int data)
	{
		if(idx==0)
		{
			addFirst(data);
			return;
		}
		Node newNode =new Node(data);
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedList ll=new LinkedList();
		AddMiddle ll=new AddMiddle();
		
		
		ll.addFirst(2);
		
		ll.addFirst(1);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.add(2,9);
		ll.print();

	}

}
