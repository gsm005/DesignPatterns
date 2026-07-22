package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Pizza;

public abstract class PizzaDecorator implements Pizza {
    Pizza pizza;
    
    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public double getCost(){
        return pizza.getCost();
    }
    @Override
    public String getDescription(){
        return pizza.getDescription();
    }
}
