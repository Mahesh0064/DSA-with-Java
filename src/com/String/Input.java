package com.String;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		char a[]= {'a','b','c','d'};
		
		String str="abcd";
		String str2=new String("abcd");
		
		System.out.println(str);
		System.out.println(str2);
		Scanner sc=new Scanner(System.in);
		
		//String name=sc.next();// only one word
		System.out.println("Enter any string");
		String name=sc.nextLine();// it print one line
		
		System.out.println(name);
		System.out.println("length of string is :"+name.length());
		
		
		

	}

}
