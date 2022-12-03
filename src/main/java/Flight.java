import java.util.ArrayList;
import java.util.Date;

public class Flight {
    //state
    //composition -- Flight has Pilot, CabinCrewMembers, Passengers, Plane
    //has own data as well
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passanger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private double departureTime;

    private int availableSeats;

    //private FlightManager flightManager;


    //constructor
    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers,
                  ArrayList<Passanger> passangers, Plane plane, String flightNumber,
                  String destination, String departureAirport, Double departureTime, int availableSeats) {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = passangers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.availableSeats = availableSeats;
    }

    //methods - getters, setters..safe access state
    public String getPilotName() {
        return pilot.getName();
    }

    //provide method to add cabin crew member
    public String getCabinCrewMembers() {
        String suffix = ", ";
        String crewMembers = "";
        //loop over collection, i should me <(not <=) ..otherwise will go out of collection (invalid index)
        for (int i = 0; i < this.cabinCrewMembers.size(); i++) {
            if (i != this.cabinCrewMembers.size() - 1) {
                crewMembers += cabinCrewMembers.get(i).getName() + suffix;//get each member than his name
            } else {
                crewMembers += cabinCrewMembers.get(i).getName();
            }
        }
        return crewMembers;
    }

    public String getPassengers() {
        String suffix = ", ";
        String listOfPassengers = "";

        //loop over collection, i should me <(not <=) ..otherwise will go out of collection (invalid index)
        for (int i = 0; i < this.passengers.size(); i++) {
            if (i != this.passengers.size() - 1) {
                listOfPassengers += this.passengers.get(i).getName() + suffix;
            } else {
                listOfPassengers += this.passengers.get(i).getName();
            }


        }
        return listOfPassengers;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(String updatedFlightNumber) {
        this.flightNumber = updatedFlightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String updatedDestination) {
        this.destination = updatedDestination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public void setDepartureAirport(String updatedDepartureAirport) {
        this.departureAirport = updatedDepartureAirport;
    }

    public double getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(Double updatedDepartureTime) {
        this.departureTime = updatedDepartureTime;
    }

    //getter setter - access seat prop
    public int getAvailableSeats() {
        return this.availableSeats;
    }

    public void setAvailableSeats(int updatedAvailableSeats) {
        this.availableSeats = updatedAvailableSeats;
    }

    //need Person and num of seats to make a booking
    //loop collection and find the person witch match the name, than setup seat number
    public void bookPassanger(Passanger passenger, int passengerSeat) {
        boolean isBooked = false;
        if (getAvailableSeats() - 1 >= 0) {
            setAvailableSeats(getAvailableSeats() - 1);//update available seats
            Passanger foundPassenger;
            for (int i = 0; i < passengers.size(); i++) {
                if (passenger.getName() == passengers.get(i).getName()) {
                    foundPassenger = passengers.get(i);
                    //found passenger and compare his prop seats num with given from ouside
                    if (foundPassenger.getSeatNumber() == 0) {
                        foundPassenger.setSeatNumber(passengerSeat);
                        isBooked = true;
                    }

                }
            }
        }
    }

}
