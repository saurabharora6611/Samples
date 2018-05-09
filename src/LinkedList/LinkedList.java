package LinkedList;

public class LinkedList {
	Node head;

	public void append(int data) {
		Node current = head;

		if (head == null) {
			head = new Node(data);
			return;
		}

		while (current.next != null) {
			current = current.next;
			System.out.println("data is ..");
		}

		current.next = new Node(data);
	}

	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}

	public void deleteWithValue(int data) {
		if (head == null)
			return;

		if (head.data == data) {
			head = head.next;
			return;
		}

		Node current = head;

		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}

			current = current.next;
		}
	}
	
	public void insertInBetween(Node n, int data) {
		Node newNode = new Node(data);
		
		newNode.next = n.next;
		n.next = newNode;
	}
	
	public void printLinkList() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data +" ");
			current= current.next;
		}
		System.out.println("");
	}
	
	public int getElementAtNthNode(int index) {
		Node current = head; 
		int count = 0;
		while(current !=null) {
			if(count == index) {
				return current.data;
			}
			count++;
			current = current.next;
		}
		assert(true);
		return 0;
	}
	
	public Node reverseList(Node node) {
		Node current = head;
		Node next = null;
		Node prev = null;
		
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		node = prev;
		return node;
	}
	
	public Boolean hasLoop() {
		Node current = head;
		
		while(current!= null) {
			
			while(current.next != null) {
				if(current == current.next)
					return true;
			}
			
			current = current.next;
		 }
		
		return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("xyz");
		
		LinkedList list = new LinkedList();
	
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		
		System.out.println("printing before..");
		list.printLinkList();
		
		System.out.println("values at index 4 .. "+ list.getElementAtNthNode(8));
		
		list.reverseList(new Node(5));
		
		//check if list has loop 
		Boolean x= list.hasLoop();
		System.out.println(".."+x);
		//System.out.println("printing after adding in front");
		//list.prepend(5);
		//list.printLinkList();
		
//		System.out.println("printing after adding in back");
//		list.append(6);
//		list.printLinkList();
		
//		System.out.println("printing after adding in front");
//		list.prepend(4);
//		list.printLinkList();
		
//		System.out.println("printing after adding in between");
//		list.insertInBetween(list.head.next, 2);
//		list.printLinkList();
		
//		System.out.println("printing after deleting");
//		list.deleteWithValue(2);
//		list.printLinkList();
		
	}
}
