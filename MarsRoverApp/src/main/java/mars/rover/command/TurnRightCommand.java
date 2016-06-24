package mars.rover.command;

import mars.rover.Rover;

/**
 * The <code>RoverCommand</code> to turn a <code>Rover</code> to Right.
 * @author amit.x.sethi
 */
public class TurnRightCommand implements RoverCommand {

    @Override
    public void execute(Rover rover) {
        rover.turnRight();
    }
}
