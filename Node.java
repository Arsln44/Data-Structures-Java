package NewPkg;

public class Node {
	Node next;
	Node prev;
	int data;
	
	public Node(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
}
