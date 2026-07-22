package DesignPatterns.FactoryPattern;

import DesignPatterns.FactoryPattern.Shapes.Circle;
import DesignPatterns.FactoryPattern.Shapes.Rectangle;
import DesignPatterns.FactoryPattern.Shapes.Square;

public class ShapeFactory {
    public Shape getShape(String input){
        if(input.equals("circle"))
            return new Circle();
        else if(input.equals("square"))
            return new Square();
        else if(input.equals("Rectangle"))
            return new Rectangle();
        return null;
    }
}
