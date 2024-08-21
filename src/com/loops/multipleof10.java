package com.loops;

import java.util.Scanner;

public class multipleof10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	Scanner sc=new Scanner(System.in);
	 do
	 {
		 System.out.println("Enter your number :");
		 int n=sc.nextInt();
		 if(n%10==0)
		 {
			 break;
		 }
		 System.out.println(n);
	 }while(true);
	 
	 System.out.println("I am out of the loop");
	}

}
