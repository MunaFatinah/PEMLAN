package praktic.inheritance.transportation; // package

public class Train extends Vehicle { // kelas Train merupakan subclass dari Vehicle
    private static final int FIXED_FARE = 10000; // tarif tetap untuk setiap penumpang, bertipe data integer
    
    public Train(String name, int capacity, String route) { // konstruktor train yang memanggil konstruktor vehicle
        super(name, capacity, route);
    }
    
    public void displayFareInfo() { // method untuk menampilkan informasi tarif kereta
        System.out.println("Tarif tetap per penumpang: Rp " + FIXED_FARE); // mencetak tarif per orang
        System.out.println("Total tarif perjalanan kereta: Rp " + calculateFare()); // mencetak total tarif
    }
    
    // override method calculateFare untuk menghitung total tarif perjalanan lereta
    @Override
    public int calculateFare() {
        return currentPassengers * FIXED_FARE;
    }
}
