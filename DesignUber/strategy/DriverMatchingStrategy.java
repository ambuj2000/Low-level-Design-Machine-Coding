package DesignUber.strategy;



import DesignUber.Entity.Driver;
import DesignUber.Entity.TripMetaData;

public interface DriverMatchingStrategy {

    public Driver matchDriver(TripMetaData tripMetaData);
}
