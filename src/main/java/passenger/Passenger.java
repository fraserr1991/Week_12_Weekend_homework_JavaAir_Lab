package passenger;

public class Passenger {
    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    public int numberOfBags() {
        return this.numberOfBags;
    }

    public String getName() {
        return this.name;
    }
}