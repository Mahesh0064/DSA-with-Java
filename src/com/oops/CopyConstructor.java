package com.oops;

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1=new Employee1();
		
		e1.name="Shivam";
		e1.salary=3456;
		 e1.marks[0]=100;
		 e1.marks[1]=200;
		 e1.marks[2]=300;
		 
		Employee1 e2=new Employee1(e1);
               e2.password="xyz";
               e2.marks[2]=500;
               
               for(int i=0;i<3; i++)// copy constructor
               {
            	   System.out.println(e2.marks[i]);
               }
               System.out.println(e2.marks[2]);

	}

}
class Employee1
{
	String name;
	int salary;
	String password;
	int marks[];
	
	Employee1(Employee1 e1)
	{
		marks=new int[3];
		this.name=e1.name;
		this.salary=e1.salary;
		this.marks=e1.marks;
		
	}
	
	Employee1(){// non parametersise constructor
		System.out.println("Non Parametarise contructor");
		
	   marks=new int[3];
	}
	
	Employee1(int salary)// parametarise
	{
		this.salary=salary;
	    marks=new int[3];
	}
	
	
	Employee1(String name){
		this.name=name;
		marks=new int[3];
	}
}
