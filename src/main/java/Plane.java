public class Plane {
    //state
    private PlaneType planeType;
    //constructor
    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }
    //get and set to access state
    public PlaneType getPlaneType(){
        return this.planeType;
    }
    public void setPlaneType(PlaneType updatedPlaneType){
        this.planeType = updatedPlaneType;
    }

}
