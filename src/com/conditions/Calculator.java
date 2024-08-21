package com.conditions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Numer :");
		int a=sc.nextInt();
		System.out.println("Enter Second Numer :");
		int b=sc.nextInt();
		System.out.println("Enter first Numer :");
		char operator=sc.next().charAt(0);
		switch(operator)
		{
		case '+': System.out.println("add : "+(a+b));
		break;
		case '-': System.out.println("sub : "+(a-b));
		break;
		case '*': System.out.println("multiply : "+(a*b));
		break;
		case '%': System.out.println("Madulo :"+(a%b));
		break;
		default:System.out.println("None");
		}

	}

}
