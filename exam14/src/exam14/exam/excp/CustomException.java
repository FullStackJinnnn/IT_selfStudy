package exam14.exam.excp;

public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;
	
	public CustomException() {
		
	}
	
	public CustomException(String message) {
		this.message= message;
	}
	
	public String getMessage() {
		return message;
	}
}
