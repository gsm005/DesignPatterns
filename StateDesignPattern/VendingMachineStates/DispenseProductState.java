package DesignPatterns.StateDesignPattern.VendingMachineStates;

import DesignPatterns.StateDesignPattern.VendingMachine;
import DesignPatterns.StateDesignPattern.VendingMachineState;

public class DispenseProductState implements VendingMachineState {
    private final VendingMachine vendingMachine;
    
    public DispenseProductState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override 
    public void insertCoin() {
        System.out.println("Please wait, dispensing product.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Please wait, dispensing product.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product dispensed. Thank you!");
        vendingMachine.setCurrentState(new IdleState(vendingMachine));
    }
}
