package com.binarytree;


public class KthAncestor {

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
	
	public static int lcaDist(Node root , int n)
	{
		if(root==null)
		{
			return -1;
		}
		
		if(root.data==n)
		{
			return 0;
		}
		
		int leftDist=lcaDist(root.left,n);
		int rightDist=lcaDist(root.right,n);
		
		if(leftDist==-1 && rightDist==-1)
		{
			return -1;
		}
		else if(leftDist==-1)
		{
			return rightDist+1;
		}
		else
		{
			return leftDist+1;
		}
		
	}
	
	
	
	public static int kAncestor(Node root, int n, int k)
	{
		if(root==null)
		{
			return -1;
		}
		if(root.data==n)
		{
			return 0;
		}
		int leftDist=kAncestor(root.left, n, k);
		int rightDist=kAncestor(root.right, n, k);
		
		if(leftDist==-1 && rightDist==-1)
		{
			return -1;
		}
		int max=Math.max(leftDist, rightDist);
		if(max+1==k)
		{
			System.out.println(root.data);
		}
		
		return max+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		         1
		         /\
		        2  3
		       /\  /\
		      4 5  6 7
		     
		 */
		
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
	    int n=4,k=1;
	    
	  kAncestor(root, n, k);

	}

}
