import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    //list reference to all classes we need for a tests
    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Passanger passanger;
    Passanger anotherPassanger;

    Plane plane;

    @Before
    public void before(){
        //provide a lot of staff to test a flight AAA(Arrange)
        //need Pilot, CabinCrewMember, Passangers, Plane
        pilot = new Pilot("Bob",CabinCrewMemberRank.CAPTAIN, "737licenseA");
        //make and add cabinCrewMember to the collection..pass collection to flight constructor
        cabinCrewMember = new CabinCrewMember("Anna",CabinCrewMemberRank.FLIGHT_ATTENDANT);
        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(cabinCrewMember);
        cabinCrewMembers.add(pilot);
        //passangers
        passanger = new Passanger("Gary",1);
        anotherPassanger = new Passanger("Harry",2);
        ArrayList<Passanger> passangers = new ArrayList<>();
        passangers.add(passanger);
        passangers.add(anotherPassanger);

        //Plane
        plane = new Plane(PlaneType.BOEING747);


        //pass flightNum, destination, departAeroport, departureTime to flight constructor to init a state
        flight = new Flight(pilot, cabinCrewMembers, passangers, plane,
                "FR756", "EDI", "GLA", 15.30, 366);
    }

    //tests
    @Test
    public void hasPilotName(){
        pilot.setName("Tom");
        assertEquals("Tom", flight.getPilotName());
    }
    @Test
    public void hasCabinCrewMembers(){
        assertEquals("Anna, Bob", flight.getCabinCrewMembers());
    }
    @Test
    public void hasPassangers(){
        assertEquals("Gary, Harry", flight.getPassengers());
    }
    @Test
    public void hasPlaneCapacity(){
        assertEquals(500, plane.getPlaneType().getCapacity());
    }
    @Test
    public void hasFlightNumber(){
        flight.setFlightNumber("FR757");
        assertEquals("FR757", flight.getFlightNumber());
    }
    @Test
    public void hasdestination(){
        flight.setDestination("GLA");
        assertEquals("GLA", flight.getDestination());
    }
    @Test
    public void hasDepartureAirport(){
        flight.setDepartureAirport("EDI");
        assertEquals("EDI", flight.getDepartureAirport());
    }
    @Test
    public void hasDepartureTime(){
        flight.setDepartureTime(15.30);
        assertEquals(15.30, flight.getDepartureTime(), 0);
    }
    @Test
    public void hasAvailableSeats(){
        flight.setAvailableSeats(362);
        assertEquals(362, flight.getAvailableSeats());
    }
    @Test
    public void hasBookingPassenger(){
        Passanger passanger = new Passanger("Mery", 2);
        flight.bookPassanger(passanger,22);
        //all available seats are 366 ..so we ecpected one less
        assertEquals(365, flight.getAvailableSeats());
    }
}
