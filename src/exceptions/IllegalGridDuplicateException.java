package exceptions;

public class IllegalGridDuplicateException extends IllegalArgumentException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalGridDuplicateException() {
		
	}
	
	public IllegalGridDuplicateException(String message) {
		super(message);
	}
	
	public IllegalGridDuplicateException(Throwable cause) {
		super(cause);
	}
	
	public IllegalGridDuplicateException(String message, Throwable cause) {
		super(message, cause);
	}
}
