package com.TwoDarray;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Entre the element in Matrix :");
		// input
		int n=a.length,m=a[0].length;
		for(int i=0; i<n; i++) {
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		//output
		for(int i=0; i<n; i++) {
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
