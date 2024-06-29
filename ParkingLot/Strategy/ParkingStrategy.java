package ParkingLot.Strategy;

import ParkingLot.Entities.ParkingSpot;
import ParkingLot.Enum.ParkingSpotType;

import java.util.List;

public interface ParkingStrategy {

    public ParkingSpot findParkingSpot(ParkingSpotType parkingSpotType, List<ParkingSpot>parkingSpotList);

}
