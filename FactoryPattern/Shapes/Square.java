package DesignPatterns.FactoryPattern.Shapes;

import DesignPatterns.FactoryPattern.Shape;

public class Square implements Shape {
    @Override
    public void draw(){
        System.out.println("Square");
    }
}
