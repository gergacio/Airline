public abstract class Person {
    //state
    private String name;
    //constructor
    public Person(String name){
        this.name = name;
    }
    //use getters and setters to access state
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    //no tests for abstract class
    //this class exist only to inherits from
    //Passenger,CabinCrewMember and Pilot extends Person(all share same data - name)
}
