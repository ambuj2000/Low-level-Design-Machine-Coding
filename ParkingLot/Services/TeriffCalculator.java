package ParkingLot.Services;

import ParkingLot.Enum.ParkingSpotType;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TeriffCalculator {

    public static int calculatePrice(ParkingSpotType parkingSpotType, Date inTime){
        Date currentTime = new Date();

        long durationInMillis = currentTime.getTime() - inTime.getTime();
        long durationInHours = TimeUnit.MILLISECONDS.toHours(durationInMillis);

        System.out.println("Entry Time: " + inTime);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Duration in hours: " + durationInHours);

        return parkingSpotType.getPrice() * (int) durationInHours;
    }
}
