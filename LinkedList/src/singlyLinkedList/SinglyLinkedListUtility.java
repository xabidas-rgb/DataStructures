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
		
		
		return false;
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
	
}
