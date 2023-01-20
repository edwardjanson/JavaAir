import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before() {
        passenger1 = new Passenger("John Doe", 2);
    }

    @Test
    public void hasName() {
        assertEquals("John Doe", passenger1.getName());
    }

    @Test
    public void hasBagCount() {
        assertEquals(2, passenger1.getBagCount());
    }

    @Test
    public void hasSeatNumber() {
        assertEquals(0, passenger1.getSeatNumber());
    }
}
