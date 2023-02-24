package crew;

public class CabinCrewMember extends CrewMember {

    public CabinCrewMember(String name, Rank rank){
        super(name, rank);
    }

    public String makeAnAnnouncementToPassengers(){
        return "Welcome to JavaAir, we'll be walking around in a few minutes with scratch cards, offering a fantastic opportunity to win an all inclusive holiday for 4 in Barbados! Get 3 cards for only £5!";
    }

}
