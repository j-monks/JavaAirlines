import java.util.ArrayList;


public class FlightManager {

    public FlightManager() {}

    public double getBaggageAllowance(Flight flight) {
        return flight.getPlaneBaggageReserve() / flight.getPlaneCapacity() ;
    }

}
