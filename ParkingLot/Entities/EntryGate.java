package ParkingLot.Entities;

import ParkingLot.Enum.ParkingSpotType;
import ParkingLot.Strategy.ParkingStrategy;

import java.util.List;

public class EntryGate extends Gate{

    public EntryGate() {

    }

    Ticket ticket;

    ParkingStrategy parkingStrategy;

    public ParkingSpot getParkingSpot(ParkingSpotType parkingSpotType, List<ParkingSpot>parkingSpotList){
           return parkingStrategy.findParkingSpot(parkingSpotType,parkingSpotList);
    }

}
