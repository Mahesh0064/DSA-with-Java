package com.recursion;


public class RemoveDuplicate {

	  public static void removeDuplicate(String str ,int indx , StringBuilder newStr,boolean map[]) {
		  
		  if(indx==str.length())
		  {
			  System.out.println(newStr);
			  return;
		  }
		  
		  // logic
		  char curChar=str.charAt(indx);
		  if(map[curChar-'a']==true)
		  {
			 //duplicate
			  removeDuplicate(str, indx+1, newStr, map);
		  }
		  else {
			  map[curChar-'a']=true;	
			  removeDuplicate(str, indx+1, newStr.append(curChar), map);
		  }
		 
	  }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="appnacollege";
		removeDuplicate(str, 0, new StringBuilder(""), new boolean[25]);
		
	}

}
