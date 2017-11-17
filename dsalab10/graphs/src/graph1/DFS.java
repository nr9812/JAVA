package graph1;

import java.util.*;
import java.io.*;


public class DFS 
{
	private int V;
	private LinkedList <Integer>  adj[];
	
	DFS(int v)
	{
		V=v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]= new LinkedList();
		}
	}
	
	void addEdge(int v , int w)
	{
		adj[v].add(w);
	}
	
	void dfst(int v,boolean visited[])
	{
		visited[v]=true;
		System.out.print (v+" ");
		Iterator< Integer> i = 	adj[v].listIterator();
		while (i.hasNext())
		{
			int n= i.next();
			if (!visited[n])
			{
				dfst (n,visited);
			}
		}
	}
	
	void dfs(int v)
	{
		boolean visited[]=new boolean[V];
		dfst(v, visited);
	}
	
	public static void main (String [] args)
	{
		DFS ob1 = new DFS(4);
		ob1.addEdge(0, 1);
		ob1.addEdge(0, 2);
		ob1.addEdge(1, 2);
		ob1.addEdge(2, 0);
		ob1.addEdge(2, 3);
		ob1.addEdge(3, 3);
		
		System.out.println ("Following is the DFS starting from vertex 1");
		ob1.dfs(1);
		
	}
}
