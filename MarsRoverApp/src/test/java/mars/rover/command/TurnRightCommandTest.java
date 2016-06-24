package mars.rover.command;

import mars.rover.RoverStub;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TurnRightCommandTest {

    private RoverCommand command;

    @Before
    public void setUp() {
        command = new TurnRightCommand();
    }

    @Test
    public void callsTurnRightMethodOnRover() {
        RoverStub roverStub = new RoverStub();
        command.execute(roverStub);
        Assert.assertEquals(1, roverStub.callsToTurnRight());
    }
}
