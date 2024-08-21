package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
				ArrayList<Integer> list=new ArrayList<Integer>();
				list.add(1);
				list.add(20);
				list.add(3);
				list.add(4);
				list.add(50);
				list.add(16);
				list.add(7);
				list.add(48);
				System.out.println(list);
				System.out.println();
				
				// ascending order
				Collections.sort(list);
				System.out.println(list);
				System.out.println();
				
				// descending order
				Collections.sort(list, Collections.reverseOrder());
				System.out.println(list);
				

	}

}
