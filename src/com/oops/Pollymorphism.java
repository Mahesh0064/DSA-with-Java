package com.oops;

public class Pollymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator2 cal=new Calculator2();
		
		System.out.println(cal.sum(33,44));
		
		System.out.println(cal.sum(45.6f,55.6f));
		
		System.out.println(cal.sum(11,22,33));

	}

}
class Calculator2
{
	
	int sum(int a,int b)
	{
		return a+b;
	}
	
	float sum(float a, float b)
	{
		return a+b;
	}
	
	int sum(int a, int b, int c)
	{
		return a+b+c;
	}
}