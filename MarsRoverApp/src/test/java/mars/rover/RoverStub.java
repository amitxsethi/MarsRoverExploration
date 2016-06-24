package mars.rover;

public class RoverStub implements Rover {

    private int callsToMove = 0;
    private int callsToTurnLeft = 0;
    private int callsToTurnRight = 0;

    @Override
    public Rover move() {
        callsToMove++;
        return this;
    }

    @Override
    public Rover turnLeft() {
        callsToTurnLeft++;
        return this;
    }

    @Override
    public Rover turnRight() {
        callsToTurnRight++;
        return this;
    }

    public int callsToMove() {
        return callsToMove;
    }

    public int callsToTurnLeft() {
        return callsToTurnLeft;
    }

    public int callsToTurnRight() {
        return callsToTurnRight;
    }

    @Override
    public Coordinates currentPosition() {
        return null;
    }

    @Override
    public Direction currentDirection() {
        return null;
    }
}
