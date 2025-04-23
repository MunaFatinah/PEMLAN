package praktic.geometry.shapes; // package untuk bentuk spesifik

import praktic.geometry.bases.Shape; // mengimpor kelas Shape sebagai superclass
import praktic.geometry.interfaces.TwoDimensional; // mengimpor interface TwoDimensional untuk bentuk 2D


public class Square extends Shape implements TwoDimensional { // merepresentasi kelas persegi, turunan dari Shape, dan mengimplementasikan TwoDimensional
    private double side; // menyimpan panjang sisi persegi dengan tipe data double dan modifier private

    public Square() { // default konstruktor
        setName("Square"); // mengatur nama shape menjadi "Square"
    }

    public Square(double side) { // konstruktor dengan parameter panjang sisi
        this(); // memanggil konstruktor default untuk mengatur nama
        this.side = side; // mengatur panjang sisi dengan nilai parameter
    }

    @Override // meng-override
    public double getArea() { // method untuk menghitung luas persegi dan bertipe data double
        return side * side; // mengembalikan nilai luas persegi dengan rumus sisi*sisi
    }

    @Override // meng-override
    public double getPerimeter() { // method untuk menghitung keliling persegi dan bertipe data double
        return 4 * side; // mengembalikan nilai keliling persegi dengan rumus 4*sisi
    }

    @Override // meng-override
    public void printInfo() { // mencetak informasi 
        System.out.println("Name            : " + getName()); // mencetak nama shape
        System.out.println("Area            : " + getArea()); // mencetak luas
        System.out.println("Perimeter       : " + getPerimeter()); // mencetak keliling
    }
}
