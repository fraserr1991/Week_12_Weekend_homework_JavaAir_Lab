package flight;

import crew.CabinCrewMember;
import crew.CrewMember;
import crew.Pilot;
import crew.Rank;
import passenger.Passenger;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String departureAirport;
    private String departureTime;
    private int totalWightAllowance;
    private int availableSeats;

    Flight(
           String flightNumber,
           String departureAirport,
           String departureTime,
           int totalWightAllowance,
           int availableSeats){

        this.pilots = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.totalWightAllowance = totalWightAllowance;
        this.availableSeats = availableSeats;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void addPilot(Pilot pilot){
        pilots.add(pilot);
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember){
        cabinCrewMembers.add(cabinCrewMember);
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public int countPilots(){
        return pilots.size();
    }

    public int countCabinCrewMembers(){
        return cabinCrewMembers.size();
    }
    public int countPassengers(){
        return passengers.size();
    }



    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getTotalWightAllowance() {
        return totalWightAllowance;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }


}