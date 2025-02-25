package com.arraylist;

import java.util.ArrayList;

public class PairSum1 {

	
	// 2 pointer approach
	public static boolean pairSum1(ArrayList<Integer> list, int target)
	{
		int lp=0,rp=list.size()-1;
		
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
			 lp++;
			}
			else
			{
				//case 3
				rp--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		// sorted arraylist
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		int target=7;
		System.out.println(pairSum1(list, target));

	}

}
