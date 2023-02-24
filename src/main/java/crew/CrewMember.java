package crew;

public abstract class CrewMember {

    private String name;
    Rank rank;

    CrewMember(String name, Rank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName(){
        return this.name;
    }

}