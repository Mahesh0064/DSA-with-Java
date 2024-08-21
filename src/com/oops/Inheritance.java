package com.oops;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish f=new Fish();
		f.eat();
		f.breath();
		f.swim();

	}

}
// base class
class Animal
{
	String color;
	
	 void eat()
	 {
		 System.out.println("Animal is eating");
	 }
	 void breath()
	 {
		 System.out.println("Animal is breathing");
	 }
}
// derieved class
class Fish extends Animal
{
	int fins;
	
	void swim()
	{
		System.out.println("swimming in water");
	}
}