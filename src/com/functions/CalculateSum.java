package com.functions;

import java.util.Scanner;

public class CalculateSum {
	
	public static void printSum(int num1,int num2)  // parameters or formal parameters
	{
		int sum=num1+num2;
		System.out.println("Sum is : "+sum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		
		printSum(a,b); // arguments or actual parameters

	}

}
