package com.oops;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deer d=new Deer();
		d.eat();
		
	}

}
class Animal3
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}

class Deer extends Animal3
{
	void eat()
	{
		System.out.println("Deer is eating green grass");
	}
}