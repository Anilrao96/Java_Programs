package Programs;


class Node{
	
	int i;
	Node next;
	
}
class Linked{
	private Node getNewNode(int i) {
		Node a = new Node();
		a.i=i;
		a.next=null;
		return a; 
	}
	public Node insert(int i,Node node) {
		if(node == null) {
			return getNewNode(i);
		}
		return null;
		
	}
}


public class Linkdlist {

	public static void main(String[] args) {
		
		Node root = null;
		Linked a = new Linked();
		root = a.insert(12,root);
	}

}
