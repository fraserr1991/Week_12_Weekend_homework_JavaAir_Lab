package flight;

import crew.CabinCrewMember;
import crew.Pilot;
import crew.Rank;
import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight1;

    Pilot pilot1;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    CabinCrewMember cabinCrewMember1;

    @Before
    public void before() {
        flight1 = new Flight("FRA123",
                            "LDN",
                            "12:30",
                            50,
                            3);

        pilot1 = new Pilot("Lee", "LEE123", Rank.CAPTAIN);

        passenger1 = new Passenger("George", 2);
        passenger2 = new Passenger("Randy", 1);
        passenger3 = new Passenger("Nacho", 2);
        passenger4 = new Passenger("Henry", 2);


        cabinCrewMember1 = new CabinCrewMember("Joe", Rank.FLIGHTATTENDANT);

    }

    @Test
    public void hasFlightNumber() {
        assertEquals("FRA123", flight1.getFlightNumber());
    }

    @Test
    public void canAddPassenger() {
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(2, flight1.countPassengers());
    }

    @Test
    public void canAddPilot(){
        flight1.addPilot(pilot1);
        assertEquals(1, flight1.countPilots());
    }

    @Test
    public void canAddCabinCrewMembers(){
        flight1.addCabinCrewMember(cabinCrewMember1);
        assertEquals(1, flight1.countCabinCrewMembers());
    }

    @Test
    public void canCheckAvailableSeats(){
        assertEquals(3, flight1.getAvailableSeats());
    }

    @Test
    public void canReduceAvailableSeatsWhenPassengerIsAdded(){
        flight1.addPassenger(passenger1);
        assertEquals(2, flight1.getAvailableSeats());
    }

    @Test
    public void passengerCantBeAddedIfFlightIsFull(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        flight1.addPassenger(passenger4);
        assertEquals(0, flight1.getAvailableSeats());
        assertEquals(3, flight1.countPassengers());
    }
}
