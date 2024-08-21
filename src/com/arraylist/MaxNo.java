package com.arraylist;

import java.util.ArrayList;

public class MaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(23);
		list.add(4);
		list.add(50);
		list.add(61);
		list.add(7);
		list.add(8);
		System.out.println(list);
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<list.size(); i++)
		{
			if(max<list.get(i))
			{
				max=list.get(i);
			}
		}
		System.out.println("Max element : "+ max);
	}

}
