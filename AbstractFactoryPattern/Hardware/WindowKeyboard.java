package DesignPatterns.AbstractFactoryPattern.Hardware;

public class WindowKeyboard implements Keyboard{
    @Override
    public void type(){
        System.out.println("Window keyboard");
    }
}
