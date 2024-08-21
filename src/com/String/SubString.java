package com.String;

public class SubString {
 
	public static String subString(String s, int si, int ei)
	{
		String substr="";
		for(int i=si; i<ei; i++)
		{
			substr+=s.charAt(i);
		}
		return substr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ShvamKumar";
		
	String str=	subString(s, 3,6 );
	System.out.println("Sub String is :"+str);
	System.out.println(s.substring(2,6));

	}

}
