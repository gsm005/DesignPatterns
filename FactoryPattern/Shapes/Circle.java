package DesignPatterns.FactoryPattern.Shapes;

import DesignPatterns.FactoryPattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("Circle");
    }
}
