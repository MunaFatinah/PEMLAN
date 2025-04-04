package praktic.inheritance.transportation; // package 

public class Taxi extends Vehicle { // kelas Taxi merupakan subclass dari Vehicle 
    private static final int FARE_PER_KM = 5000; // tarif per kilometer
    private int distance = 10; // jarak tempuh defaul taksi, 10 km sebagai contoh
    
    // konstruktor taksi yang memanggil konstruktor vehicle
    public Taxi(String name, int capacity, String route) {
        super(name, capacity, route);
    }
    
    // method untuk menampilkan informasi tarif taksi
    public void displayFareInfo() { // fiberi nama displayFareInfo
        System.out.println("Total jarak rute: " + distance + " km"); // mencetak km total jarak rute
        System.out.println("Tarif per km: Rp " + FARE_PER_KM); // mencetak tarif per kilo
        System.out.println("Total tarif perjalanan taksi: Rp " + calculateFare()); // mencetak total tarif
    }
    
    // override method calculateFare untuk menghitung tarif berdasarkan jarak
    @Override
    public int calculateFare() {
        return distance * FARE_PER_KM;
    }
}
