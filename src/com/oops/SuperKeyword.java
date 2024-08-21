package com.oops;

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HorseS ss=new HorseS();
    System.out.println(ss.color);
	}

}
class AnimalDetails
{
	String color;
	AnimalDetails()
	{
		System.out.println("Animal consrutor is called");
	}
}
class HorseS extends AnimalDetails
{
	 HorseS()
	 {
		 super();
		 super.color="red";
		 System.out.println("Horse constructor is called");
	 }
}