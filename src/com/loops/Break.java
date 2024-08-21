package com.loops;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=5; i++)
		{
			if(i==3)
			{
				break;
			}
			System.out.println(i+" ");
		}
		System.out.println("I am out of the box");
	}

}
