package DesignPatterns.StrategyPattern;
import DesignPatterns.StrategyPattern.Strategy.*;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle1 = new Vehicle(new SportStrategy(), 1234);
        Vehicle vehicle2 = new Vehicle(new CruiseStrategy(), 5678);
        Vehicle vehicle3 = new Vehicle(new NormalStrategy(), 9101);

        vehicle1.drive();
        vehicle2.drive();
        vehicle3.drive();
    }
}
