package com.String;

public class Concatenate {
	
	public static void printLetters(String str)
	{
		for(int i=0 ; i<str.length(); i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName="Mahesh";
		String lastName="Kumar";
		String fullName=firstName+" "+lastName;
		
		System.out.println(fullName);
		
		// charAt
		System.out.println(fullName.charAt(2));
		
		printLetters(fullName);

	}

}
