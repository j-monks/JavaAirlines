import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Plane plane;
    private Flight flight;
    private Passenger passenger;
    private Passenger passenger1;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private PlaneType planeType;

    @Before
    public void before() {
        passenger = new Passenger("John", 2);
        passenger1 = new Passenger("Jane", 1);
        passengers = new ArrayList<Passenger>();
        plane = new Plane(planeType.BOEING747);
        flight = new Flight(passengers, plane, "FR756", "EDI", "GLA", "18:00");

    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(10, plane.getCapacity());
    }

    @Test
    public void canGetPlaneTotalWeight() {
        assertEquals(100.00, plane.getTotalWeightInKg(), 0.5);
    }

    @Test
    public void bookPassenger() {
        flight.bookPassenger(passengers, passenger);
        assertEquals(1, passengers.size());
    }

    @Test
    public void getNumberOfAvailableSeats() {
        flight.bookPassenger(passengers, passenger);
        flight.bookPassenger(passengers, passenger1);
        assertEquals(8, flight.getNumberOfAvailableSeats(passengers));
    }

}
