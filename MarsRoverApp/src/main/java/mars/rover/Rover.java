package mars.rover;

/**
 * The Rover Interface.  
 * @author amit.x.sethi
 */
public interface Rover {
	/**
	 * Moves the <code>Rover</code>.
	 * @return the <code>Rover</code> after the movement.
	 */
    Rover move();
    
    /**
     * Turns the <code>Rover</code> to the left.
     * @return the <code>Rover</code> after turning left.
     */
    Rover turnLeft();
    
    /**
     * Turns the <code>Rover</code> to the right.
     * @return the <code>Rover</code> after turning right.
     */
    Rover turnRight();
    
    /**
     * The current <code>Coordinates</code> of the <code>Rover</code>.
     * @return current <code>Coordinates</code> of the <code>Rover</code>.
     */
    Coordinates currentPosition();
    
    /**
     * The current <code>Direction</code> of the <code>Rover</code>.
     * @return current <code>Direction</code> of the <code>Rover</code>.
     */
    Direction currentDirection();
}
