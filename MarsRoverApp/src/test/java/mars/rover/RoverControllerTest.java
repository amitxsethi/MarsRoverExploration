package mars.rover;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class RoverControllerTest {

    private RoverController controller = new RoverController();

    @Test
    public void executesInstructions() throws IOException {
        String result = controller.execute("5 5\n1 2 E\nLMLMLMLM\n\n");
        Assert.assertEquals("1 2 E\n", result);

        result = controller.execute("5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM");
        Assert.assertEquals("1 3 N\n5 1 E\n", result);
    }
}
