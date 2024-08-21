package com.oops;

import com.variables.Sum;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		System.out.println(cal.sum(2,3));
		System.out.println(cal.sum((float)4.5, (float)5.8));
		System.out.println(cal.sum(4, 45,55));

	}

}

class Calculator
{
	int sum(int a, int b)
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