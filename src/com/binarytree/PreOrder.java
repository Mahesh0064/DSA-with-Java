package com.binarytree;

public class PreOrder {

	static class Node
	{
		int data;
		Node right;
		Node left;
		
		Node(int data)
		{
			this.data=data;
			this.right=null;
			this.left=null;
		}
	}
	static class BinaryTr
	{
		static int idx=-1;
		public static Node buildTree(int nodes[])
		{
			idx++;
			if(nodes[idx]==-1)
			{
				return null;
			}
			
			Node newNode=new Node(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			
			return newNode;
		}
		
		public static void preorder(Node root)
		{
			if(root==null)
			{
				return;
			}
			System.out.print(root.data+ " ");
			preorder(root.left);
			preorder(root.right);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BinaryTr tree=new BinaryTr();
		Node root=tree.buildTree(nodes);
		tree.preorder(root);

	}

}
