package com.String;

public class compareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String fruits[]= {"apple", "banana", "mango", "coconut"};
    String largest=fruits[0];
    
    for(int i=1; i<fruits.length;i++)
    {
    	if(largest.compareTo(fruits[i])<0)
    	{
    		largest=fruits[i];
    	}
    	}
    
	System.out.println("Largest Fruits : "+largest);
	
	String str1="Mahesh";
	String str2="Mahesh";
	String str3=new String("Mahesh");
	 
	if(str1==str2)
	{
		System.out.println("Strings are equals");
	}
	else
	{
		System.out.println("Strings are not equals");
	}
	if(str1==str3)
	{
		System.out.println("Strings are equals");
	}
	else
	{
		System.out.println("Strings are not equals");
	}
	if(str1.equals(str3))
	{
		System.out.println("String s1 and s3 are equals");
	}

}
}