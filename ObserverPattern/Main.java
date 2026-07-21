package DesignPatterns.ObserverPattern;

import java.util.ArrayList;

import DesignPatterns.ObserverPattern.Observable.*;
import DesignPatterns.ObserverPattern.Observer.*;

public class Main {
    public static void main(String [] args){
        StockObservable appleStockObservable = new AppleStockObservable();
        StockObservable teslaStockObservable = new TeslaStockObservable();
        NotificationObserver mobileNotificationAlert = new MobileNotificationAlert("9068228415");
        NotificationObserver emailNotificationAlert = new EmailNotificationAlert("ram@gmail.com");
        appleStockObservable.add(mobileNotificationAlert);
        appleStockObservable.add(emailNotificationAlert);
        teslaStockObservable.add(mobileNotificationAlert);
        teslaStockObservable.add(emailNotificationAlert);

        appleStockObservable.setData(100.0f);
        appleStockObservable.setData(101.0f);
        teslaStockObservable.setData(2000.0f);

        appleStockObservable.remove(emailNotificationAlert);
        
        appleStockObservable.setData(300.0f);

    }
    
}
