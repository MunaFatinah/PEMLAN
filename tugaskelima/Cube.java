package praktic.geometry.shapes; // package untuk bentuk spesifik 

import praktic.geometry.bases.Shape; // mengimpor kelas Shape sebagai kelas induk
import praktic.geometry.interfaces.ThreeDimensional; // nengimpor interface ThreeDimensional untuk bentuk 3D
import praktic.geometry.interfaces.Weightable; // mengimpor interface Weightable untuk menghitung berat


public class Cube extends Shape implements ThreeDimensional, Weightable { // merupakan representasi kelas kubus, turunan dari Shape, dan mengimplementasikan ThreeDimensional serta Weightable
    private double edge; // menyimpan panjang sisi kubus dengan tipe data double dan modifier private
    private double mass; // menyimpan massa kubus dengan tipe data double dan modifier private
    
    public Cube() { // default konstruktor
        setName("Cube"); // mengatur nama shape menjadi "Cube"
    }
    
    public Cube(double edge, double mass) { // konstruktor dengan parameter panjang sisi dan massa
        this(); // memanggil konstruktor default untuk mengatur nama
        this.edge = edge; // mengatur panjang sisi dengan nilai parameter
        this.mass = mass; // mengatur massa dengan nilai parameter
    }
    
    @Override // meng-override
    public double getSurfaceArea() { // method untuk menghitung luas permukaan kubus dengan tipe data double
        return 6 * edge * edge; // mengembalikan nilai luas permukaan dengan rumus 6*sisi*sisi
    }
    
    @Override // meng-override
    public double getVolume() { // method untuk menghitunng volume kubus dengan tipe data double
        return edge * edge * edge; // mengembalikan nilai volume kubus dengan rumus sisi*sisi*sisi
    }
    
    @Override // meng-override
    public double getWeight() { // method untuk menghitung berat kubus dengan tipe data double
        return mass * g; // mengembalikan nilai berat kubus dengan rumus massa*gravitasi
    }
    
    @Override // meng-override
    public void printInfo() { // mencetak informasi
        System.out.println("Name            : " + getName()); // mencetak nama
        System.out.println("Surface area    : " + getSurfaceArea()); // mencetak luas permukaan
        System.out.println("Volume          : " + getVolume()); // mencetak volume
        System.out.println("Weight          : " + getWeight()); // mencetak berat
    }
}
