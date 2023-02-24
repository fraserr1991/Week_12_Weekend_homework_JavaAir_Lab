package passenger;

import crew.Pilot;
import crew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger1;

    @Before
    public void before() {
        passenger1 = new Passenger("Nacho", 2 );
    }

    @Test
    public void hasName(){
        assertEquals("Nacho", passenger1.getName() );
    }

    @Test
    public void hasANumberOfBags(){
        assertEquals(2, passenger1.numberOfBags());
    }
}
