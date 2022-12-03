import java.util.ArrayList;

public class FlightManager extends CabinCrewMember{
    public FlightManager(String name, CabinCrewMemberRank cabinCrewMemberRank){
        super(name, cabinCrewMemberRank);
    }
    //getters setters..other methods as well
    public double calculateBaggageWeightPerPassenger(double weight, double capacity){
        double personWeight = 70;
        double peopleWeight = capacity * personWeight;
        double baggageWeight = weight - peopleWeight;
        double baggagePerPerson = baggageWeight / capacity;
        return baggagePerPerson;
    }
    public double calculateBookedBaggage(ArrayList<Passanger> passangers){
        int totalBagage = 0;
        int weight = 20;
        for(int i =0; i < passangers.size(); i++){
            if(passangers.get(i).getNumberOfBags() == 2){
                weight = 30;//if we passanger hold two bags, weight is 30(firstBag = 2-, secondBag = 10)
            }
            totalBagage += weight;
        }
        return  totalBagage;
    }
    public double weightsRemainForAflight(double weight, double capacity,ArrayList<Passanger> passangers){
        double total = calculateBaggageWeightPerPassenger(weight,  capacity) * capacity;//total weight persons and their baggage
        double booked = calculateBookedBaggage(passangers);
        double remain = total - booked;
        return remain;
    }





}
