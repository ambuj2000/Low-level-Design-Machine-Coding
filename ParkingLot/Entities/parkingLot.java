package ParkingLot.Entities;

import ParkingLot.Enum.ParkingSpotType;
import ParkingLot.Services.TeriffCalculator;
import ParkingLot.Strategy.ParkingStrategy;

import java.util.*;

public class parkingLot {

    List<ParkingSpot> parkingSpotList;
    HashMap<Vehicle, ParkingSpot> vehicleParkingSpotHashMap;
    HashMap<Vehicle, Date> vehicleEntryTimeMap;

    public parkingLot(int twoWheelerCount, int threeWheelerCount, int fourWheelerCount){

        parkingSpotList = new ArrayList<>();
        vehicleParkingSpotHashMap = new HashMap<>();
        vehicleEntryTimeMap = new HashMap<>();
        int parkingSpotId = 1;

        for (int index = 0; index < twoWheelerCount; index++) {
            ParkingSpot parkingSpot = new TwoWheelerParkingSpot(parkingSpotId++, ParkingSpotType.TWO_WHEELER);
            parkingSpotList.add(parkingSpot);
        }

        for (int index = 0; index < threeWheelerCount; index++) {
            ParkingSpot parkingSpot = new ThreeWheelerParkingSpot(parkingSpotId++, ParkingSpotType.THREE_WHEELER);
            parkingSpotList.add(parkingSpot);
        }

        for (int index = 0; index < fourWheelerCount; index++) {
            ParkingSpot parkingSpot = new FourWheelerParkingSpot(parkingSpotId++, ParkingSpotType.FOUR_WHEELER);
            parkingSpotList.add(parkingSpot);
        }
    }

    public boolean parkVehicle(Vehicle vehicle, ParkingStrategy parkingStrategy){

        ParkingSpot parkingSpot = parkingStrategy.findParkingSpot(vehicle.getParkingSpotType(), parkingSpotList);
        if(parkingSpot == null){
            return false;
        }
        parkingSpot.setOccupied(true);
        vehicleParkingSpotHashMap.put(vehicle, parkingSpot);
        vehicleEntryTimeMap.put(vehicle, new Date());  // Store entry time
        System.out.println("Vehicle parked successfully with number: " + vehicle.getVehicleNumber());
        return true;
    }

    public void releaseSpot(Vehicle vehicle){

        if(vehicleParkingSpotHashMap.containsKey(vehicle)){
            ParkingSpot parkingSpot = vehicleParkingSpotHashMap.get(vehicle);
            parkingSpot.setOccupied(false);
            updateParkingList(parkingSpot);
            System.out.println("Vehicle spot released for: " + vehicle.getVehicleNumber());

            Date entryTime = vehicleEntryTimeMap.get(vehicle);
            int teriffAmount = TeriffCalculator.calculatePrice(vehicle.getParkingSpotType(), entryTime);
            System.out.println("Tariff amount: " + teriffAmount);

            vehicleParkingSpotHashMap.remove(vehicle);
            vehicleEntryTimeMap.remove(vehicle);
        } else {
            System.out.println("Parking spot is not released as the vehicle is not found");
        }
    }

    private void updateParkingList(ParkingSpot parkingSpot){
        for (int index = 0; index < parkingSpotList.size(); index++) {

            if(parkingSpot.getParkingSpotId() == parkingSpotList.get(index).getParkingSpotId()){
                parkingSpotList.set(index, parkingSpot);
                System.out.println("Updated parking spot");
            }
        }
    }
}
