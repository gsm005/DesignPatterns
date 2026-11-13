package DesignPatterns.StateDesignPattern;

import DesignPatterns.StateDesignPattern.VendingMachineStates.IdleState;

public class VendingMachine implements VendingMachineState {
    private VendingMachineState currentState;

    public VendingMachine() {
        currentState = new IdleState(this);
    }

    public void setCurrentState(VendingMachineState state) {
        this.currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectProduct() {
        currentState.selectProduct();
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
    }
    
}
