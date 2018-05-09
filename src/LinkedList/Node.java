package LinkedList;

/**
 * @author Saurabh
 *
 */
public class Node {

	 Node next;
	 int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void setNode(Node next) {
		this.next = next;
	}
	
	public Node getNode() {
		return this;
	}
		
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}
