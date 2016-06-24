package mars.rover;

/**
 * This class represents the x axis and y axis coordinates in a 2D plain. 
 * @author amit.x.sethi
 */
public class Coordinates {

	private int x;
	private int y;

	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}

	@Override
	public boolean equals(Object o) {
		boolean equals = false;
		if (this == o) {
			equals = true;
		} else if (o != null && (o instanceof Coordinates)) {
			Coordinates that = (Coordinates) o;
			if (x == that.getX() && y == that.getY()) {
				equals = true;
			}
		}
		return equals;
	}

	@Override
	public int hashCode() {
		int result = x;
		result = 31 * result + y;
		return result;
	}
}
