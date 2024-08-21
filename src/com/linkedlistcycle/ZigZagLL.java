package com.linkedlistcycle;

public class ZigZagLL {

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
		
		if(head == 		null)
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
	
	public void zigZag()
	{
		// find mid
		Node slow=head;
		Node fast=head.next;
		
		while(fast !=null && fast.next !=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		 Node mid=slow;
		 
		 // reverse 2nd half
		 Node curr=mid.next;
		 mid.next=null;
		 Node prev=null;
		 Node next;
		 while(curr !=null)
		 {
			 next=curr.next;
			 curr.next=prev;
			 prev=curr;
			 curr=next;
		 }
		 
		 Node left=head;
		 Node right=prev;
		 Node nextL, nextR;
		 
		 // alt merge -zig-zag merge
		 
		 while(left !=null && right !=null)
		 {
			 nextL=left.next;
			 left.next=right;
			 nextR=right.next;
			 right.next=nextL;
			 
			 left=nextL;
			 right=nextR;
		 }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		LinkedList ll=new LinkedList();
//		ll.print();
//		ll.addFirst(2);
//		ll.print();
//		ll.addFirst(1);
//		ll.print();
//		ll.addLast(3);
//		ll.print();
//		ll.addLast(4);
//		ll.print();
		
		ZigZagLL ll=new ZigZagLL();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		// 1->2->3->4->5->6
		ll.print();
		ll.zigZag();
		ll.print();

	}

}
