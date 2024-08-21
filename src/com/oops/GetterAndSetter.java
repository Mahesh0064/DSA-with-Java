package com.oops;

public class GetterAndSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDetail st=new StudentDetail();
		st.setName("Mahesh");
		System.out.println("name of student : "+st.getName());
		st.setRollNo(2155950);
		System.out.println("roll no of student : "+st.getRollNo());

	}

}

class StudentDetail
{
	private int rollno;
	String name;
	
	String getName()
	{
		return name;
	}
	
	int getRollNo() {
		return rollno;
	}
	void setRollNo(int rollno) {
		this.rollno=rollno;
	}
	
	void setName(String name1) {
		name=name1;
	}
	
}