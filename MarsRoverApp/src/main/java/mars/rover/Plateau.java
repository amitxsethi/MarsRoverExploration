package mars.rover;

/**
 * The Class to represent a Plateau.
 * 
 * @author amit.x.sethi
 */
public class Plateau {

	private Coordinates upperRightCorner;
	private Coordinates lowerLeftCorner;

	/**
	 * Constructor to create a <code>Plateau</code>. Lower right coordinates are
	 * always (0,0)
	 * 
	 * @param upperRightCorner
	 *            - the Upper right coordinates of rectangular
	 *            <code>Plateau</code>.
	 */
	public Plateau(Coordinates upperRightCorner) {
		this.upperRightCorner = upperRightCorner;
		this.lowerLeftCorner = new Coordinates(0, 0);
	}

	/**
	 * Checks the given coordinates are valid on the <code>Plateau</code> and
	 * not out of boundaries.
	 * 
	 * @param coordinates
	 *            - the input <code>Coordinates</code>.
	 * @return <code>True</code> if the given coordinates are within the
	 *         <code>Plateau</code> else <code>False</code>.
	 */
	public boolean isValid(Coordinates coordinates) {
		return coordinates != null && coordinates.getX() >= lowerLeftCorner.getX()
				&& coordinates.getX() <= upperRightCorner.getX() && coordinates.getY() >= lowerLeftCorner.getY()
				&& coordinates.getY() <= upperRightCorner.getY();
	}
}
