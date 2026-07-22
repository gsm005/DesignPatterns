package DesignPatterns.DecoratorPattern;

public class SimplePizza implements Pizza {

    @Override
    public double getCost() {
        return 120;
    }
    @Override
    public String getDescription(){
        return "Simple Pizza";
    }
}
