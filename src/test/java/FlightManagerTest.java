import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightManagerTest {

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
    private Passenger passenger1;
    private Passenger passenger2;

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

        passenger1 = new Passenger("John Doe", 2);
        passenger2 = new Passenger("Jane Doe", 1);
        flight.bookPassenger(passenger1, flight);
        flight.bookPassenger(passenger2, flight);
    }

    @Test
    public void baggageWeightPerPassenger() {
        assertEquals(20.00, FlightManager.baggageWeightPerPassenger(flight), 0.0);
    }

    @Test
    public void baggageWeightBooked() {
        assertEquals(60.00, FlightManager.baggageWeightBooked(flight), 0.0);
    }

    @Test
    public void baggageWeightRemaining() {
        assertEquals(3340.00, FlightManager.baggageWeightRemaining(flight), 0.0);
    }
}