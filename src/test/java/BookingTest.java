import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking;
    Passanger passenger;
    @Before
    public void before(){
        passenger = new Passanger("Mery",2);
        booking = new Booking(passenger);
    }
    @Test
    public void hasBooking(){
        assertEquals("Booked", booking.getBooking());
    }

}
