package DesignPatterns.FactoryPattern;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What shape do you want?");
        String type=sc.next();
        Shape shape=ShapeFactory.getShape(type.toLowerCase());
        shape.draw();
        sc.close();
    }
}
