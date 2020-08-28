import java.util.ArrayList;

public class Flight extends Plane{

    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private PlaneType planeType;

    public Flight(int capacity, double totalWeightInKg, ArrayList<Passenger> bookedPassengers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime, PlaneType planeType) {
        super(planeType.getCapacity(), planeType.getTotalWeightInKg());
        this.bookedPassengers = bookedPassengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }
}
