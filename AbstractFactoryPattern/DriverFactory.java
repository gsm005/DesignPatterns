package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.Hardware.Keyboard;
import DesignPatterns.AbstractFactoryPattern.Hardware.Mouse;

public interface DriverFactory{
    Mouse getMouse();
    Keyboard getKeyboard();
}
