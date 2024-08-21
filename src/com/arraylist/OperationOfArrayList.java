package com.arraylist;

import java.util.ArrayList;

public class OperationOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> List=new ArrayList<>();
		ArrayList<String> List2=new ArrayList<String>();
		ArrayList<Float> List3=new ArrayList<Float>();
		
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		List.add(6);
		System.out.println(List);
		
		// Get operation
		int a=List.get(3);
		System.out.println(a);
		
		// Delete Operation
		List.remove(3);
		System.out.println(List);
		
		// Set Operation
		List.set(3, 50);
		System.out.println(List);
		
		// contains Operation
		System.out.println(List.contains(6));
		System.out.println(List.contains(30));
		
		// Size operation
		System.out.println(List.size());
		
		// print Arraylist
		for(int i=0; i<List.size(); i++)
		{
			System.out.print(List.get(i)+" ");
		}
		

		
	}

}
