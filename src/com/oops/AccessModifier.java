package com.oops;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount bankAcc=new BankAccount();
		
		bankAcc.username="maheshkumar";
        bankAcc.setPassword("mahi@123");
	}

}
class BankAccount
{
	String username;
	private String password;
	
	public void setPassword(String pwd)
	{
		password=pwd;
	}
	
}
