package com.hashing;

import java.util.HashSet;

public class HashSetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> s=new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(8);
		s.add(5);
		s.add(6);
		
		System.out.println(s);
		
		
		if(s.contains(2))
		{
			System.out.println("set contains 2");
		}
		if(s.contains(10))
		{
			System.out.println("Set contains 10");
		}
				

	}

}
