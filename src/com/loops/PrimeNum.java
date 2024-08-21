package com.loops;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter any numbers : ");
	      int n=sc.nextInt();
	      boolean isPrime=true;
	      if(n==2)
	      {
	    	  System.out.println(n+ " is prime number");
	      }
	      else
	      {
	      for(int i=2; i<=n-1; i++)
	      {
	    	  if(n%i==0)  // n is multiple of i (i not equal to 1 or n)
	    	  {
	    		  isPrime=false;
	    	  }
	      }
	      }
	      if(isPrime==true)
	      {
	    	  System.out.println(n+" is prime number");
	      }
	      else
	      {
	    	  System.out.println(n+ " is not a prime number");
	      }

	}

}
