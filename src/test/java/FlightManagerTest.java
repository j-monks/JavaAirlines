import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FlightManagerTest {
    Plane plane;
    PlaneType planeType;
    Passenger passenger;
    Passenger passenger1;
    FlightManager manager;
    Flight flight;
    ArrayList<Passenger> passengers;

    @Before
    public void before() {
        passenger = new Passenger("John", 2);
        passenger1 = new Passenger("Jane", 1);
        manager = new FlightManager();
        plane = new Plane(planeType.BOEING747);


        passengers = new ArrayList<Passenger>();

        flight = new Flight(passengers, plane, "FR756", "EDI", "GLA", "18:00");
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger1);
    }


    @Test
    public void canGetBaggageAllowance() {
        assertEquals(5.0, manager.getBaggageAllowance(flight));
    }

    @Test
    public void getTotalPassengerBaggage() {
        assertEquals(3.0, manager.getPassengersTotalBaggage(flight));
    }

}
