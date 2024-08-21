package com.loops;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int counter=0;
      while(counter<100)
      {
    	  System.out.println(counter+" Hello World");
    	  counter++;
      }
      System.out.println("printed 100 times");
      
      int count=1;
      while(count<=10)
      {
    	  System.out.print(count+" ");
    	  count++;
      }
      System.out.println();
      System.out.println();
      
      // numbers 1 to n
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any numbers : ");
      int n=sc.nextInt();
      int i=1;
      while(i<=500)
      {
    	  System.out.print(i+" ");
    	  i++;
      }
	}

}
