package mars.rover;

/**
 * The enum representing 4 directions and also orientations. 
 * @author amit.x.sethi
 */
public enum Direction {

    North, East, South, West;

    private Direction onLeft;
    private Direction onRight;

    private int changeInX = 0;
    private int changeInY = 0;

    static {
        North.setLeft(West); East.setLeft(North); South.setLeft(East); West.setLeft(South);
        North.changeInY = 1; East.changeInX = 1; South.changeInY = -1; West.changeInX = -1;
    }

    /**
     * Return <code>Direction</code> to the left.
     * @return <code>Direction</code> to the left.
     */
    public Direction left() {
        return onLeft;
    }

    /**
     * Return <code>Direction</code> to the right.
     * @return <code>Direction</code> to the right.
     */
    public Direction right() {
        return onRight;
    }

    /**
     * Returns the <code>Coordinates</code> of the next position.
     * @param currentPosition the <code>Coordinates</code> of the current position.
     * @return the <code>Coordinates</code> of the next position
     */
    public Coordinates nextPosition(Coordinates currentPosition) {
        return new Coordinates(currentPosition.getX() + changeInX, currentPosition.getY() + changeInY);
    }

    /**
     * Returns the <code>Direction</code> enum based on the initial.
     * @param direction - the initial of Direction
     * @return the <code>Direction</code> based on the initial.
     */
    public static Direction parse(Character direction) {
        switch (direction) {
            case 'N': return North;
            case 'E': return East;
            case 'S': return South;
            case 'W': return West;
        }
        return null;
    }

    private void setLeft(Direction direction) {
        this.onLeft = direction;
        direction.onRight = this;
    }
}
