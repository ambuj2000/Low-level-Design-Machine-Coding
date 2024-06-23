package AmazonNotificationSystem.Observable;

import AmazonNotificationSystem.Observer.StockObserver;

public interface StockObservable {

    public void addObserver(StockObserver stockObserver);

    public void removeObserver(StockObserver stockObserver);

    public void notifyAllObserver();

    public void setData(int count); //for setting count of the product

    public  int getData(); //for setting count of product like iphone,cereals,etc


}
