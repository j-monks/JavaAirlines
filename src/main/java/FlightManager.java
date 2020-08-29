import java.util.ArrayList;


public class FlightManager {

    public FlightManager() {}

    public double getBaggageAllowance(Flight flight) {
        return flight.getPlaneBaggageReserve() / flight.getPlaneCapacity() ;
    }

    public double getPassengersTotalBaggage(Flight flight) {
        ArrayList<Passenger> passengersArray = flight.getBookedPassengers();
        int total = 0;
        for (Passenger passenger : passengersArray) {
            total += passenger.getNumberOfBags();
        }
        return total;
    }

}
