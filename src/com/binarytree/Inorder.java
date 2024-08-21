package com.binarytree;

public class Inorder {
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
		
		public static void inorder(Node root)
		{
			if(root==null)
			{
				return;
			}
			
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BinaryTr tree=new BinaryTr();
		Node root=tree.buildTree(nodes);
		tree.inorder(root);

	}

}
