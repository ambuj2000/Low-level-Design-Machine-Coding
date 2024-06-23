package AmazonNotificationSystem.Observer;

import AmazonNotificationSystem.Observable.StockObservable;

public class EmailObserver implements StockObserver{

    String email;

    public EmailObserver(String email) {
          this.email=email;
    }

    @Override
    public void update(StockObservable stockObservable) {
        sendMail(email,stockObservable.getData());
    }

    private void sendMail(String email, int productCount){
        System.out.println("Notification received by the person in email: "+ email);
        System.out.println("The product count received to email: "+ productCount);
    }
}
