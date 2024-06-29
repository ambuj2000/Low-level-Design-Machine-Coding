package ParkingLot.Enum;

public enum ParkingSpotType {

    TWO_WHEELER(20),

    THREE_WHEELER(30),

    FOUR_WHEELER(50);

    int price;

    ParkingSpotType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
