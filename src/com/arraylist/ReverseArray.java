package com.arraylist;

import java.util.ArrayList;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		System.out.println(list);
		
		System.out.println();
		
		// Reverse
		for(int i=list.size()-1; i>=0; i--)
		{
			System.out.print(list.get(i)+" ");
		}

	}

}
