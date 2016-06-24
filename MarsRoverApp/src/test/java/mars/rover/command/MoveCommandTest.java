package mars.rover.command;

import mars.rover.RoverStub;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoveCommandTest {

    private RoverCommand command;

    @Before
    public void setUp() {
        command = new MoveCommand();
    }

    @Test
    public void callsMoveMethodOnRover() {
        RoverStub roverStub = new RoverStub();
        command.execute(roverStub);
        Assert.assertEquals(1, roverStub.callsToMove());
    }
}
