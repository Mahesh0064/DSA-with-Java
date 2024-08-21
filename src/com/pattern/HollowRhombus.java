package com.pattern;

public class HollowRhombus {
	
	public static void hollo_rhombus(int n)
	{
		for(int i=1; i<=n; i++)
		{
			// spaces
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			
			// hollo rectangle -stars
			for(int j=1; j<=n; j++)
			{
				if(i==1 || i==n || j==1 || j==n)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hollo_rhombus(7);

	}

}
