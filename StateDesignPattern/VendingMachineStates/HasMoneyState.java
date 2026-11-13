package DesignPatterns.StateDesignPattern.VendingMachineStates;

import DesignPatterns.StateDesignPattern.VendingMachine;
import DesignPatterns.StateDesignPattern.VendingMachineState;

public class HasMoneyState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    HasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override 
    public void insertCoin(){
        System.out.println("Coin already inserted. Please select a product.");
    }

    @Override 
    public void selectProduct(){
        System.out.println("Product selected. Dispensing product...");
        vendingMachine.setCurrentState(new DispenseProductState(vendingMachine));
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert a coin and select a product first.");
    }
}
