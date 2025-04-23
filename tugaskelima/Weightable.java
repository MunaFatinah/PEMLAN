package praktic.geometry.interfaces; // package untuk interface 

public interface Weightable { // kelas interface untuk objek yang memiliki berat yakni massa*gravitasi
    double g = 9.8; // deklarasi nilai gravitasi dan beripe data double
    double getWeight(); // method untuk menghitung berat dan bertipe data double
}
