package DesignUber.strategy;



import DesignUber.Entity.TripMetaData;

public interface PricingStrategy {
    int calculatePrice(TripMetaData tripMetaData);

}
