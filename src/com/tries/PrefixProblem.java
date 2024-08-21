package com.tries;


public class PrefixProblem {
	
	static class Node
	{
		Node[] children=new Node[26];
		boolean eow=false;
		int freq;
		
		public Node()
		{
			for(int i=0;i<children.length; i++)
			{
				children[i]=null;
				
			}
			freq=1;
		}
	}
 public static Node root=new Node();
 
 public static void insert(String word)
{
	Node curr=root;
	
	for(int level=0; level<word.length(); level++)
	{
		int idx=word.charAt(level)-'a';  // for index
		
		if(curr.children[idx]==null)
		{
			curr.children[idx]=new Node();
		}
		else
		{
			curr.children[idx].freq++;
		}
		
		curr=curr.children[idx];
	}
	curr.eow=true;
}
 
 public static void findPrefix(Node root, String ans)
 {  
	 // base case
	 if(root==null)
	 {
		 return;
	 }
	 // base case
	 if(root.freq==1)
	 {
		 System.out.println(ans);
		 return;
	 }
	 for(int i=0; i<root.children.length; i++)
	 {
		 if(root.children[i]!=null)
		 {
			 findPrefix(root.children[i], ans+(char)(i+'a'));
		 }
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"zebra","dog","duck","dove"};
		
		for(int i=0; i<arr.length; i++)
		{
			insert(arr[i]);
		}
		
		root.freq=-1;
		
		findPrefix(root, "");

	}

}
