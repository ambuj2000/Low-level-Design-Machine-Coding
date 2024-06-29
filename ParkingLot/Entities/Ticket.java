package ParkingLot.Entities;

import java.util.Date;

public class Ticket {

    int ticketId;

    Date inTime;

    String vehicleNumber;

    ParkingSpot parkingSpot;

    public Ticket(int ticketId, Date inTime, String vehicleNumber, ParkingSpot parkingSpot) {
        this.ticketId = ticketId;
        this.inTime = inTime;
        this.vehicleNumber = vehicleNumber;
        this.parkingSpot = parkingSpot;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
