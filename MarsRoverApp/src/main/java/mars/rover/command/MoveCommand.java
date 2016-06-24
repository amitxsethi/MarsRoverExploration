package mars.rover.command;

import mars.rover.Rover;

/**
 * The <code>RoverCommand</code> to move a <code>Rover</code>.
 * @author amit.x.sethi
 */
public class MoveCommand implements RoverCommand {

	@Override
    public void execute(Rover rover) {
        rover.move();
    }
}
