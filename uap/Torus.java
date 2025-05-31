package uap.models; // package model

import uap.bases.Shape; // import kelas Shape untuk superclass
import uap.interfaces.MassConverter; // import interface MassConverter untuk konversi massa
import uap.interfaces.ShippingCostCalculator; // import interface ShippingCostCalculator untuk menghitung biaya kirim

public class Torus extends Shape implements MassConverter, ShippingCostCalculator { // extend kelas Shape dan implement 
    private double majorRadius; // jari-jari besar 
    private double minorRadius; // jari-jari kecil 

    public Torus() {} // konstruktor default

    public Torus(double majorRadius, double minorRadius) { // konstruktor dengan parameter majorRadius dan minorRadius
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getVolume() { // method untuk menghitung volume
        return 2 * Math.pow(22.0 / 7, 2) * majorRadius * minorRadius * minorRadius;
    }

    public double getSurfaceArea() { // method untuk menghitung luas permukaan 
        return 4 * Math.pow(22.0 / 7, 2) * majorRadius * minorRadius;
    }

    public double getMass() { // method untuk menghitung massa torus
        return getSurfaceArea() * 0.5 * 8;
    }

    @Override
    public double gramToKilogram() { // method untuk mengonversi gram ke kilogram
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() { // method untuk menghitung biaya kirim
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG; // dibulatkan ke atas dan dikalikan harga per kg
    }

    @Override
    public void printInfo() { // mencetak informasi lengkap mengenai torus
        System.out.printf("Volume          : %.2f\n", getVolume()); // mencetak volume torus
        System.out.printf("Luas permukaan  : %.2f\n", getSurfaceArea()); // mencetak luas permukaan torus
        System.out.printf("Massa           : %.2f\n", getMass()); // mencetak massa torus dalam gram
        System.out.printf("Massa dalam kg  : %.2f\n", gramToKilogram()); // mencetak massa torus dalam kilogram
        System.out.printf("Biaya kirim     : Rp%.0f\n", calculateCost()); // mencetak biaya pengiriman torus
    }
}
