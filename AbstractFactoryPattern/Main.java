package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.Hardware.Keyboard;
import DesignPatterns.AbstractFactoryPattern.Hardware.Mouse;

public class Main {
    public static void main(String[] args) {
        DriverFactory driverFactory=new MacFactory();
        Keyboard keyboard=driverFactory.getKeyboard();
        Mouse mouse=driverFactory.getMouse();

        keyboard.type();
        mouse.click();
    }
}
