package com.hashing;

import java.util.*;

public class LinkedHashMapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>()	;
	        
     lhm.put("India", 300);
     lhm.put("China", 500);
	 lhm.put("Nepal", 100);
	lhm.put("Bhutan", 50);
	lhm.put("England", 600);
	
	System.out.println(lhm);
	HashMap<String,Integer> hm=new HashMap<>()	;
    
    hm.put("India", 300);
    hm.put("China", 500);
	 hm.put("Nepal", 100);
	hm.put("Bhutan", 50);
	hm.put("England", 600);
	
	System.out.println(hm);
	}

}
