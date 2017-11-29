package demo.graph_theory;

public class Edge {

	int node1;
	int node2;
	int weight;
	
	public Edge(int node1, int node2) {
		this.node1 = node1;
		this.node2 = node2;
	}
	
	public Edge(int node1, int node2, int weight) {
		this.node1 = node1;
		this.node2 = node2;
		this.weight = weight;
	}
	
	public int getNode1() {
		return node1;
	}

	public int getNode2() {
		return node2;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	
}
