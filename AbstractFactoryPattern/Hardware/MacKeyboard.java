package DesignPatterns.AbstractFactoryPattern.Hardware;

public class MacKeyboard implements Keyboard {
    @Override
    public void type(){
        System.out.println("Mac keyboard");
    }
}
