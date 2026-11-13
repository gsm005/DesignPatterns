package DesignPatterns.StateDesignPattern;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        // Test the vending machine states
        vendingMachine.insertCoin(); // Transition to HasMoneyState
        vendingMachine.selectProduct(); // Transition to DispenseProductState
        vendingMachine.dispenseProduct(); // Transition back to IdleState

        vendingMachine.selectProduct(); // Should prompt to insert a coin first
        vendingMachine.insertCoin(); // Transition to HasMoneyState
        vendingMachine.dispenseProduct(); // Should prompt to select a product first
    }
}
