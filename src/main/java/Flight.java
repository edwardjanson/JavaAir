import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;


    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrewMembers, Plane plane,
                  String flightNumber, String departureAirport, String arrivalAirport,
                  LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String bookPassenger(Passenger passenger, Flight flight) {
        double baggageSpace = FlightManager.baggageWeightRemaining(flight);
        double baggageWeight = FlightManager.baggageWeightPerPassenger(flight);

        if (remainingSeats() != 0) {
            if (passenger.getBagCount() * baggageWeight > baggageSpace) {
                return "Passenger can be booked in but there is not sufficient space for baggage.";
            }

            passenger.setFlight(flight);

            ArrayList<Integer> availableSeats = new ArrayList<Integer>();
            for (int i = 1; i <= plane.getPlaneType().getCapacity(); i++) {
                availableSeats.add(i);
            }

            for (Passenger passengerLooped : passengers) {
                int passengerSeatNumber = passengerLooped.getSeatNumber();
                if (availableSeats.contains(passengerSeatNumber)) {
                    availableSeats.remove((Integer) passengerSeatNumber);
                }
            }

            Collections.shuffle(availableSeats);
            passenger.setSeatNumber(availableSeats.get(0));
            passengers.add(passenger);

            return "Passenger successfully booked in.";
        }

        return "There are no more seats available for this flight.";
    }

    public int remainingSeats() {
        int flightCapacity = plane.getPlaneType().getCapacity();
        return flightCapacity - passengers.size();
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }
}
