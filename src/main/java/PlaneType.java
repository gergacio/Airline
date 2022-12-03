public enum PlaneType {
    BOEING747("Boeing747",400,100000);
    private final String value;

    private final int capacity;
    private final int totalWeight;
    PlaneType(String value,int capacity, int totalWeight){
        this.value = value;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }
    //getters
    public String getValue(){
        return this.value;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public int getTotalWeight(){
        return this.totalWeight;
    }

}
