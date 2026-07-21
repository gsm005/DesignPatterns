package DesignPatterns.StrategyPattern;
import DesignPatterns.StrategyPattern.Strategy.*;

public class Vehicle{
    int plateNumber;
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy, int plateNumber){
        this.driveStrategy = driveStrategy;
        this.plateNumber = plateNumber;
    }

    public void drive(){
        driveStrategy.drive();
    }

}