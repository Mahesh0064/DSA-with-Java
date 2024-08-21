package com.loops;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10899;
		
		// 1 st method
		System.out.println(n);
		while(n>0)
		{
			int lastdigit=n%10;
			System.out.print(lastdigit);
			n=n/10;
		}
		// 2nd method
		int rev=0;
		int n1=56978;
		int n2=n1;
		while(n1>0)
		{
			int lastdigit=n1%10;
			rev=(rev*10)+lastdigit;
			n1=n1/10;
		}
		System.out.println();
    System.out.println("Reverse number of "+n2+" is : "+rev);
	}

}
