package com.functions;

public class SwapNum {
	
	public static void printSwap(int a,int b)
	{
		// swap
				int temp=a;
				a=b;
				b=temp;
				
				System.out.println("A : "+a);
				System.out.println("B : "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sawp   -> exchange
		int a=5;
		int b=10;
		
		printSwap(a,b);

	}

}
