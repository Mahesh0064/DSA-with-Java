package com.hashing;

import java.util.*;
public class HashMapOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create
		HashMap<String , Integer> has=new HashMap<String, Integer>();
		
		// put()- O(1)
		has.put("India", 300);
		has.put("China", 500);
		has.put("Nepal", 100);
		has.put("Bhutan", 50);
		has.put("England", 600);
		
		System.out.println(has);
		
		// get()  -O(1)
		int population=has.get("India");
		System.out.println(population);
		System.out.println(has.get("England"));
		System.out.println(has.get("Pak"));
		
		//containsKey()-O(1)
		System.out.println(has.containsKey("India"));  // true
		System.out.println(has.containsKey("Pakistan"));  // false
		
		// remove()- O(1)
		System.out.println(has.remove("India"));
		System.out.println(has);
		System.out.println(has.remove("Nepal",100));
		System.out.println(has);
		
		//size() -O(1)
		System.out.println(has.size());
		
		// isEmpty()- O(1)
		System.out.println(has.isEmpty());
	

	}

}
