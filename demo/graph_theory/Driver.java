package demo.graph_theory;

import java.util.ArrayList;
import java.util.List;

public class Driver {


/*	
	1 3
	3 4
	2 4
	1 2
	2 3
	5 6	
*/	
	
	public static void main(String[] args) {

		List<Edge> adjList = new ArrayList<>();
		
		adjList.add(new Edge(1, 3));
		adjList.add(new Edge(3, 4));
		adjList.add(new Edge(2, 4));
		adjList.add(new Edge(1, 2));
		adjList.add(new Edge(2, 3));
		adjList.add(new Edge(5, 6));
	}
}
