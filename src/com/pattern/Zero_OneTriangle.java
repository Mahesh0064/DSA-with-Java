package com.pattern;

public class Zero_OneTriangle {
	
	public static void zeroOneTriangle(int n)
	{
		int counter=1;
		// outer loop
		for(int i=1; i<=n; i++)
		{
			// inner loop-numbers
			for(int j=1; j<=i; j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
				
			}
			
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		zeroOneTriangle(7);
	}

}
