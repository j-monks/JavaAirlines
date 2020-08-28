import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Plane plane1;
    private Passenger bookedPassenger;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private PlaneType planeType;

    @Before
    public void before() {
      plane1 = new Plane(planeType.BOEING747);
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(10, plane1.getCapacity());
    }

    @Test
    public void canGetPlaneTotalWeight() {
        assertEquals(100.00, plane1.getTotalWeightInKg(), 0.5);
    }

}
