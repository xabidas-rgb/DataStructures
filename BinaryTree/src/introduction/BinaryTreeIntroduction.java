package introduction;

/**
 * @author abinash
 * This is an introductory class for a Binary Tree representation
 */
class Node {
	Object data;
	Node left, right;
	
	/*
	 * Every node of a Binary tree holds followings
	 *     Object data
	 *     Address of both left and right node
	 */
	public Node(Object data) {
		this.data = data;
		right = null;
		left  = null;
	}
}

public class BinaryTreeIntroduction {
	
	Node root;
	
	/**
	 * Argumented constructor
	 * @param data, the Object data
	 */
	public BinaryTreeIntroduction(Object data) {
		root = new Node(data);
	}
	
	/**
	 * Non-argumented constructor
	 */
	public BinaryTreeIntroduction() {
		root = null;
	}
	
	public static void main(String[] args) {
		BinaryTreeIntroduction introduction = new BinaryTreeIntroduction();
		
		/*
		 * Create root node
		 */
		introduction.root = new Node(10);
		
		/*
		 * Create left and right node of root node
		 *      10
		 *     /  \
		 *    20  30 
		 */
		introduction.root.left  = new Node(20);
		introduction.root.right = new Node(30); 
		
		/*
		 * Create both left and right nodes of left node
		 *      10
		 *     /  \
		 *    20  30
		 *   /  \
		 * 40    50 
		 */
		introduction.root.left.left  = new Node(40);
		introduction.root.left.right = new Node(50);
	}
	
}
