package ParkingLot;

import ParkingLot.Entities.Vehicle;
import ParkingLot.Entities.parkingLot;
import ParkingLot.Enum.ParkingSpotType;
import ParkingLot.Strategy.DefaultParkingStrategy;
import ParkingLot.Strategy.ParkingStrategy;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        int twoWheelerCount = 2, threeWheelerCount = 5, fourWheelerCount = 10;

        parkingLot parkingLot = new parkingLot(twoWheelerCount, threeWheelerCount, fourWheelerCount);

        Vehicle bike = new Vehicle("DL O1 1234", ParkingSpotType.THREE_WHEELER);
        Vehicle bike2 = new Vehicle("MH O1 1234", ParkingSpotType.THREE_WHEELER);
        Vehicle bike3 = new Vehicle("DL O1 1234", ParkingSpotType.THREE_WHEELER);

        Vehicle car = new Vehicle("DL O1 3527", ParkingSpotType.FOUR_WHEELER);
        Vehicle truck = new Vehicle("MH O1 3734", ParkingSpotType.FOUR_WHEELER);
        Vehicle bus = new Vehicle("DL O1 1265", ParkingSpotType.FOUR_WHEELER);

        ParkingStrategy parkingStrategy = new DefaultParkingStrategy();

        parkingLot.parkVehicle(bike, parkingStrategy);
        parkingLot.parkVehicle(bike2, parkingStrategy);
        parkingLot.parkVehicle(bike3, parkingStrategy);

        // Simulate a delay to create a non-zero parking duration
        Thread.sleep(5000); // Sleep for 5 seconds for testing

        parkingLot.releaseSpot(bike);

        parkingLot.parkVehicle(bike3, parkingStrategy);

        // Simulate another delay
        Thread.sleep(5000); // Sleep for another 5 seconds for testing

        // Cars
        parkingLot.parkVehicle(car, parkingStrategy);
        parkingLot.parkVehicle(truck, parkingStrategy);
        parkingLot.parkVehicle(bus, parkingStrategy);
    }
}
