package com.oops;

public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentM s1=new StudentM();
		s1.schoolName="Bansal";
		
	System.out.println(s1.schoolName);
	StudentM s2=new StudentM();
	 System.out.println(s2.schoolName);
	 
	}

}
class StudentM
{
	 static int percentage(int math, int phy, int chem)
	 {
		 return (math+chem+phy)/3;
	 }
	String name;
	int rollno;
	static String schoolName;
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return this.name;
	}
}
