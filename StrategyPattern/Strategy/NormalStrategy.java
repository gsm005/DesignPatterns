package DesignPatterns.StrategyPattern.Strategy;

public class NormalStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving in normal mode");
    }
}
