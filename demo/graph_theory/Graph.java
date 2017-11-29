package demo.graph_theory;

import java.util.List;

public class Graph {

	int nodes = 0;
	List<Edge> adj;
	boolean[] visited;

	public Graph(List<Edge> adj) {
		this.adj = adj;
		nodes = adj.size();
		visited = new boolean[nodes];
		
		for(int i = 0; i < nodes; i++) 
			visited[i] = false;
		
	}
	
	// Depth-First Search
	public void dfs(int start) {

		if(visited[start]) return;
		visited[start] = true;
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
		for(Edge e: adj) {
			if(e.getNode1() == start)
				dfs(e.getNode2());
		}
	}
}	