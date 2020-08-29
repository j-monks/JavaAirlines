import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<Passenger> bookedPassengers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.bookedPassengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public double getPlaneTotalBaggageWeight() {
        return plane.getTotalWeightInKg();
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

    public int getPassengersBags(ArrayList<Passenger> passengersArray) {
        int total = 0;
        for (Passenger passenger : passengersArray) {
           total = passenger.getNumberOfBags();
        }
        return total;
    }

    public int getPlaneCapacity() {
        return plane.getCapacity();
    }


    public double getPlaneBaggageReserve() {
        return plane.getTotalWeightInKg() / 2;
    }


    public int getNumberOfAvailableSeats(ArrayList<Passenger> passengersArray) {
        int capacity = plane.getCapacity();
        int total = 0;
        for (int i = 0; i < passengersArray.size(); i++) {
               total += 1;
           }
        int numberOfSeatsAvailable = capacity - total;
        return numberOfSeatsAvailable;
    }

    public void bookPassenger( Passenger passenger) {
        if (getNumberOfAvailableSeats(this.getBookedPassengers()) >= 1) {
            this.getBookedPassengers().add(passenger);
        }
    }
}
