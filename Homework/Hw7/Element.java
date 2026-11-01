package Homework.Hw7;

public class Element {
    // Properties of an element
    private String name;
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;   // double because it may be fractional

    // Constructor that sets all the properties
    public Element(String name, String symbol, int atomicNumber, double atomicWeight) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    // Lets us print an Element directly with System.out.println
    public String toString() {
        return name + " (" + symbol + "), atomic number: " + atomicNumber
                + ", atomic weight: " + atomicWeight;
    }
}
