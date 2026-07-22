package DesignPatterns.FactoryPattern.Shapes;

import DesignPatterns.FactoryPattern.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("Rectangle");
    }
}
