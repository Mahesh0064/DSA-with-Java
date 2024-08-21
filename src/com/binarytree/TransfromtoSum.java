package com.binarytree;

public class TransfromtoSum {

	static class Node
	{
		int data;
		Node left,right;
		
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	

	public static Node lca2(Node root, int n1, int n2)
	{
		if(root==null|| root.data==n1 || root.data==n2)
		{
			return root;
		}
		
		Node leftLca=lca2(root.left, n1, n2);
		Node rightLca=lca2(root.right, n1, n2);
		
		// leftLca= val rightLca=null
		if(rightLca==null)
		{
			return leftLca;
		}
		if(leftLca==null)
		{
			return rightLca;
		}
		
		return root;
	}
	
	public static int transform(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftChild=transform(root.left);
		int rightChild=transform(root.right);
		
		int data=root.data;
		int newLeft=root.left==null?0:root.left.data;
		int newRight=root.right==null?0:root.right.data;
		root.data=newLeft+ leftChild + newRight + rightChild;
		return data;
	}
	
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		         1
		         /\
		        2  3
		       /\  /\
		      4 5  6 7
		     
		
		 expected sum of tree is 
	
        27
        /\
       9  13
      /\  /\
     0 0  0 0
    
*/


		
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
	    int n=4,k=1;
	    
        transform(root);
        preorder(root);

	}

}
