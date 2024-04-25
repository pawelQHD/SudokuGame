package exceptions;

public class IllegalRowDuplicateException extends IllegalArgumentException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalRowDuplicateException() {
		
	}
	
	public IllegalRowDuplicateException(String message) {
		super(message);
	}
	
	public IllegalRowDuplicateException(Throwable cause) {
		super(cause);
	}
	
	public IllegalRowDuplicateException(String message, Throwable cause) {
		super(message, cause);
	}
}
