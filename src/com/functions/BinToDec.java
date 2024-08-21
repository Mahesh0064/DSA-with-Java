package com.functions;

public class BinToDec {
	
	public static void binToDec(int binNum)
	{
		int pow=0;
		int decNum=0;
		int myNum=binNum;
		while(binNum>0)
		{
			int lastDigit=binNum%10;
			decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
			pow++;
			binNum=binNum/10;
		}
		System.out.println("Decimal number of "+myNum+" is : "+decNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		binToDec(10111);

	}

}
