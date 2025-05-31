package uap.mains; // package untuk mains

import java.util.Scanner; // untuk membaca input dari user
import uap.models.Torus; // import kelas Torus
import uap.models.Sphere; // import kelas Sphere

public class KalkulatorPabrik { // kelas main bernama KalkulatorPabrik 
    public static void main(String[] args) { // psvm
        Scanner rawr = new Scanner(System.in); // scanner untuk input user

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan"); // judul program sesuai contoh output
        System.out.println("MUNA FATINAH ATIQOH"); // nama saya
        System.out.println("245150707111033"); // nim saya
        System.out.println("=============================================");

        // input dan cetak data donat dengan lubang 
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double majorRadius = rawr.nextDouble(); // input jari-jari besar atau Radius
        System.out.print("Isikan radius   : ");
        double minorRadius = rawr.nextDouble(); // input jari-jari kecil atau radius
        System.out.println("=============================================");
        Torus torus = new Torus(majorRadius, minorRadius); // membuat objek torus
        torus.printInfo(); // mencetak info
        System.out.println("=============================================");

        // input dan cetak data donat tanpa lubang 
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = rawr.nextDouble(); // input jari-jari bola
        System.out.println("=============================================");
        Sphere sphere = new Sphere(radius); // membuat objek bola
        sphere.printInfo(); // mencetak informasi bola
        System.out.println("=============================================");

        rawr.close(); // mentutup scanner
    }
}
