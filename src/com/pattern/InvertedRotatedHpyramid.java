package com.pattern;

public class InvertedRotatedHpyramid {
	
	public static void inverted_rotated_half_pyramid(int n)
	{
		// outer loop
		for(int i=1; i<=n; i++)
		{
			// spaces
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			// stars
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 inverted_rotated_half_pyramid(7);
	}

}
