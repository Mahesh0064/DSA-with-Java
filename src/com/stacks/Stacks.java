package com.stacks;

import java.util.ArrayList;

public class Stacks {
	
	static class Stack
	{
		static ArrayList<Integer> list=new ArrayList<Integer>();
		        	
		public static boolean isEmpty()
		{
			return list.size()==0;
		}
		
		// push
		public static void push(int data)
		{
			list.add(data);
		}
		
		// pop
		public static int pop()
		{
			if(isEmpty())
			{
				return -1;
			}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
		// peek
		public static int peek()
		{
			if(isEmpty())// when stack is empty return -1
			{
				return -1;
			}
			return list.get(list.size()-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s=new Stack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek()+" ");
            s.pop();
		}
		
		

	}

}
