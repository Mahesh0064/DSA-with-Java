package com.hashing;

import java.util.*;

public class LinkedHashSetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// it mentain order also
		LinkedHashSet<String> cities=new LinkedHashSet<>();
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
		
		HashSet<String> city=new HashSet<>();
		city.add("Lucknow");
		city.add("Mumbai");
		city.add("Delhi");
		city.add("Pune");
		city.add("Noida");
		city.add("Agra");
		
		System.out.println(city);
		System.out.println(cities);
	}



	

}
