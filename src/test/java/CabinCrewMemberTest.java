import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;
    @Before
    public void before(){

        cabinCrewMember = new CabinCrewMember("Bob", CabinCrewMemberRank.CAPTAIN);
        //cabinCrewMember = new CabinCrewMember("Anna", CabinCrewMemberRank.FLIGHT_ATTENDANT);
    }
    @Test
    public void hasName(){
        assertEquals("Bob", cabinCrewMember.getName());
    }
    @Test
    public void hasMassage(){
        assertEquals("Hello, this is your captain speaking. Welcome aboard", cabinCrewMember.doMessage());
        //assertEquals("Ladies and gentlemen...flight attendant msg", cabinCrewMember.getMessage());
    }
}
