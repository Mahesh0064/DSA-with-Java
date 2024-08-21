package com.variables;
import java.util.*;

public class InputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter your name :");
//		String name=sc.next(); // for  single word
		String name1=sc.nextLine();// for multiple word
		System.out.println(name1);
//		System.out.println("Your name is : "+name);
		System.out.println("Enter your first number : ");
		int a=sc.nextInt();
		System.out.println("Enter your Second number : ");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Sum is : "+sum);
		
		int product=a*b;
		System.out.println("Product is : "+product);
	}

}
