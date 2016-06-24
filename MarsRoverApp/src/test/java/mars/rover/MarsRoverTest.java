package mars.rover;

import mars.rover.exception.OutOfBoundsException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    private Plateau plateau;

    @Before
    public void createPlateau() {
        plateau = new Plateau(new Coordinates(25, 25));
    }

    @Test
    public void movesInTheCurrentDirection() {
        Rover rover = new MarsRover(new Coordinates(0, 0), Direction.North, plateau);
        assertEquals(new Coordinates(0, 1),  rover.move().currentPosition());

        rover = new MarsRover(new Coordinates(2, 4), Direction.East, plateau);
        assertEquals(new Coordinates(3, 4),  rover.move().currentPosition());

        rover = new MarsRover(new Coordinates(12, 7), Direction.South, plateau);
        assertEquals(new Coordinates(12, 6),  rover.move().currentPosition());

        rover = new MarsRover(new Coordinates(15, 25), Direction.West, plateau);
        assertEquals(new Coordinates(14, 25),  rover.move().currentPosition());
    }

    @Test
    public void turnsLeft() {
        Rover rover = new MarsRover(new Coordinates(5, 9), Direction.South, plateau);
        assertEquals(Direction.East, rover.turnLeft().currentDirection());
        assertEquals(Direction.North, rover.turnLeft().currentDirection());
        assertEquals(Direction.West, rover.turnLeft().currentDirection());
        assertEquals(Direction.South, rover.turnLeft().currentDirection());
    }

    @Test
    public void turnsRight() {
        Rover rover = new MarsRover(new Coordinates(25, 11), Direction.West, plateau);
        assertEquals(Direction.North, rover.turnRight().currentDirection());
        assertEquals(Direction.East, rover.turnRight().currentDirection());
        assertEquals(Direction.South, rover.turnRight().currentDirection());
        assertEquals(Direction.West, rover.turnRight().currentDirection());
    }

    @Test(expected = OutOfBoundsException.class)
    public void throwsOutOfBoundsExceptionWhenMovedOutOfThePlateau() {
        Rover rover = new MarsRover(new Coordinates(25, 25), Direction.North, plateau);
        rover.move();
    }

    @Test
    public void executesASeriesOfCommands() {
        Rover rover = new MarsRover(new Coordinates(1, 2), Direction.North, plateau);
        rover.turnLeft().move().turnLeft().move().turnLeft().move().turnLeft().move().move();
        assertEquals(new Coordinates(1, 3), rover.currentPosition());
        assertEquals(Direction.North, rover.currentDirection());

        rover = new MarsRover(new Coordinates(3, 3), Direction.East, plateau);
        rover.move().move().turnRight().move().move().turnRight().move().turnRight().turnRight().move();
        assertEquals(new Coordinates(5, 1), rover.currentPosition());
        assertEquals(Direction.East, rover.currentDirection());
    }
}
