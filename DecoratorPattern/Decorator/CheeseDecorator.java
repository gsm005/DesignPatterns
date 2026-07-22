package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Pizza;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getCost(){
        return pizza.getCost()+50;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription()+" extra cheese";
    }

    
}
