package com.TwoDarray;

public class SpiralMatrix {

	 public static void spiralMatrix(int a[][])
	 {
		 int startrow=0;
		 int endrow=a.length-1;
		 int startcol=0;
		 int endcol=a[0].length-1;
		 
		 while(startrow<=endrow && startcol<=endcol)
		 {
			 // top
			 for(int j=startcol; j<=endcol; j++)
			 {
				 System.out.print(a[startrow][j] + " ");
			 }
			 
			 // right
			 for(int i=startrow+1; i<=endrow; i++)
			 {
				 System.out.print(a[i][endcol] + " ");
			 }
			 
			 // Bottom
			 for(int j=endcol-1; j>=startcol; j--)
			 {
				 if(startrow==endrow)
				 {
					 break;
				 }
				 System.out.print(a[endrow][j] + " ");
			 }
			 
			 // left
			 for(int i=endrow-1; i>=startrow+1; i--)
			 {
				 if(startcol==endcol)
				 {
					 break;
				 }

				 System.out.print(a[i][startcol] + " ");
			 }
			 startrow++;
			 startcol++;
			 endcol--;
			 endrow--;
			 
			 
		 }
		 System.out.println();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		spiralMatrix(a);
		

	}

}
