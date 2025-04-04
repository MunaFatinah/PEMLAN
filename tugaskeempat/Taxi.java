// Package declaration
package praktic.inheritance.transportation;

public class Taxi extends Vehicle {
    private static final int FARE_PER_KM = 5000;
    private int distance = 10; // 10 km sesuai contoh output
    
    public Taxi(String name, int capacity, String route) {
        super(name, capacity, route);
    }
    
    public void displayFareInfo() {
        System.out.println("Total jarak rute: " + distance + " km");
        System.out.println("Tarif per km: Rp " + FARE_PER_KM);
        System.out.println("Total tarif perjalanan taksi: Rp " + calculateFare());
    }
    
    @Override
    public int calculateFare() {
        return distance * FARE_PER_KM;
    }
}