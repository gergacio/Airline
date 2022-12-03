import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    @Before
    public void before(){
        pilot = new Pilot("Bob", CabinCrewMemberRank.CAPTAIN, "737licenseA");
    }
    @Test
    public void hasName(){
        assertEquals("Bob", pilot.getName());
    }
    @Test
    public void hasPilotLicenseNumber(){
        assertEquals("737licenseA", pilot.getPilotLicenceNumber());
    }
    @Test
    public void hasPilotMsg(){
        assertEquals("Hello, this is your captain speaking. Welcome aboard", pilot.doMessage());
    }
    @Test
    public void hasFlyThePlane(){
        assertEquals("yabadabadoo", pilot.flyThePlane());
    }

}
