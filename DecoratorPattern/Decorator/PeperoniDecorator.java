package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Pizza;

public class PeperoniDecorator extends PizzaDecorator{

    public PeperoniDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getCost(){
        return pizza.getCost()+100;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription()+" extra peperoni";
    }

    
}
