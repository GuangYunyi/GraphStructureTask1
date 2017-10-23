import java.util.*;

public class UndirectedGraph {
	
	private Map<Node, List<Node>> allMembers;
	private List<Node> none;	// create an empty List to store neighbours of node
	
	public UndirectedGraph() {
		
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
			
			
			addNode(n);								// add Node n into graph
			List<Node> n1 = allMembers.get(n);		
			n1.add(p);								// add p into n's neighbour list
			
		}
		
	}
	
	
	
	public void addNeighbourList(Node p, List<Node> nList) {
		
		if(allMembers.containsKey(p)) {
			
			List<Node> p1 = allMembers.get(p);
			p1.addAll(nList);
			
			
			Iterator<Node> iter = nList.iterator();			// add p into neighbour list of nList's members
			while(iter.hasNext()) {
				
				List<Node> n = allMembers.get(iter.next());
				n.add(p);
				
			}
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
			
			List<Node> p1 = allMembers.get(p);
			
			if(p1.contains(n)) {
				p1.remove(n);
				
				List<Node> n1 = allMembers.get(n);			// delete p from n's neighbour list also
				n1.remove(p);
				
			}
			else
				System.out.println("cannot find the deleted neighbour Node n");
		}
		
		else
			System.out.println("cannot find Node p in the graph");
	}
}
