package com.binarytree;

import com.binarytree.CountofNodes.Node;

public class SumofNodes {

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
	
	public static int sumOfNodes(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		
		int leftSum=sumOfNodes(root.left);
		int rightSum=sumOfNodes(root.right);
		
		return leftSum+rightSum+root.data;
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
		
		System.out.println("Sum of nodes in my Binary Tree is  = "+sumOfNodes(root));

	}

}
