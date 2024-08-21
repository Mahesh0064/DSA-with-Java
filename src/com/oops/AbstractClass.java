package com.oops;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Horse h=new Horse();
		h.eat();
		h.walk();
		Chicken ch=new Chicken();
		ch.eat();
		ch.walk();
		
		System.out.println(h.color);
		
		Mustang m=new Mustang();

	}

}

abstract class Animals
{
	 String color;
	 
	 Animals()
	 {
		 color="brown";
	 }
	void eat()
	{
		System.out.println("Animals are eating");
	}
	
	abstract void walk();
	
}
class Horse extends Animals
{
	Horse()
	{
		System.out.println("Horse constructor is called ");
	}
	void changeColor()
	{
		color="dark brown";
	}
	void walk()
	{
		System.out.println("walks on 4 legs");
	}
}
class Mustang extends Horse
{
Mustang() {
		// TODO Auto-generated constructor stub
		System.out.println("Mustang construtor is called");
	}
}
class Chicken extends Animals
{
	void changeColor()
	{
		color="yellow";
	}
	void walk()
	{
		System.out.println("walks on 2 legs");
	}
}