package com.hashing;
import java.util.*;

public class ItineraryOfTicket {
	
	public static String getStart(HashMap<String, String> tickets)
	{
		HashMap<String, String> revMap=new HashMap<String, String>();
		
		for(String key:tickets.keySet())
		{
			revMap.put(tickets.get(key), key);
		}
		
		for(String key:tickets.keySet())
		{
			if(!revMap.containsKey(key))
			{
				return key;  // starting point
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> tickets=new HashMap<String, String>();
		
		tickets.put("Chennai", "Benguluru");
		tickets.put("Mumbai", "Delhi");
		tickets.put("Goa", "Chennai");
		tickets.put("Delhi", "Goa");
		tickets.put("Lucknow", "Mumbai");
		
		String start=getStart(tickets);
		System.out.print(start);
		
		for(String key:tickets.keySet())
		{
			System.out.print("-->"+tickets.get(start));
			start=tickets.get(start);
		}

	}

}
