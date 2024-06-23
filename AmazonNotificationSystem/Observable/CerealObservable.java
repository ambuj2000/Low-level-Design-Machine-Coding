package AmazonNotificationSystem.Observable;

import AmazonNotificationSystem.Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class CerealObservable implements StockObservable {

    int count;
    List<StockObserver>observerList;

    public CerealObservable(int count) {
        this.count = count;
        this.observerList=new ArrayList<>();
    }

    @Override
    public void addObserver(StockObserver stockObserver) {
        System.out.println("Added cereals observer to the list");
        observerList.add(stockObserver);
    }

    @Override
    public void removeObserver(StockObserver stockObserver) {
        observerList.remove(stockObserver);
    }

    @Override
    public void notifyAllObserver() {
        System.out.println("Notifying all subscribers for Cereal");

        for(StockObserver stockObserver:observerList){
            stockObserver.update(this); //update the current object
        }
    }

    @Override
    public void setData(int newCount) {
        if(newCount==0) {
            System.out.println("The product count of Cereal is 0");
            this.count=newCount;
        }else if(newCount>0){
            this.count=newCount;
            notifyAllObserver();
        }else{
            System.out.println("The product count cannot be negative");
        }
    }

    @Override
    public int getData() {
        return count;
    }
}
