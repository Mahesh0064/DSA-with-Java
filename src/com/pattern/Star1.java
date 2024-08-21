package com.pattern;

public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// outer loop
		for(int i=0; i<4; i++)
		{
			// inner loop
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
