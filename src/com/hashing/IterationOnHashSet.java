package com.hashing;

import java.util.*;

public class IterationOnHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> cities=new HashSet<>();
		cities.add("Lucknow");
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Pune");
		cities.add("Noida");
		cities.add("Agra");
		
		Iterator itr=cities.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
		System.out.println("2nd method");
		for(String city:cities)
		{
			System.out.println(city);
		}
	}

}
