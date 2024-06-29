package ParkingLot.Strategy;

import ParkingLot.Entities.ParkingSpot;
import ParkingLot.Enum.ParkingSpotType;

import java.util.List;

public class DefaultParkingStrategy implements ParkingStrategy {

    @Override
    public ParkingSpot findParkingSpot(ParkingSpotType parkingSpotType, List<ParkingSpot> parkingSpotList) {

        for(int index=0;index<parkingSpotList.size();index++){
            if(!parkingSpotList.get(index).isOccupied()
                    && parkingSpotList.get(index).getParkingSpotType()==parkingSpotType){
                return parkingSpotList.get(index);
            }
        }
        System.out.println("No parking spots available");
        return null;
    }
}
