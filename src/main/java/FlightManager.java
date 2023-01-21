import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class FlightManager {

    public static double roundUp(double number) {
        BigDecimal numberRounded = new BigDecimal(number).setScale(2, RoundingMode.HALF_UP);
        number = numberRounded.doubleValue();
        return number;
    }

    public static double baggageWeightPerPassenger(Flight flight) {
        double allocatedWeightForBaggage = flight.getPlane().getPlaneType().getTotalWeight() / 2;
        int planeCapacity = flight.getPlane().getPlaneType().getCapacity();

        return roundUp(allocatedWeightForBaggage / planeCapacity);
    }

    public static double baggageWeightBooked(Flight flight) {
        int totalBaggageBooked = 0;

        for (Passenger passenger : flight.getPassengers()) {
            totalBaggageBooked += passenger.getBagCount();
        }

        return roundUp(totalBaggageBooked * baggageWeightPerPassenger(flight));
    }

    public static double baggageWeightRemaining(Flight flight) {
        double allocatedWeightForBaggage = flight.getPlane().getPlaneType().getTotalWeight() / 2;

        return roundUp(allocatedWeightForBaggage - baggageWeightBooked(flight));
    }
}
