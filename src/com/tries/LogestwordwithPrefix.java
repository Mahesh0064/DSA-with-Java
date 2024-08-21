package com.tries;

public class LogestwordwithPrefix {
	
	static class Node
	{
		Node children[]=new Node[26];  // a-z
		boolean eow;
		
		Node()
		{
			for(int i=0; i<26; i++)
			{
				children[i]=null;
			}
		}
	}
public static Node root=new Node();

 public static void insert(String word)
{    
	 int level=0;
	 int len=word.length();
	 int idx=0;
	Node curr=root;
	for(; level<len; level++)
	{
	    idx=word.charAt(level)-'a';  // for index
		
		if(curr.children[idx]==null)
		{
			curr.children[idx]=new Node();
		}
		
		curr=curr.children[idx];
	}
	curr.eow=true;
}

 public static boolean search(String key)
 {
	 int level=0;
	 int len=key.length();
	 int idx=0;

 	Node curr=root;
 	for(; level<len; level++)
 	{
 		 idx=key.charAt(level)-'a';  // for index
 		
 		if(curr.children[idx]==null)
 		{
 			return false;
 		}
 		curr=curr.children[idx];	
 	}
 	return curr.eow==true;	
 }

 public static String ans="";
 
 public static void longestWord(Node root, StringBuilder temp)
 {
	 if(root==null)
	 {
		 return ;
	 }
	 for(int i=0; i<26; i++)
	 {
		 if(root.children[i]!=null && root.children[i].eow==true)
		 {
			 char ch=(char)(i+'a');
			 temp.append(ch);
			 if(temp.length()>ans.length())
			 {
				 ans=temp.toString();
			 }
			 longestWord(root.children[i], temp);
			 temp.deleteCharAt(temp.length()-1);
		 }
	 }
 }
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word[]= {"a","banana","app","appl","ap","apply","apple"};
		
		// suffix ->insert in tries
		for(int i=0; i<word.length; i++) {
			
		    insert(word[i]);
		}
	longestWord(root,new StringBuilder(""));
	System.out.println(ans);
	}

}
