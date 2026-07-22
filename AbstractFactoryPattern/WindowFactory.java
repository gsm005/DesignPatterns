package DesignPatterns.AbstractFactoryPattern;


import DesignPatterns.AbstractFactoryPattern.Hardware.Keyboard;
import DesignPatterns.AbstractFactoryPattern.Hardware.Mouse;
import DesignPatterns.AbstractFactoryPattern.Hardware.WindowKeyboard;
import DesignPatterns.AbstractFactoryPattern.Hardware.WindowMouse;

public class WindowFactory implements DriverFactory{
    @Override
    public Mouse getMouse(){
        return new WindowMouse();
    }
    
    @Override
    public Keyboard getKeyboard(){
        return new WindowKeyboard();
    }
}
