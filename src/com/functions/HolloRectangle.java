package com.functions;

public class HolloRectangle {
	
	public static void holloRect(int totalRows,int totalCols)
	{
		for(int i=1; i<=totalRows; i++)
		{
			for(int j=1; j<=totalCols; j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
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
		
		holloRect(5,5);
	}

}
