package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StockObservable;

public class MobileNotificationAlert implements NotificationObserver {
    private final String mobileNo;
    
    public MobileNotificationAlert(String mobileNo){
        this.mobileNo = mobileNo;
    }   

    @Override
    public void update(StockObservable stockObservable) {
        System.out.println("Mobile No.:"+mobileNo+" "+"Notification: Current Price is" + stockObservable.getData());
    }
}
