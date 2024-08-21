package com.stacks;

import java.util.*;

public class StackUsingCFW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Stack<Integer> s=new Stack<Integer>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek()+" ");
            s.pop();
		}

	}

}
