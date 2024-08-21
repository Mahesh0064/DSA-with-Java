package com.functions;

public class Product {
	
	public static int printProduct(int a,int b)
	{
		int product=a*b;
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=5;
		int prod=printProduct(a, b);
		System.out.println("product of two number is : "+prod);
		

	}

}
