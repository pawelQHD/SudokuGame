package exceptions;

public class IllegalColumnDuplicateException extends IllegalArgumentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalColumnDuplicateException() {
		
	}
	
	public IllegalColumnDuplicateException(String message) {
		super(message);
	}
	
	public IllegalColumnDuplicateException(Throwable cause) {
		super(cause);
	}
	
	public IllegalColumnDuplicateException(String message, Throwable cause) {
		super(message, cause);
	}
}
