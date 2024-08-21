package com.pattern;

public class CharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
char ch='A';
// outer loop
		for(int i=1; i<=n; i++)
		{
			// inner loop
			for(int j=1; j<=i; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}







