package com.oops;

public class HierarchialInheritance {

	public static void main(String[] args) {
		
		Dog2 d=new Dog2();
		d.breath();
		d.eat();
		d.barking();
		
		Fish2 f=new Fish2();
		f.eat();
		f.breath();
		f.swim();
		
		Mammal2 m=new Mammal2();
		m.eat();
		m.breath();
		m.walk();
	}

}
// base class
class Animal2
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
class Mammal2 extends Animal2
{
	 void walk()
	 {
		 System.out.println("Mammals are walking");
	 }
	
	
}

class Dog2 extends Animal2
{
	void barking()
	{
		System.out.println("Dogs are barking");
	}
}
class Fish2 extends Animal2
{
	 void swim()
	 {
		 System.out.println("Fish are swimming");
	 }
}