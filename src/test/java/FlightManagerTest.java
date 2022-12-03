import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;



    @Before
    public void before(){
        flightManager = new FlightManager("Oliver", CabinCrewMemberRank.CAPTAIN);
    }
    @Test
    public void hasName(){
        assertEquals("Oliver", flightManager.getName());
    }
    @Test
    public void hasRank(){
        assertEquals("Captain", CabinCrewMemberRank.CAPTAIN.getValue());
    }
    @Test
    public void hasBaggageWeightPerPerson(){
       assertEquals(180.00, flightManager.calculateBaggageWeightPerPassenger(100000.00,400),0);
    }
    @Test
    public void hasTotalBookedBaggage(){
        Passanger passanger = new Passanger("Peter",2);
        ArrayList<Passanger> passengers = new ArrayList<>();
        passengers.add(passanger);
        assertEquals(30.00, flightManager.calculateBookedBaggage(passengers),0);
    }
    @Test
    public void hasRemainWeightForAflight(){
        Passanger passanger = new Passanger("Peter",2);
        ArrayList<Passanger> passengers = new ArrayList<>();
        passengers.add(passanger);
        assertEquals(71970.00, flightManager.weightsRemainForAflight(100000.00,400,passengers),0 );
    }

}
