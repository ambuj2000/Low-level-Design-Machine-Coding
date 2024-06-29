package ParkingLot.Strategy;

public class CashPayment implements PaymentStrategy {

    @Override
    public int payAmount(int amount) {
        System.out.println("Paid via Cash:  "+ amount);
        return amount;
    }
}
