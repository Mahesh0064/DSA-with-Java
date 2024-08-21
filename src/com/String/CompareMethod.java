package com.String;

public class CompareMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="mahesh";
		String s2="mahesh";
		String s3=new String("mahesh");
		
		if(s1==s2)
		{
			System.out.println("s1 and s2 are equals");
		}
		else
		{
			System.out.println("s1 and s2 are not equals");
		}
		if(s1==s3)
		{
			System.out.println("s1 and s3 are equals");
		}
		else
		{
			System.out.println("s1 and s3 are not equals");
		}
		if(s1.equals(s3))
		{
			System.out.println("s1 and s3 are equals");
		}
		else
		{
			System.out.println("s1 and s3 are not equals");
		}
	}

}
