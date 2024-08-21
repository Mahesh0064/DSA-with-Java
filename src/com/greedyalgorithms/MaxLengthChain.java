package com.greedyalgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pairs[][]= {{5,24},{39,60},{5,28},{27,40},{50,90}};
		
		Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
		
		int chainLen=1;
		int chainEnd=pairs[0][1];// last selected pair end // chain end
		
		for(int i=1; i<pairs.length; i++)
		{
			if(pairs[i][0]>chainEnd)
			{
				chainLen++;
				chainEnd=pairs[i][1];
			}
		}
		System.out.println("Max length of chain = "+ chainLen);
	}

}
