import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightTest {

    private Flight flight;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Pilot> pilots;
    private Plane plane;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;

    private CabinCrewMember cabinCrewMember1;
    private CabinCrewMember cabinCrewMember2;
    private Pilot pilot1;
    private Pilot pilot2;
    private Passenger passenger;

    @Before
    public void before() {
        cabinCrewMember1 = new CabinCrewMember("Roger Murdock", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Lisa Davis", Rank.FLIGHT_ATTENDANT);
        pilot1 = new Pilot("Shirley Banks", Rank.CAPTAIN, "1232DQD");
        pilot2 = new Pilot("Rex Kramer", Rank.FIRST_OFFICER, "43534GSW");

        cabinCrewMembers = new ArrayList<CabinCrewMember>();
        cabinCrewMembers.add(cabinCrewMember1);
        cabinCrewMembers.add(cabinCrewMember2);

        pilots = new ArrayList<Pilot>();
        pilots.add(pilot1);
        pilots.add(pilot2);

        departureTime = LocalDateTime.of(2023, 01, 23, 12, 30);
        arrivalTime = LocalDateTime.of(2023, 01, 23, 15, 30);

        plane = new Plane(PlaneType.A320);

        flight = new Flight(pilots, cabinCrewMembers, plane, "ABC123",
                "EDI", "GVA", departureTime, arrivalTime);
    }

    @Test
    public void hasPilots() {
        assertEquals(2, flight.getPilots().size());
    }

    @Test
    public void hasCabinCrewMembers() {
        assertEquals(2, flight.getCabinCrewMembers().size());
    }

    @Test
    public void hasPassengers() {
        passenger = new Passenger("John Doe", 2);
        flight.bookPassenger(passenger, flight);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("ABC123", flight.getFlightNumber());
    }

    @Test
    public void getDepartureAirport() {
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void getArrivalAirport() {
        assertEquals("GVA", flight.getArrivalAirport());
    }

    @Test
    public void getDepartureTime() {
        assertEquals("2023-01-23T12:30", flight.getDepartureTime().toString());
    }

    @Test
    public void getArrivalTime() {
        assertEquals("2023-01-23T15:30", flight.getArrivalTime().toString());
    }

}