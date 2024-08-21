package com.graph;
import java.util.*;

public class BFSImp {

	static class Edge{
		  int src;
		  int dest;
		  int wt;
		  public Edge(int s, int d,int w)
		  {
			  this.src=s;
			  this.dest=d;
			  this.wt=s;
		  }
		  
	  }
	public static void createGraph(ArrayList<Edge> graph[])
	{
		for(int i=0; i<graph.length;i++)
		{
			graph[i]=new ArrayList<>();
		}
		// 0-vertex new Edge(s,d,w)
	    graph[0].add(new Edge(0,1,1));
		graph[0].add(new Edge(0,2,1));
		
		
		// 1 -vertex new Edge(s,d,w)
	    graph[1].add(new Edge(1,0,1));
		graph[1].add(new Edge(1,3,1));
		
		// 2-vertex new Edge(s,d,w)
	    graph[2].add(new Edge(2,0,1));
	    graph[2].add(new Edge(2,4,1));
	    
		// 3-vertex new Edge(s,d,w)
	    graph[3].add(new Edge(3,1,1));
	    graph[3].add(new Edge(3,4,1));
	    graph[3].add(new Edge(3,5,1));

		// 4-vertex new Edge(s,d,w)
	    graph[4].add(new Edge(4,2,1));
	    graph[4].add(new Edge(4,3,1));
	    graph[4].add(new Edge(4,5,1));
	    
	 // 5-vertex new Edge(s,d,w)
	    graph[5].add(new Edge(5,3,1));
	    graph[5].add(new Edge(5,4,1));
	    graph[5].add(new Edge(5,6,1));
	    
	 // 6-vertex new Edge(s,d,w)
	    graph[6].add(new Edge(6,5,1));
	    	
	} 
	
	public static void bfs(ArrayList<Edge> [] graph) // O(V+E)
	{
		Queue<Integer> q=new LinkedList<>();
		boolean vis[]=new boolean[graph.length];
		
	    q.add(0); // source =0
	    while(!q.isEmpty())
	    {
	    	int curr=q.remove();
	    	
	    	if(!vis[curr]) // visit curr
	    	{
	    		System.out.print(curr+" ");
	    		vis[curr]=true;
	    		for(int i=0; i<graph[curr].size(); i++)
	    		{
	    			Edge e=graph[curr].get(i);
	    			q.add(e.dest);
	    		}
	    	}
	    }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*     1-------3
		      /        | \
		     0         |  5 ---6
		     \         | /
		      2--------4  
		 */
	int V=7;
	
	ArrayList<Edge>[] graph=new ArrayList[V]; 
	
	  createGraph(graph);
	  bfs(graph);
		}

}
