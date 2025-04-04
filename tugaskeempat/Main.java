package praktic.inheritance.mains; // package 

import praktic.inheritance.transportation.*; // mengimpor semua kelas dari package transportation

public class Main {
    public static void main(String[] args) {
        // membuat objek dari setiap subclass vehicle 
        Bus bus = new Bus("Bus TransJakarta", 50, "Terminal A - Terminal B"); // membuat objek bus dengan penumpang dan rute nya
        Train train = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat"); // membuat objek kereta dengan kapasitas penumpang dan rute nya 
        Taxi taxi = new Taxi("Taksi BlueBird", 4, "Bandara - Hotel"); // membuat objek taksi dengan kapasitas dan rute nya

        // simulasi perjalanan bus
        bus.startJourney(); // memulai perjalanan bus
        bus.boardPassengers(30); // menaikkan 30 penumpang ke dalam bus
        bus.boardPassengers(20); // menaikkan 20 penumpang lagi
        System.out.println("Total penumpang: " + bus.getCurrentPassengers()); // mencetak jumlah penumpang
        bus.displayFareInfo(); // mencetak informasi tarif bus
        bus.endJourney(); // mengakhiri perjalanan bus
        bus.disembarkPassengers(50); // menurunkan 50 penumpang

        // jeda
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("");
        
        // simulasi perjalanan kereta 
        train.startJourney(); // memulai perjalanan kereta 
        train.boardPassengers(150); // menaikkan penumpang sebanyak 150 
        System.out.println("Total penumpang: " + train.getCurrentPassengers()); // mencetak penumpang saat ini
        train.displayFareInfo(); // mencetak info tarif
        train.endJourney(); // mengakhiri perjalanan kereta 
        train.disembarkPassengers(150); // menurunkan 150 penumpang
        
        // jeda
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("");
        
        // simulasi perjalanan taksi
        taxi.startJourney(); // memulai perjalanan taksi
        taxi.boardPassengers(3); // menaikkan 3 penumpang
        System.out.println("Total penumpang: " + taxi.getCurrentPassengers()); // mencetak total penumpang saat ini
        taxi.displayFareInfo(); // mencetak tarif taksi
        taxi.endJourney(); // mengakhiri perjalanan taksi
        taxi.disembarkPassengers(3); // menurunkan penumpang 

        // jeda 
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("");
        
        // simulasi bus kedua dengan kondisi berbeda
        bus.startJourney(); // bus memulai perjalanan
        bus.boardPassengers(30); // menaikkan 30 penumpang 
        bus.boardPassengers(100); // menaikkan 100 penumpang, akan muncul peringatan kapasitas penuh
        System.out.println("Total penumpang: " + bus.getCurrentPassengers()); // total penumpang saat ini
        bus.displayFareInfo(); // menampilkan informasi tarif bus 
        bus.endJourney(); // mengakhiri perjalanan
        bus.disembarkPassengers(30); // menurunkan 30 penumpang
        bus.disembarkPassengers(50); // menurunkan 50 penumpang, akan muncul tulisan tidak cukup penumpang untuk turun
        
        // jeda
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("");
        
        // simulasi kereta dengan kondisi berbeda
        train.startJourney(); // memulai perjalanan kereta
        train.boardPassengers(150); // menaikkan 150 penumpang
        train.boardPassengers(300); // menaikkan 300 penumpang, akan muncul tulisan kapasitas penuh
        System.out.println("Total penumpang: " + train.getCurrentPassengers()); // mencetak penumpang saat ini
        train.displayFareInfo(); // mencetak info tarif kereta
        train.endJourney(); // mengakhiri perjalanan
        train.disembarkPassengers(150); // menurunkan 150 penumpang
        train.disembarkPassengers(200); // menurunkan 200 penumpang, akan muncul tulisan tidak cukup penumpang untuk turun
        
        // jeda
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("");
        
        // simulasi perjalanan taksi dengan kondisi berbeda
        taxi.startJourney(); // memulai perjalanan taksi
        taxi.boardPassengers(3); // menaikkan 3 penumpang
        taxi.boardPassengers(10); // menaikkan 10 penumpang, akan muncul tulisan kapasitas penuh
        System.out.println("Total penumpang: " + taxi.getCurrentPassengers()); // mencetak penumpang saat ini
        taxi.displayFareInfo(); // menampilkan informasi tarif taksi
        taxi.endJourney(); // mengakhiri perjalanan
        taxi.disembarkPassengers(3); // menurunkan 3 penumpang
        taxi.disembarkPassengers(5); // menurunkan 5 penumpang, akan muncul tulisan tidak cukup penumpang untuk turun

        System.out.println(" "); // space kosong
    }
}
