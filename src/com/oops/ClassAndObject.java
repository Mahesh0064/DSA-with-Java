package com.oops;

public class ClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen p1=new Pen();// created a pen object called p1
		p1.setColor("Red");
		p1.setTip(20);
		System.out.println("color of the pen is :"+p1.color);
		System.out.println("tip of the pen is :"+p1.tip);
		
		Student s=new Student();// created a student object called s
		s.calcuPercentage(89, 40, 78);
		System.out.println("perentage of student is :"+s.percentage);

	}

}
 class Pen
 {
	 int tip;
	 String color;
	 
	 void setTip(int newTip)
	 {
		 tip=newTip;
	 }
	 
	 void setColor(String newColor)
	 {
		 color=newColor;
	 }
	 
 }
 
 class Student{
	 int age;
	 String name;
	 float percentage;
	 
	 void calcuPercentage(int math, int chem, int phy) {
		 
		 percentage=(math+chem+phy)/3;
		 
	 }
 }
