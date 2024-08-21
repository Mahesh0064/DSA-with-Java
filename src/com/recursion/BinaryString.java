package com.recursion;

public class BinaryString {
	
	public static void binaryString(int n, int lastPlace, String str)
	{
		
		// basecase
		if(n==0)
		{
			System.out.println(str);
			return;
		}
		/*
		if(lastPlace==0)
		{
			binaryString(n-1, 0, str.append("0"));

			binaryString(n-1, 1, str.append("1"));
		
		}
		else
		{

			binaryString(n-1, 0, str.append("0"));
		
		}
		*/

		binaryString(n-1, 0, str+"0");
	
		if(lastPlace==0)
		{

			binaryString(n-1, 1, str+"1");
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		binaryString(3, 0, "");
	}

}
