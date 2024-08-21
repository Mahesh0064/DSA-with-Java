package com.functions;

public class BionomialCofficient {
	
	public static int printFact(int n)
	{
		int f=1;
		for(int i=1; i<=n; i++)
		{
			f=f*i;
		}
		
		return f;
	}

	public static int binCoff(int n,int r)
	{
		int fact_n=printFact(n);
		int fact_r=printFact(r);
		int fact_nmr=printFact(n-r);
		
		int binCoff=fact_n/(fact_r*fact_nmr);
		return binCoff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(binCoff(5, 2));

	}

}
