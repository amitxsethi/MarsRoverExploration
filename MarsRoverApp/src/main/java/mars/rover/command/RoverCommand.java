package mars.rover.command;

import mars.rover.Rover;

/**
 * The Interface defining any <code>Rover</code> Command.
 * @author amit.x.sethi
 */
public interface RoverCommand {
    void execute(Rover rover);
}
