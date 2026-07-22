package DesignPatterns.AbstractFactoryPattern.Hardware;

public class MacMouse implements Mouse {
    @Override
    public void click(){
        System.out.println("Mac Mouse");
    }
}
