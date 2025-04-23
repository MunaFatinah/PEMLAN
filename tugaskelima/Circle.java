package praktic.geometry.shapes; // package untuk bentuk tertentu dan spesifik

import praktic.geometry.bases.CircularShape; // mengimpor kelas CircularShape dari package bases
import praktic.geometry.interfaces.TwoDimensional; // mengimpor kelas TwoDimensional dari package interfaces

public class Circle extends CircularShape implements TwoDimensional { // representasi lingkaran 2D, turunan dari CircularShape dan mengimplementasikan TwoDimensional
    
    public Circle() { // default konstuktor
        setName("Circle"); // mengatur nama ke "Circle"
    }
    
    public Circle(double radius) { // konstruktor dengan parameter radius bertipe data double
        this(); // memanggil constructor default dari class Circle
        setRadius(radius); // mengatur nilai radius menggunakan setter
    }
    
    @Override // meng-override
    public double getArea() { // mengimplementasikan method getArea() dari interface TwoDimensional
        return (PI_NUMERATOR * getRadius() * getRadius()) / PI_DENOMINATOR; // menghitung dan mengembalikan nilai luas lingkaran menggunakan rumus pi*r kuadrat
    }
    
    @Override // meng-override
    public double getPerimeter() { // mengimplementasikan method getPerimeter() dari interface TwoDimensiona
        return (2 * PI_NUMERATOR * getRadius()) / PI_DENOMINATOR; // menghitung dan mengembalikan nilai keliling lingkaran menggunakan rumus 2 pi r
    }
    
    @Override // meng-override
    public void printInfo() { // mencetak informasi lingkaran
        System.out.println("Name            : " + getName()); // menampilkan nama bentuk
        System.out.println("Area            : " + getArea()); // menampilkan luas
        System.out.println("Perimeter       : " + getPerimeter()); // menampilkan keliling
    }
}