package com.backtracking;

public class FindPermutation {

	public static void findPermutation(String str, String ans)
	{
		// base case
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		// Recursion
		for(int i=0; i<str.length(); i++)
		{
			char curr=str.charAt(i);
			
			// "abcde"="ab"+"de" ="abde"
			String newStr=str.substring(0,i)+ str.substring(i+1);
			findPermutation(newStr, ans+curr);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="abc";
    findPermutation(str, "");
	}

}
