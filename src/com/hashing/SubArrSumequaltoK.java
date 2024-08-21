package com.hashing;

import java.util.HashMap;

public class SubArrSumequaltoK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {10,2,-2,-20,10};
      int k=-10;
		
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		// <sum,count>
		
		int sum=0;
		int ans=0;
		map.put(0,1); 
		for(int j=0; j<arr.length; j++)
		{
			sum+=arr[j];  // sum[j]
			if(map.containsKey(sum-k))
			{
			  ans+=map.get(sum-k);
			}
			else
			{
				map.put(sum, map.getOrDefault(sum, 0 )+1);
			}
		}
	
System.out.println(ans);
	}

}
