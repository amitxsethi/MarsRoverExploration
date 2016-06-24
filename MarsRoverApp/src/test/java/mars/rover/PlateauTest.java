package mars.rover;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlateauTest {

    @Test
    public void validatesCoordinates() {
        Plateau plateau = new Plateau(new Coordinates(12, 15));

        assertTrue(plateau.isValid(new Coordinates(0, 0)));
        assertTrue(plateau.isValid(new Coordinates(0, 15)));
        assertTrue(plateau.isValid(new Coordinates(12, 15)));
        assertTrue(plateau.isValid(new Coordinates(12, 0)));

        assertTrue(plateau.isValid(new Coordinates(0, 5)));
        assertTrue(plateau.isValid(new Coordinates(7, 0)));
        assertTrue(plateau.isValid(new Coordinates(12, 5)));
        assertTrue(plateau.isValid(new Coordinates(7, 15)));
        assertTrue(plateau.isValid(new Coordinates(4, 6)));

        assertFalse(plateau.isValid(new Coordinates(-5, 6)));
        assertFalse(plateau.isValid(new Coordinates(4, -2)));
        assertFalse(plateau.isValid(new Coordinates(7, 20)));
        assertFalse(plateau.isValid(new Coordinates(15, 12)));
        assertFalse(plateau.isValid(new Coordinates(25, 25)));
        assertFalse(plateau.isValid(new Coordinates(0, 20)));
        assertFalse(plateau.isValid(new Coordinates(22, 15)));
    }
}
