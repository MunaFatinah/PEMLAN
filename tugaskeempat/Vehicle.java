package praktic.inheritance.transportation; // package 

// semua kelas kendaraan, variabel dalam kelas menggunakan protected karena agar bisa diakses langsung oleh subclass yang lain
public class Vehicle { // kelas dinamai Vehicle
    protected String name; //  variabel nama kendaraan
    protected int capacity; // kapasitas kendaraan
    protected int currentPassengers; // jumlah penumpang yang sedang berada di dalam kendaraan 
    protected String route; // rute perjalanan kendaraan 
    
    // konstruktor untuk inisialisasi objek kendaraan 
    public Vehicle(String name, int capacity, String route) {
        this.name = name; // memanggil nama kendaraan
        this.capacity = capacity; // memanggil kapasitas
        this.route = route; // memanggil rute 
        this.currentPassengers = 0; // currentPassangers dimulai dengan 0 penumpang
    }
    
    // method untuk memulai perjalanan kendaraaan
    public void startJourney() { // berupa public dan dinamai dengan startJourney
        System.out.println(name + " memulai perjalanan di " + route); // mencetak nama kendaraan dan memulai perjalanan di rute tertentu
    }
    
    // method untuk mengakhiri perjalanan kendaraan
    public void endJourney() { // berupa public dan dinamai dengan endJourney
        System.out.println(name + " mencapai tujuan akhir dan berhenti"); // mencetak nama kendaraan dan mencapai tujuan akhir
    }
    
    // method untuk menaikkan penumpang ke dalam kendaraan 
    public void boardPassengers(int count) { // berupa public dan dinamai dengan boardPassangers
        if (currentPassengers + count <= capacity) { // apabila total penumpang saat ini dan penumpang tambahan kurang dari sama dengan kapasitas kendaraan
            currentPassengers += count; // maka penumpang saat ini akan ditambahkan dengan penumpang tambahan
            System.out.println(count + " penumpang naik ke dalam " + name); // mencetak berapa penumpang tambahan yang masuk ke dalam kendaraan
        } else {
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + count + " penumpang"); // jika kapasitas kendaraan penuh, akan mencetak tidak dapat menaikkan penumpang tambahan ke kendaraan
        }
    
    }
    
    // method untuk menurunkan penumpang dari kendaraan
    public void disembarkPassengers(int count) { // berupa public dan dinamai dengan disembarkPassengers
        if (count > currentPassengers) { // untuk mengecek apakah penumpang yang turun tidak lebih dari penumpang saat ini
            System.out.println("Tidak ada cukup penumpang untuk turun"); // jika iya, maka akan mencetak tidak ada cukup penumpang unntuk turun
        } else {
            currentPassengers -= count; // jika penumpang ada yang turun, maka jumlah penumpang saat ini akan berkurang 
            System.out.println(count + " penumpang turun dari " + name); // mencetak tulisan sejumlah penumpang turun dari kendaraan
        }
    }
    
    // method untuk menghitung tarif perjalanan dan akan di-override oleh subclass
    public int calculateFare() { // public int dan dinamai dengan calculateFare
        return 0; // tarif default untuk kendaraan umum
    }
    
    // getter untuk mendapatkan jumlah penumpang saat ini
    public int getCurrentPassengers() { // dinamai dengan getCurrentPassengers
        return currentPassengers; // mengembalikan nilai currentPassengers
    }
}