import org.junit.Before;
import org.junit.Test;
//all imports from one library(don't mix them up)

import static org.junit.Assert.assertEquals;

public class PassangerTest {
    //get ref to class which will test
    Passanger passanger;
    @Before
    public void before(){
        //AAA Arrange Assert
        passanger = new Passanger("Boris",1);
    }
    @Test
    public void hasName(){
        assertEquals("Boris", passanger.getName());
    }
    @Test
    public void hasNumberOfBags(){
        assertEquals(1, passanger.getNumberOfBags());
    }
    @Test
    public void  changeNumberOfBags(){
        passanger.setNumberOfBags(2);
        assertEquals(2, passanger.getNumberOfBags());
    }

}
