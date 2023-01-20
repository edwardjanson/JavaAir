import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CabinCrewMemberTest {

    private CabinCrewMember flightAttendant;

    @Before
    public void before() {
        flightAttendant = new CabinCrewMember("John Doe", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals("John Doe", flightAttendant.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, flightAttendant.getRank());
    }

    @Test
    public void canRelayMessage() {
        assertEquals("We hope you enjoyed the flight.", flightAttendant.relayMessage("We hope you enjoyed the flight."));
    }

}
