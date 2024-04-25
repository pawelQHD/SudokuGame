package exceptions;

public class IllegalBoardSizeException extends IllegalArgumentException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalBoardSizeException() {
		
	}
	
	public IllegalBoardSizeException(String message) {
		super(message);
	}
	
	public IllegalBoardSizeException(Throwable cause) {
		super(cause);
	}
	
	public IllegalBoardSizeException(String message, Throwable cause) {
		super(message, cause);
	}
}
