package com.variables;

import java.util.Scanner;

public class RadiusOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter radius of circle :");
		float rad=sc.nextFloat();
		float area=3.14f*rad*rad;
		
		System.out.println("Area of Circle is : "+area);
		
	}

}
