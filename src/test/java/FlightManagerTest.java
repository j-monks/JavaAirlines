import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FlightManagerTest {
    Plane plane;
    PlaneType planeType;
    FlightManager manager;
    Flight flight;
    ArrayList<Passenger> passengers;

    @Before
    public void before() {
//        passenger = new Passenger("John Doe", 2);
        manager = new FlightManager();
        plane = new Plane(planeType.BOEING747);
        passengers = new ArrayList<Passenger>();
        flight = new Flight(passengers, plane, "FR756", "EDI", "GLA", "18:00");

    }


    @Test
    public void canGetBaggageAllowance() {
        assertEquals(5.0, manager.getBaggageAllowance(flight));
    }

}
