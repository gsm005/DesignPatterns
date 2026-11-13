package DesignPatterns.StateDesignPattern;

public interface VendingMachineState {
    void insertCoin();
    void selectProduct();
    void dispenseProduct();
}
