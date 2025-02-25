package com.heaps;

import java.util.*;

public class PQObject {
	
	static class Student implements Comparable<Student> // overriding
	{
		String name;
		int rank;
		
		public Student(String name, int rank)
		{
			this.name=name;
			this.rank=rank;
		}
		
		@Override
		public int compareTo(Student s2)
		{
			return this.rank-s2.rank;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Student> pq=new PriorityQueue<>();
		pq.add(new Student("A",4));
		pq.add(new Student("B",6));
		pq.add(new Student("E",20));
		pq.add(new Student("D",1));
		pq.add(new Student("C",16));
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.peek().name+"->"+pq.peek().rank); // O(1)
			pq.remove();
		}

	}

}
