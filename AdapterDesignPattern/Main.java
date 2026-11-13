package DesignPatterns.AdapterDesignPattern;

public class Main {
    public static void main(String[] args){
        WeightMachine weightMachine = new WeightMachine(150); // weight in pounds
        WeightMachineAdapter adapter = new WeightMachineAdapterImpl(weightMachine);
        System.out.println("Weight in Kg: " + adapter.getWeightInKg());
    }
}
