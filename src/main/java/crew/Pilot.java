package crew;

public class Pilot extends CrewMember {
    private String pilotLicence;

    public Pilot(String name, String pilotLicence, Rank rank){
        super(name, rank);
        this.pilotLicence = pilotLicence;
    }

    public String getPilotLicence(){
        return this.pilotLicence;
    }

    public String canFlyPlane(){
        return "This is me, the pilot, flying the plane ... whoooshhhh!";
    }

}
