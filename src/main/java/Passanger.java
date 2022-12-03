public class Passanger extends Person{
    private int numberOfBags;
    private int seatNumber;
    public Passanger(String name, int numberOfBags){
        //here no field name,so pass it up level on inheritance chain
        //invoke parent class constructor and pass outside coming name;
        super(name);
        this.numberOfBags = numberOfBags;
    }
    //getters and setters to access private data
    public int getNumberOfBags(){
        return this.numberOfBags;
    }
    public int getSeatNumber(){
        return this.seatNumber;
    }
    public void setSeatNumber(int updatedSeatNumber){
        this.seatNumber = updatedSeatNumber;
    }
    public void setNumberOfBags(int newNumberOfBags){
        this.numberOfBags = newNumberOfBags;
    }
}
