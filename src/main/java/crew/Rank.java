package crew;

public enum Rank {
    CAPTAIN("captain"),
    FIRSTOFFICER("first officer"),
    LEADATTENDANT("lead attendant"),
    FLIGHTATTENDANT("flight attendant");

    private final String rank;

    Rank(String rank){
        this.rank = rank;
    }

    public String getRank(){
        return this.rank;
    }
}
