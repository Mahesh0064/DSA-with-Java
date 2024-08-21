package com.pattern;

public class FloydTriangle {
	
	public static void floydTriangle(int n)
	{
		int counter=1;
		// outer loop
		for(int i=1; i<=n; i++)
		{
			// inner loop-numbers
			for(int j=1; j<=i; j++)
			{
				System.out.print(counter+" ");
				counter++;
			}
			
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		floydTriangle(5);
	}

}
