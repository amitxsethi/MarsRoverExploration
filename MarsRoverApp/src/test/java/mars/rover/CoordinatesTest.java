package mars.rover;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatesTest {

    @Test
    public void createsCoordinates() {
        Coordinates coordinates = new Coordinates(0, 0);
        assertEquals(0, coordinates.getX());
        assertEquals(0, coordinates.getY());

        coordinates = new Coordinates(-5, 12);
        assertEquals(-5, coordinates.getX());
        assertEquals(12, coordinates.getY());
    }

    @Test
    public void equals() {
        Coordinates coordinates = new Coordinates(5, 9);

        assertTrue(coordinates.equals(coordinates));
        assertTrue(coordinates.equals(new Coordinates(5, 9)));

        assertFalse(coordinates.equals(null));
        assertFalse(coordinates.equals(new Object()));

        assertFalse(coordinates.equals(new Coordinates(3, 2)));
        assertFalse(coordinates.equals(new Coordinates(5, 2)));
        assertFalse(coordinates.equals(new Coordinates(3, 9)));
        assertFalse(coordinates.equals(new Coordinates(-5, -9)));
    }
}
