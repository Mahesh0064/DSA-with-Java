package com.hashing;

import java.util.*;

public class TreeMapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> tm=new TreeMap<>()	;
        
	     tm.put("India", 300);
	     tm.put("China", 500);
		 tm.put("Nepal", 100);
		tm.put("Bhutan", 50);
		tm.put("England", 600);
		
		System.out.println(tm);
		HashMap<String,Integer> hm=new HashMap<>()	;
	    
	    hm.put("India", 300);
	    hm.put("China", 500);
		 hm.put("Nepal", 100);
		hm.put("Bhutan", 50);
		hm.put("England", 600);
		
		System.out.println(hm);


	}

}
