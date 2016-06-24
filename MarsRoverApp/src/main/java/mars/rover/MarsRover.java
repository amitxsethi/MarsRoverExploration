package mars.rover;

import mars.rover.exception.OutOfBoundsException;

/**
 * The <code>MarsRover</code> class.
 * @author amit.x.sethi
 */
public class MarsRover implements Rover {

    private Coordinates position;
    private Direction direction;
    private Plateau plateau;

    public MarsRover(Coordinates position, Direction direction, Plateau plateau) {
        this.position = position;
        this.direction = direction;
        this.plateau = plateau;
    }

    @Override
    public String toString() {
        return String.format("%d %d %c", position.getX(), position.getY(), direction.name().charAt(0));
    }

    @Override
    public Rover move() {
        position = direction.nextPosition(position);
        checkBounds();
        return this;
    }

    private void checkBounds() {
        if (!plateau.isValid(position))
            throw new OutOfBoundsException("Rover has moved out of bounds: " + position);
    }

    @Override
    public Rover turnLeft() {
        direction = direction.left();
        return this;
    }

    @Override
    public Rover turnRight() {
        direction = direction.right();
        return this;
    }

    @Override
    public Coordinates currentPosition() {
        return position;
    }

    @Override
    public Direction currentDirection() {
        return direction;
    }
}
