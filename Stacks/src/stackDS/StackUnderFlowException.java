package stackDS;

public class StackUnderFlowException extends Exception{

	/**
	 * Generated serialVersionUID
	 */
	private static final long serialVersionUID = -5465418048599423359L;
	private String message;
	
	public StackUnderFlowException(String message) {
		super();
	}
	
	public String getErrorMessage() {
		return message;
	}
	
	public void setErrorMessage(String message) {
		this.message = message;
	}

}
