package crew;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot1;

    @Before
    public void before() {
        pilot1 = new Pilot("Jeff", "JEF123", Rank.CAPTAIN);
    }

    @Test
    public void pilotHasName(){
        assertEquals("Jeff", pilot1.getName() );
    }

    @Test
    public void pilotHasRank(){
        assertEquals("captain", pilot1.rank.getRank());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("This is me, the pilot, flying the plane ... whoooshhhh!", pilot1.canFlyPlane());
    }

}
