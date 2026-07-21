package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.NotificationObserver;

public interface StockObservable {
    void add(NotificationObserver observer);
    void remove(NotificationObserver observer);
    void setData(float data);
    float getData();
    void notifyObserver();
}
