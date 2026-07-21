package DesignPatterns.StrategyPattern.Strategy;

public class CruiseStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving in cruise mode");
    }
}
