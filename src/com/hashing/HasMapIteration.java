package com.hashing;

import java.util.*;

public class HasMapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> has=new HashMap<String, Integer>();
		has.put("India", 300);
		has.put("China", 500);
		has.put("Nepal", 100);
		has.put("Bhutan", 50);
		has.put("England", 600);
		
		// iterate
		
		// has.entrySet()// its key value pair set
		Set<String> keys=has.keySet();
		System.out.println(keys);
		
		for(String k:keys)
		{
			System.out.println("Key = "+k+", Value = "+has.get(k));
		}

	}

}
