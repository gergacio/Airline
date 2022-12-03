public enum CabinCrewMemberRank {
    CAPTAIN("Captain","Hello, this is your captain speaking. Welcome aboard"),
    FIRST_OFFICER("First Officer","Ladies and gentlemen...first officer msg"),
    PURSER("Purser","Ladies and gentlemen...purser msg"),
    FLIGHT_ATTENDANT("Flight Attendant","Ladies and gentlemen...flight attendant msg");

    private final String value;
    private final String message;
    CabinCrewMemberRank(String value,String message){
        this.value = value;
        this.message = message;
    }
    public String getValue(){
        return this.value;
    }
    public String getMessage(){
        return this.message;
    }

}
