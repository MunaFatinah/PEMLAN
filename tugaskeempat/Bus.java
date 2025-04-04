package praktic.inheritance.transportation; // package

public class Bus extends Vehicle { // kelas Bus merupakan subclass dari vehicle 
    private static final int FARE_PER_STOP = 2000; // tarif per pemberhentian
    private int totalStops = 5; // jumlah total pemberhentian pada rute, bertipe data integer
    
    // konstruktor bus yang memanggil konstruktor vehicle 
    public Bus(String name, int capacity, String route) {
        super(name, capacity, route);
    }
    
    // method untuk menampilkan informasi tarif bus 
    public void displayFareInfo() { // diberi nama displayFareInfo
        System.out.println("Total pemberhentian: " + totalStops); // mencetak total pemberhentian
        System.out.println("Tarif per halte: Rp " + FARE_PER_STOP); // mencetak tarif per halte
        System.out.println("Total tarif perjalanan bus: Rp " + calculateFare()); // mencetak total tarif
    }

    // Override method calculateFare untuk menghitung tarif berdasarkan jumlah penumpang dan pemberhentian
    @Override
    public int calculateFare() {
        return currentPassengers * totalStops * FARE_PER_STOP;
    }
}
