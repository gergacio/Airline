import java.util.ArrayList;

public class Booking {
    //state

    private Passanger passenger;

    //constructor
    public Booking(Passanger passanger){
        this.passenger = passanger;

    }
    public String getBooking(){
        return "Booked";
    }



}
