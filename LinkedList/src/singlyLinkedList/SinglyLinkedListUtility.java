package singlyLinkedList;

/**
 * @author abinash
 * Singly LinkedList implementation
 */
public class SinglyLinkedListUtility {
	
	// Declare Node head.
	// LinkedList always starts from head
	Node head;
	
	// Define Node
	public class Node {
		Object data;
		Node next;
		
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	/**
	 * Adds an element to the front of a LinkedList
	 * @param element, Item that needs to be added
	 * @return true, if the addition is successful
	 *         false, otherwise
	 */
	public boolean addAtFront(Object element) {
		if(element == null)
			return false;
		
		/*
		 * Create a new Node
		 */
		Node newNode = new Node(element);
		/*
		 * Point next of New node to current Head, so that
		 * newNode.next(which is null) will be re-assigned to an address
		 * and can establish a link between subsequent node
		 */
		newNode.next = head;
		/*
		 * Now, point Head to the New Node as this will be starting of LinkedList
		 */
		head = newNode;
		
		return true;
	}
	
	
	/**
	 * Adds an element to the end of a LinkedList
	 * @param  element, Item that needs to be added
	 * @return true, if the addition is successful
	 *         false otherwise
	 */
	public boolean addAtEnd(Object element) {
		return false;
	}
	
	
	/**
	 * Adds an element at a specific position of LinkedList
	 * @param  element,  Item that needs to be added
	 * @param  position, Position where the element needs to be added
	 * @return true,     if the addition is successful
	 *         false     otherwise
	 */
	public boolean addAtSpecificIndex(Object element, int position) {
		return false;
	}
	
	
	/**
	 * Removes an element from the starting of a LinkedList
	 * @return true, if the removal is successful
	 *         false, otherwise
	 */
	public boolean removeFromFront() {
		return false;
	}
	
	
	/**
	 * Removes an element from the end of a LinkedList
	 * @return true, if the removal is successful
	 *         false, otherwise
	 */
	public boolean removeFromEnd() {
		return false;
	}
	
	
	/**
	 * Removes an element from a specific index of a LinkedList
	 * @param  position, Position from where the element needs to be removed.
	 * @return true,     if the removal is successful
	 *         false,    otherwise
	 */
	public boolean removeElementFromSpecificPos(int position) {
		return false;
	}
	
	
	/**
	 * Removes all the element in a LinkedList.
	 */
	public void clear() {
		
	}
	
	/**
	 * Find element at a particular index in a LinkedList
	 * @param position, the position where the element needs to be 
	 *        found out
	 * @return element, if the element is found
	 *         null     otherwise
	 */
	public Object elementAtIndex(int position) {
		if (position >= size())
			return null;
		
		
		return null;
	}
	
	
	/**
	 * Find the length of a LinkedList
	 * @return
	 */
	public int size() {
		
		Node node = head;
		int count = 0;
		
		/*
		 * Iterate until we don't reach at the last node
		 */
		while(node != null) {
			count ++;
			node = node.next; // Mark the pointer to the next node
		}
		return count;
	}
	
	
	public void iterate() {
		Node node = head;
		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
}
