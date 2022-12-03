public class CabinCrewMember extends Person{
    //state
    private CabinCrewMemberRank cabinCrewMemberRank;
    private String message;
    //constructor
    public CabinCrewMember(String name, CabinCrewMemberRank cabinCrewMemberRank){
        super(name);
        this.cabinCrewMemberRank = cabinCrewMemberRank;
        this.message = cabinCrewMemberRank.getMessage();
    }
    public String doMessage(){
        return this.message;
    }

    //provide method to add cabin crew member



}
