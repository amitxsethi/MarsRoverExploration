package mars.rover.exception;

/**
 * The Exception to be thrown when a <code>Rover</code> receives an instruction
 * to move out of boundaries of the <code>Plateau</code>.
 * 
 * @author amit.x.sethi
 */
public class OutOfBoundsException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public OutOfBoundsException() {
		super();
	}

	public OutOfBoundsException(String message) {
		super(message);
	}
}
