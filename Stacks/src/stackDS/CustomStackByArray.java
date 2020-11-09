package stackDS;

/**
 * @author abinash
 * Stack implementation by the help of an 1-D Array
 */
public class CustomStackByArray {
	
	private static int DEFAULT_SIZE = 5;
	private static Object[] array;
	private static int top = -1;
	
	/*
	 * Initialize empty/non-argumented constructor
	 */
	public CustomStackByArray() {
		super();
		array = new Object[DEFAULT_SIZE];
	}
	
	/*
	 * Initialize argumented constructor
	 */
	public CustomStackByArray(int size) {
		super();
		DEFAULT_SIZE = size;
		array = new Object[DEFAULT_SIZE];
	}
	
	/**
	 * Push the element into Stack
	 * @param data, Element that needs to be pushed to stack
	 * @return      true, if pushed successfully
	 *              false, otherwise
	 * @throws StackOverFlowException 
	 */
	public boolean push(Object data) throws StackOverFlowException {
		if(isFull()) {
			throw new StackOverFlowException("Stack is Overflow");
		} else {
			array[++top] = data;
			return true;
		}
	}
	
	/**
	 * Checks if the stack is full or not
	 * @return true, if the Stack is full
	 *         false, otherwise
	 */
	public static boolean isFull() {
		return top == DEFAULT_SIZE-1 ? true : false;
	}
	
	/**
	 * Checks if the stack is empty or not
	 * @return true, if the stack is empty
	 *         false, otherwise
	 */
	public static boolean isEmpty() {
		return top == -1 ? true : false;
	}
	
	
	/**
	 * Returns the top element from Stack
	 * @return top element from stack
	 */
	public Object peek() {
		return array[top];
	}
	
	/**
	 * Returns the top element from Stack and moves the cursor to the immediate
	 * down element in stack pointing top.
	 * @return top element from stack
	 */
	public Object pop() throws StackUnderFlowException{
		Object poppedItem = null;
		if (isEmpty()) {
			throw new StackUnderFlowException("Stack is UnderFlow");
		} else {
			poppedItem = array[top];
			top--;
		}
		return poppedItem;
	}
	
	/**
	 * Iterate the stack elements
	 */
	public void iterate() {
		for(int i=0;i<=top;i++) {
			System.out.println(array[i].toString());
		}
	}
	
	/**
	 * Finds the size of the stack
	 * @return length of the stack
	 */
	public static int size() {
		return (top+1);
	}
}
