package com.arraylist;

import java.util.ArrayList;

public class ArrayListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		mainlist.add(list1);
		
		ArrayList< Integer> list2=new ArrayList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		
		mainlist.add(list2);
		
		for(int i=0; i<mainlist.size(); i++)
		{
			ArrayList<Integer> currlist=mainlist.get(i);
			for(int j=0; j<currlist.size(); j++)
			{
				System.out.print(currlist.get(j)+" ");
			}
			System.out.println();
		}
		System.out.println(mainlist);
		
		ArrayList<ArrayList<Integer>> mainlist1=new ArrayList<>();
		ArrayList<Integer> lista=new ArrayList<Integer>();
		ArrayList<Integer> listb=new ArrayList<Integer>();
		ArrayList<Integer> listc=new ArrayList<Integer>();
		
		for(int i=1; i<=5; i++)
		{
			lista.add(i*1); // 1 2 3 4 5
			listb.add(i*2); // 2 4 6 8 10
			listc.add(i*3); // 3 6 9 12 15
		}
		mainlist1.add(lista);
		mainlist1.add(listb);
		mainlist1.add(listc);
		
		System.out.println(mainlist1);

		// traversal of list
		for(int i=0; i<mainlist1.size(); i++)
		{
			ArrayList<Integer> currlist1=mainlist1.get(i);
			for(int j=0; j<currlist1.size(); j++)
			{
				System.out.print(currlist1.get(j)+" ");
			}
			System.out.println();
		}
	}

}
