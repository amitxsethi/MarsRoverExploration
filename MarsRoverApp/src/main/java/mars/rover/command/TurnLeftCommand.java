package mars.rover.command;

import mars.rover.Rover;

/**
 * The <code>RoverCommand</code> to turn a <code>Rover</code> to Left.
 * @author amit.x.sethi
 */
public class TurnLeftCommand implements RoverCommand {

	@Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
