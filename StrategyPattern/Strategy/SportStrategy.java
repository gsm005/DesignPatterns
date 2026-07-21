package DesignPatterns.StrategyPattern.Strategy;

public class SportStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving in sport mode");
    }
    
}
