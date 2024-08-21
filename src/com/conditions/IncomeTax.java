package com.conditions;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your income : ");
		int income=sc.nextInt();
		int tax;
		if(income<500000)
		{
			tax=0;
		}
		else if(income>=500000 && income<1000000)
		{
			tax=(int)(income*.2);
		}
		else
		{
			tax=(int)(income*.3);
		}
		
		System.out.println("Your tax amount is : "+tax);

	}

}
