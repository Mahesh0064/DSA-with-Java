package com.String;

import java.util.Scanner;

public class StringMethods {
	
	public static void print(String str)
	{
		for(int i=0; i<str.length(); i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//String name=sc.next();// only one word
		System.out.println("Enter any string");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();// it print one line
		
		System.out.println(name);
		System.out.println("length of string is :"+name.length());
		System.out.println();
		
		// concatenation of string
		 String fname="mahesh";
		 String lname="kumar";
		 String fullname=fname +" "+lname;
		 System.out.println("full name is : "+fullname);
		 
		 // charAt
		 System.out.println("index :"+name.charAt(0));
		 
		 print(fullname);
		
	}

}
