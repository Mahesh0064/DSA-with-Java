package com.stacks;

import java.util.*;

public class PushBottom {
	
	public static void pushAtBottom(Stack<Integer> s, int data)
	{
		if(s.isEmpty())
		{
		 s.push(data);
		 return;
		}
		int top=s.pop();
		pushAtBottom(s, data);
		s.push(top);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
 pushAtBottom(s, 9);
 while(!s.isEmpty())
	{
		System.out.println(s.peek()+" ");
     s.pop();
	}
	}

}
