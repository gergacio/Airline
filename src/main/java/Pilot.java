public class Pilot extends CabinCrewMember{
    private String pilotLicenceNumber;
    public Pilot(String name, CabinCrewMemberRank cabinCrewMemberRank, String pilotLicenceNumber){
        super(name, cabinCrewMemberRank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }
    //getters and setters to access state
    public String getPilotLicenceNumber(){
        return this.pilotLicenceNumber;
    }
    public void setPilotLicenceNumber(String updatePilotLicenceNumber){
        this.pilotLicenceNumber = updatePilotLicenceNumber;
    }
    //flying
    public String flyThePlane(){
        return "yabadabadoo";
    }
}
