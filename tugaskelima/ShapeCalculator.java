package praktic.geometry.mains; // package untuk menjalankan program utama

import praktic.geometry.shapes.*; // mengimpor semua kelas dari package shapes 
import praktic.geometry.interfaces.*; // mengimpor semua interface dari package interfaces
import java.util.Scanner; // mengimpor kelas Scanner untuk input dari pengguna

public class ShapeCalculator { // kelas utama 
    public static void main(String[] args) { // method main sebagai awal program java
        Scanner wow = new Scanner(System.in); // membuat objek scanner untuk membaca input pengguna

        System.out.println("======================================"); // mencetak garis pemisah
        System.out.println("Shape Calculator"); // judul program
        System.out.println("MUNA FATINAH ATIQOH"); // mencetak nama saya
        System.out.println("245150707111033"); // mencetak NIM saya
        System.out.println("======================================"); // mencetak garis pemisah

        // Bagian Circle
        System.out.println("2D Circle"); // judul bagian lingkaran
        System.out.println("======================================"); // garis pemisah
        System.out.print("Enter radius    : "); // meminta input radius
        double radius = wow.nextDouble(); // membaca input radius dari pengguna
        Circle circle = new Circle(radius); // membuat objek Circle dengan radius
        System.out.println("======================================"); // garis pemisah
        circle.printInfo(); // mencetak informasi tentang Circle

        // Bagian Square
        System.out.println("======================================"); // garis pemisah
        System.out.println("2D Square"); // judul bagian persegi
        System.out.println("======================================"); // garis pemisah
        System.out.print("Enter side      : "); // meminta input panjang sisi
        double side = wow.nextDouble(); // membaca input sisi dari pengguna
        Square square = new Square(side); // membuat objek Square dengan panjang sisi
        System.out.println("======================================"); // garis pemisah
        square.printInfo(); // mencetak informasi tentang Square

        // Bagian Cube
        System.out.println("======================================"); // garis pemisah
        System.out.println("3D Weightable Cube"); // judul bagian kubus
        System.out.println("======================================"); // garis pemisah
        System.out.print("Enter edge      : "); // meminta input panjang sisi kubus
        double edge = wow.nextDouble(); // membaca input sisi kubus dari pengguna
        System.out.print("Enter mass      : "); // meminta input massa kubus
        double mass = wow.nextDouble(); // membaca input massa dari pengguna
        Cube cube = new Cube(edge, mass); // membuat objek Cube dengan sisi dan massa
        System.out.println("======================================"); // garis pemisah
        cube.printInfo(); // mencetak informasi tentang Cube

        // Bagian Sphere
        System.out.println("======================================"); // garis pemisah
        System.out.println("3D Weightable Sphere"); // judul bagian bola
        System.out.println("======================================"); // garis pemisah
        System.out.print("Enter radius    : "); // meminta input radius bola
        double sphereRadius = wow.nextDouble(); // membaca input radius bola
        System.out.print("Enter mass      : "); // meminta input massa bola
        double sphereMass = wow.nextDouble(); // membaca input massa bola
        System.out.println("======================================"); // garis pemisah
        Sphere sphere = new Sphere(sphereRadius, sphereMass); // membuat objek Sphere dengan radius dan massa
        sphere.printInfo(); // mencetak informasi tentang Sphere
        System.out.println("======================================"); // garis akhir pemisah

        wow.close(); // menutup scanner
    }
}
