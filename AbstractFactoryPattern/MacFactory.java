package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.Hardware.Keyboard;
import DesignPatterns.AbstractFactoryPattern.Hardware.MacKeyboard;
import DesignPatterns.AbstractFactoryPattern.Hardware.MacMouse;
import DesignPatterns.AbstractFactoryPattern.Hardware.Mouse;
public class MacFactory implements DriverFactory {
    @Override
    public Mouse getMouse(){
        return new MacMouse();
    }
    
    @Override
    public Keyboard getKeyboard(){
        return new MacKeyboard();
    }
}
