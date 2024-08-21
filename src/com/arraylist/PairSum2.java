package com.arraylist;

import java.util.ArrayList;

public class PairSum2 {
	
	public static boolean pairSum2(ArrayList<Integer> list, int target)
	{
		int bp=-1;
		int n=list.size();
		for(int i=0; i<list.size(); i++)
		{
		if(list.get(i)>list.get(i+1))	// breakig point
		{
			bp=i;
			break;
		}
			
		}
		int lp=bp+1;    // smallest
		int rp=bp;     // largest
		while(lp!=rp)
		{
			// case 1
			if(list.get(lp)+list.get(rp)==target)
			{
				return true;
			}
			// case 2
			if(list.get(lp)+list.get(rp)<target)
			{
			 lp=(lp+1)% n;
			}
			else
			{
				//case 3
				rp=(n+rp-1)% n;
			}
		}
		return false;
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      ArrayList<Integer> list=new ArrayList<Integer>();
		
		// sorted and rotated list
		list.add(11);
		list.add(15);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		
		
		int target=16;
		System.out.println(pairSum2(list, target));



	}

}
