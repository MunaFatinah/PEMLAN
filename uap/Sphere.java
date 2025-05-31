package uap.models; // package model 

import uap.bases.Shape; // import kelas shape dan untuk superclass
import uap.interfaces.MassConverter; // import kelas konversi massa untuk implement
import uap.interfaces.ShippingCostCalculator; // import kelas shippingcostcalculator serta implement biaya kirim 

public class Sphere extends Shape implements MassConverter, ShippingCostCalculator { // extend dan implement kelas-kelas yang sudah diimpor
    private double radius; // jari-jari bola

    public Sphere() { // konstruktor default

    } 

    public Sphere(double radius) { // kosntruktor dengan parameter radius
        this.radius = radius;
    }

    public double getVolume() { // method untuk menghitung volume bola
        return (4.0 / 3.0) * (22.0 / 7) * radius * radius * radius;
    }

    public double getSurfaceArea() { // method untuk menghitung luas permukaan bola
        return 4 * (22.0 / 7) * radius * radius;
    }

    public double getMass() { // untuk menghitung massa 
        return getSurfaceArea() * 0.5 * 8;
    }

    @Override
    public double gramToKilogram() { // untuk mengonversi gram ke kilogram
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() { // biaya kirim dibulatkan ke atas
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    @Override
    public void printInfo() { // mencetak informasi mengenai sphere
        System.out.printf("Volume          : %.2f\n", getVolume()); // menccetak volume sphere
        System.out.printf("Luas permukaan  : %.2f\n", getSurfaceArea()); // mencetak luas permukaan sphere
        System.out.printf("Massa           : %.2f\n", getMass()); // mencetak massa sphere
        System.out.printf("Massa dalam kg  : %.2f\n", gramToKilogram()); // mencetak massa dalam kilogram 
        System.out.printf("Biaya kirim     : Rp%.0f\n", calculateCost()); // mencetak biaya kirim
    }
}
