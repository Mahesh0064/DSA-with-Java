package com.oops;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		Employee emp1=new Employee("Mahesh");
		Employee emp2=new Employee(4500);
		System.out.println(emp2.salary);
	}

}
class Employee
{
	String name;
	int salary;
	
	Employee(){// non parametersise constructor
		System.out.println("Non Parametarise contructor");
	}
	
	Employee(int salary)// parametarise
	{
		this.salary=salary;
	}
	
	Employee(String name){
		this.name=name;
	}
}
