import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Jane Doe", "1234AWEDF", Rank.CAPTAIN);
    }

    @Test
    public void getName() {
        assertEquals("Jane Doe", pilot.getName());
    }

    @Test
    public void getLicenceNumber() {
        assertEquals("1234AWEDF", pilot.getLicenceNumber());
    }

    @Test
    public void getRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }
}