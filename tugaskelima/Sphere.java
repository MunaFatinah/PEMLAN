package praktic.geometry.shapes; // package untuk bentuk spesifik

import praktic.geometry.bases.CircularShape; // mengimpor kelas CircularShape dari package bases sebagai superclass
import praktic.geometry.interfaces.ThreeDimensional; // mengimpor interface ThreeDimensional untuk bentuk 3D
import praktic.geometry.interfaces.Weightable; // mengimpor interface Weightable untuk menghitung berat

public class Sphere extends CircularShape implements ThreeDimensional, Weightable { // merupakan representasi kelas Sphere), turunan dari CircularShape, dan mengimplementasikan ThreeDimensional serta Weightable
    private double mass; // menyimpan massa bola dengan tipe data double dan modifier private
    
    public Sphere() { // default konstruktor
        setName("Sphere"); // mengatur nama shape menjadi "Sphere"
    }
    
    public Sphere(double radius, double mass) { // // konstruktor dengan parameter jari-jari dan massa serta tipe data double
        this(); // memanggil konstruktor default untuk mengatur nama
        setRadius(radius); // mengatur nilai radius menggunakan setter dari superclass
        this.mass = mass; // mengatur massa dengan nilai parameter
    }
    
    @Override // meng-override
    public double getSurfaceArea() { // // method untuk menghitung luas permukaan bola dengan tipe data double
        return (4 * PI_NUMERATOR * getRadius() * getRadius()) / PI_DENOMINATOR; // // mengembalikan nilai luas permukaan dengan rumus 4*pi*r*r
    }
    
    @Override // meng-override 
    public double getVolume() { // method untuk menghitung volume bola dengan tipe data double
        return (4 * PI_NUMERATOR * getRadius() * getRadius() * getRadius()) / (3 * PI_DENOMINATOR); // mengembalikan nilai volume dengan rumus 4/3*pi*r*r*r
    }
    
    @Override // meng-override
    public double getWeight() { // method untuk menghitung berat bola dengan tipe data double
        return mass * g; // mengembalikan nilai berat bola dengan rumus massa*gravitasi
    }
    
    @Override // meng-override
    public void printInfo() { // mencetak informasi
        System.out.println("Name            : " + getName()); // mencetak nama
        System.out.println("Surface area    : " + getSurfaceArea()); // mencetak luas permukaan
        System.out.println("Volume          : " + getVolume()); // mencetak volume
        System.out.println("Weight          : " + getWeight()); // mencetak berat
    
    }
}