package DesignPatterns.AdapterDesignPattern;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    private final WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public float getWeightInKg() {
        return weightMachine.getWeightInPounds() * 0.453592f; // Convert pounds to kilograms
    }
    
}
