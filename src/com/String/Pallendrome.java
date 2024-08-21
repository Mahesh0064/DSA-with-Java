package com.String;

public class Pallendrome {

	 public static boolean isPallendrome(String str)
	 {
		 for(int i=0; i<str.length()/2; i++) {
			 int n=str.length();
			 if(str.charAt(i)!=str.charAt(n-i-1))
					 {
				 // not a palindrome
				 return false;
					 }
		 }
		 return true;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="noon";
    
    System.out.println(isPallendrome(str));

}
}