package com.arrays;

import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[]=new int[100];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks of physics , chemistry and maths ");
		
		marks[0]=sc.nextInt();  // phy
		marks[1]=sc.nextInt();  // chem
		marks[2]=sc.nextInt();  // math
		
		System.out.println("Physics : "+marks[0]);
		System.out.println("Chemistry : "+marks[1]);
		System.out.println("Maths : "+marks[2]);
		marks[2]=100;
		System.out.println("Maths : "+marks[2]);
		int percentage=(marks[0]+marks[1]+marks[2])/3;
		System.out.println("Percentage : "+percentage+" %");
		System.out.println("Length of array : "+marks.length);

	}

}
