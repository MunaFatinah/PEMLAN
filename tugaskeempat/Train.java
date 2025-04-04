// Package declaration
package praktic.inheritance.transportation;

public class Train extends Vehicle {
    private static final int FIXED_FARE = 10000;
    
    public Train(String name, int capacity, String route) {
        super(name, capacity, route);
    }
    
    public void displayFareInfo() {
        System.out.println("Tarif tetap per penumpang: Rp " + FIXED_FARE);
        System.out.println("Total tarif perjalanan kereta: Rp " + calculateFare());
    }
    
    @Override
    public int calculateFare() {
        return currentPassengers * FIXED_FARE;
    }
}