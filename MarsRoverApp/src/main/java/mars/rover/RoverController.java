package mars.rover;

import mars.rover.command.MoveCommand;
import mars.rover.command.RoverCommand;
import mars.rover.command.TurnLeftCommand;
import mars.rover.command.TurnRightCommand;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * The Main Class to Launch and Control the <code>Rover</code>s.
 * @author amit.x.sethi
 */
public class RoverController {

	/**
	 * The command Map.
	 */
    private static final Map<Character, RoverCommand> roverCommands;
    static {
        roverCommands = new HashMap<Character, RoverCommand>();
        roverCommands.put('M', new MoveCommand());
        roverCommands.put('L', new TurnLeftCommand());
        roverCommands.put('R', new TurnRightCommand());
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new RoverController().execute(new BufferedReader(new InputStreamReader(System.in))));
    }

    public String execute(String input) throws IOException {
        return execute(asBufferedReader(input));
    }

    private String execute(BufferedReader reader) throws IOException {
        StringBuffer result = new StringBuffer();
        Plateau plateau = new Plateau(parseCoordinates(reader.readLine()));
        String roverInitialState;
        while (!isEmpty(roverInitialState = reader.readLine())) {
            Rover rover = createRover(roverInitialState, plateau);
            executeCommandsOnRover(rover, reader.readLine());
            result.append(rover).append("\n");
        }

        return result.toString();
    }

    private boolean isEmpty(String value) {
        return value == null || value.trim().equals("");
    }

    private void executeCommandsOnRover(Rover rover, String commands) {
        if (commands == null) return;
        for (Character command : commands.toCharArray()) {
            roverCommands.get(command).execute(rover);
        }
    }

    private Rover createRover(String roverInitialState, Plateau plateau) {
        String[] roverState = roverInitialState.split(" ");
        Coordinates coordinates = new Coordinates(Integer.parseInt(roverState[0]), Integer.parseInt(roverState[1]));
        Direction direction = Direction.parse(roverState[2].charAt(0));
        return new MarsRover(coordinates, direction, plateau);
    }

    private Coordinates parseCoordinates(String coordinateString) {
        String[] ordinates = coordinateString.split(" ");
        return new Coordinates(Integer.parseInt(ordinates[0]), Integer.parseInt(ordinates[1]));
    }

    private BufferedReader asBufferedReader(String input) {
        return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes())));
    }
}
