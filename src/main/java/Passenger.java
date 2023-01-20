public class Passenger {

    private String name;
    private int bagCount;
    private int seatNumber;
    private Flight flight;

    public Passenger(String name, int bagCount, int seatNumber) {
        this.name = name;
        this.bagCount = bagCount;
        this.seatNumber = seatNumber;
        this.flight = null;
    }

    public String getName() {
        return name;
    }

    public int getBagCount() {
        return bagCount;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
