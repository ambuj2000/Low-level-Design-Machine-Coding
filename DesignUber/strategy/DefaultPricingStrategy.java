package DesignUber.strategy;



import DesignUber.Entity.TripMetaData;

public class DefaultPricingStrategy  implements  PricingStrategy {
    @Override
    public int calculatePrice(TripMetaData tripMetaData) {

        int price =  65;
        System.out.println("Based on " + tripMetaData.getRiderRating() +
                " rider rating, price of the trip is " + price);
        return price;

    }
}
