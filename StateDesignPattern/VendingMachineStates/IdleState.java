package DesignPatterns.StateDesignPattern.VendingMachineStates;

import DesignPatterns.StateDesignPattern.VendingMachine;
import DesignPatterns.StateDesignPattern.VendingMachineState;

public class IdleState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. You can now select a product.");
        vendingMachine.setCurrentState(new HasMoneyState(vendingMachine));
    }

    @Override
    public void selectProduct() {
        System.out.println("Please insert a coin first.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert a coin and select a product first.");
    }
    
}
