package com.loops;

import java.util.Scanner;

public class SumofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter any numbers : ");
	      int n=sc.nextInt();
	      int i=1;
	      int sum=0;
	      while(i<=n)
	      {
	    	  sum=sum+i;
	    	  i++;
	      }
	      System.out.println("Sum of "+n+" is :"+sum);
	}

}
