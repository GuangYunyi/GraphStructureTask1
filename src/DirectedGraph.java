import java.util.*;

public class DirectedGraph {

	private Map<Node, List<Node>> allMembers;
	private List<Node> none;	// create an empty List to store neighbours of node
	
	public DirectedGraph() {
		
	}
	
	
	
	public void addNode(Node n) {
		
		if(!allMembers.containsKey(n)) {
			
			allMembers.put(n,none);
			
		}
		
	}
	
	
	
	public void addNeighbour(Node p, Node n) {
		
		if(allMembers.containsKey(p)) {
			
			List<Node> p1 = allMembers.get(p);
			p1.add(n);
			
		}
		
	}
	
	
	
	public void addNeighbourList(Node p, List<Node> nList) {
		
		if(allMembers.containsKey(p)) {
			
			List<Node> p1 = allMembers.get(p);
			p1.addAll(nList);
			
		}
	}
	
	
	
	public List<Node> getNeiboursOfNode(Node n) {
		
		if(allMembers.containsKey(n)) {
			
			List<Node> n1 = allMembers.get(n);
			return n1;
			
		}
		
		else {
			
			System.out.println("cannot find the neighbours of Node n");
			return none;
			
		}
		
	}
	
	
	
	public void deleteNeighbour(Node p, Node n) {
		
		if(allMembers.containsKey(p)) {
			
			List<Node> n1 = allMembers.get(p);
			
			if(n1.contains(n)) {
				n1.remove(n);
			}
			else
				System.out.println("cannot find the deleted neighbour Node n");
		}
		
		else
			System.out.println("cannot find Node p in the graph");
	}
	
	

}
