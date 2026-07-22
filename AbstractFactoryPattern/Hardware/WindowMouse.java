package DesignPatterns.AbstractFactoryPattern.Hardware;

public class WindowMouse implements Mouse{
    @Override
    public void click(){
        System.out.println("windows mouse");
    }
}
