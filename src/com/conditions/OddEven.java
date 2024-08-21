package com.conditions;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numer : ");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}

}
