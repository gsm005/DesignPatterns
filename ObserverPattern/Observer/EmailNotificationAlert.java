package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StockObservable;

public class EmailNotificationAlert implements NotificationObserver {
    private final String emailId;


    public EmailNotificationAlert(String emailId){
        this.emailId = emailId;
    }

    @Override
    public void update(StockObservable stockObservable) {
        System.out.println("Mail to:"+emailId+" "+"Notification: Current Price is" + stockObservable.getData());
    }
    
}
