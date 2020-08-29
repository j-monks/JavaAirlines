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
        return total * 25;
    }

    public double getRemainingReserveBagAllowance(Flight flight) {
        double passengersBaggage = this.getPassengersTotalBaggage(flight);
        double totalBaggage = flight.getPlaneTotalBaggageWeight();
        return totalBaggage - passengersBaggage;
    }

}
