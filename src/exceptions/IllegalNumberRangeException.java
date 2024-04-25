package exceptions;

public class IllegalNumberRangeException extends IllegalArgumentException {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public IllegalNumberRangeException() {
		
	}
	
	public IllegalNumberRangeException(String message) {
		super(message);
	}
	
	public IllegalNumberRangeException(Throwable cause) {
		super(cause);
	}
	
	public IllegalNumberRangeException(String message, Throwable cause) {
		super(message, cause);
	}
}
