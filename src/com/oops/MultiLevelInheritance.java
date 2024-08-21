package com.oops;

public class MultiLevelInheritance {

	public static void main(String[] args) {
	
		Dog d=new Dog();
		d.breath();
		d.eat();
		d.legs=4;
		System.out.println(d.legs);
	}

}
// base class
class Animal1
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
class Mammal extends Animal1
{
	int legs;
	
	
}

class Dog extends Mammal
{
	String breed;
}