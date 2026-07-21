package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.NotificationObserver;
import java.util.*;

public class TeslaStockObservable implements StockObservable{
    List<NotificationObserver> observers=new ArrayList<>();
    float price;
    String name="TSLA";

    @Override
    public void add(NotificationObserver observer){
        observers.add(observer);
    }
    @Override
    public void remove(NotificationObserver observer){
        observers.remove(observer);
    }
    @Override
    public void notifyObserver(){
        for(NotificationObserver observer:observers){
            observer.update(this);
        }
    }
    @Override
    public void setData(float price){
        if(this.price==price){
            return;
        }
        this.price=price;
        notifyObserver();
    }
    @Override  
    public float getData(){
        return this.price;
    }
    
}
