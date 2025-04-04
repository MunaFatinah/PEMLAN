// Package declaration
package praktic.inheritance.transportation;

public class Bus extends Vehicle {
    private static final int FARE_PER_STOP = 2000;
    private int totalStops = 5;
    
    public Bus(String name, int capacity, String route) {
        super(name, capacity, route);
    }
    
    public void displayFareInfo() {
        System.out.println("Total pemberhentian: " + totalStops);
        System.out.println("Tarif per halte: Rp " + FARE_PER_STOP);
        System.out.println("Total tarif perjalanan bus: Rp " + calculateFare());
    }
    
    @Override
    public int calculateFare() {
        return currentPassengers * totalStops * FARE_PER_STOP;
    }
}