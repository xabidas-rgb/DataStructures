package stackDS;

public class StackOverFlowException extends Exception {

	/**
	 * Default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public StackOverFlowException(String message) {
		super();
	}
	
	public String getErrorMessage() {
		return message;
	}
	
	public void setErrorMessage(String message) {
		this.message = message;
	}

}
