package com.backtracking;

public class SubSet {

	public static void findSubset(String str, String ans, int i)
	{
		// base case
		if(i==str.length())
		{
			if(ans.length()==0)
			{
				System.out.println("null");
			}
			else
			{
			System.out.println(ans);
			}
			return;
		}
		
		//choice yes
		
		findSubset(str, ans+str.charAt(i), i+1);
		
		// choice No
		
		findSubset(str, ans, i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc";
		
		findSubset(str, "", 0);

	}

}
