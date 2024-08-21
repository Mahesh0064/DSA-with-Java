package com.pattern;

public class Inverted_PyramidWithNum {
	
	public static void inverted_rotated_half_pyramidwithNum(int n)
	{
		// outer loop
		for(int i=1; i<=n; i++)
		{
			// inner loop-numbers
			for(int j=1; j<=n-i+1; j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inverted_rotated_half_pyramidwithNum(7);

	}

}
