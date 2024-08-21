package com.hashing;

import java.util.HashSet;

public class DistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> s=new HashSet<>();
//		s.add(4);
//		s.add(3);
//		s.add(2);
//		s.add(5);
//		s.add(6);
//		s.add(6);
//		s.add(9);
//		s.add(1);
//		s.add(3);
		int num[]= {4,3,2,6,5,8,90,76,4,11,23,44,5};
		
		for(int i=0; i<num.length; i++)
		{
			s.add(num[i]);
		}

		System.out.println("Distinct Element is = "+s.size());
	}

}
