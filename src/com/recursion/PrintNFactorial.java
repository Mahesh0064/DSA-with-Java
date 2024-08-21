package com.recursion;

public class PrintNFactorial {

	public static int printFact(int n) {
		
		if(n==0) {
			return 1;
		}
		int fnm=printFact(n-1);
		 int fn=n*printFact(n-1);
		  return fn;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
	System.out.println("Factorial of "+n +" is : "+ printFact(n));

	}

}
