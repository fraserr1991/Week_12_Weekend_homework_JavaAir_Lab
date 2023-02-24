package crew;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember1;

    @Before
    public void before(){
        cabinCrewMember1 = new CabinCrewMember("Kimberly", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Kimberly", cabinCrewMember1.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("flight attendant", cabinCrewMember1.rank.getRank());
    }

    @Test
    public void canMakeAnAnnouncement(){
        assertEquals("Welcome to JavaAir, we'll be walking around in a few minutes with scratch cards, offering a fantastic opportunity to win an all inclusive holiday for 4 in Barbados! Get 3 cards for only £5!", cabinCrewMember1.makeAnAnnouncementToPassengers());
    }
}


    //Welcome to JavaAir, we'll be walking around in a few minutes with scratch cards, offering a fantastic opportunity to win an all inclusive holiday for 4 in Barbados! Get 3 cards for only £5!
