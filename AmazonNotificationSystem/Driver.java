
package AmazonNotificationSystem;

import AmazonNotificationSystem.Observable.CerealObservable;
import AmazonNotificationSystem.Observable.IphoneObservable;
import AmazonNotificationSystem.Observable.StockObservable;
import AmazonNotificationSystem.Observer.EmailObserver;
import AmazonNotificationSystem.Observer.MobileObserver;
import AmazonNotificationSystem.Observer.StockObserver;

public class Driver {
    public static void main(String[] args) {

        //Create products (Observable) for testing
        StockObservable iphone=new IphoneObservable(0);
        StockObservable cereals=new CerealObservable(0);

        //Create observers (subscribers)

        StockObserver mobileObserver1=new MobileObserver("Ambuj");
        StockObserver mobileObserver2=new MobileObserver("Tushar");
        StockObserver mobileObserver3=new MobileObserver("Sparsh");


        StockObserver emailObserver1=new EmailObserver("Ram.gmail.com");
        StockObserver emailObserver2=new EmailObserver("Krishna.gmail.com");


        //Add subscriber to the product
        iphone.addObserver(mobileObserver1);
        iphone.addObserver(mobileObserver3);
        iphone.addObserver(emailObserver1);

        cereals.addObserver(mobileObserver2);
        cereals.addObserver(mobileObserver1);
        cereals.addObserver(emailObserver2);

        //updating the count of iphone to 10, so all the iphone observers should be notified
        iphone.setData(10);

        cereals.setData(9);
        //remove Tushar from the subscriber list
        iphone.removeObserver(mobileObserver2);

        iphone.setData(0);

        iphone.setData(100);

    }
}
