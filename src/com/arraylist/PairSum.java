package com.arraylist;

import java.util.ArrayList;

public class PairSum {
	
	public static boolean pairSum(ArrayList<Integer> list, int target)
	{
		for(int i=0; i<list.size(); i++)
		{
			for(int j=0; j<list.size(); j++)
			{
				if(list.get(i)+list.get(j)==target)
				{
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(20);
		list.add(3);
		list.add(4);
		list.add(50);
		list.add(16);
		list.add(7);
		list.add(48);
		
		int target=70;
		System.out.println(pairSum(list, target));

	}

}
