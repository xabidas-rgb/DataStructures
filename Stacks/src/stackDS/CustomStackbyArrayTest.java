package stackDS;

public class CustomStackbyArrayTest {
	
	public static void main(String[] args) throws StackOverFlowException, 
	                                              StackUnderFlowException {
		CustomStackByArray stackByArray = new CustomStackByArray(8);
		stackByArray.push(10);
		stackByArray.push(20);
		stackByArray.push(30);
		stackByArray.push(40);
		stackByArray.push(50);
		stackByArray.push(60);
		
		stackByArray.iterate();
		
		System.out.println("Peek element of the stack : " + stackByArray.peek());
		System.out.println("Popped out element from the stack : " + stackByArray.pop());
		System.out.println("Length of stack after popping out element : " + CustomStackByArray.size());
		stackByArray.iterate();
	}
}
