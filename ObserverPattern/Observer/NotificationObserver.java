package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StockObservable;

public interface NotificationObserver {
    void update(StockObservable stockObservable);
}
