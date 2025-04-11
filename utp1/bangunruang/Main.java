package utp.mains;

import java.util.Scanner;
import utp.shapes.PrismaSegitigaSamaKaki;
import utp.shapes.LimasPersegi;
import utp.shapes.Tabung;

public class Main {
    public static void main(String[] args) {
        Scanner omaga = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("MUNA FATINAH ATIQOH");
        System.out.println("245150707111033");
        System.out.println("=============================================");

        System.out.println("Prisma Segitiga Sama Kaki");
        System.out.println("=============================================");
        System.out.print("Isikan alas     : ");
        int alas = omaga.nextInt();
        System.out.print("Isikan kaki     : ");
        int kaki = omaga.nextInt();
        System.out.print("Isikan tinggi   : ");
        int tinggiPrisma = omaga.nextInt();
        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
        System.out.println("=============================================");
        System.out.println("Nama            : " + prisma.getNama());
        System.out.printf("Luas permukaan  : %.2f\n", prisma.getLuasPermukaan());
        System.out.printf("Volume          : %.2f\n", prisma.getVolume());
        
        System.out.println("=============================================");
        System.out.println("Limas Persegi");
        System.out.println("=============================================");
        System.out.print("Isikan sisi     : ");
        int sisi = omaga.nextInt();
        System.out.print("Isikan tinggi   : ");
        int tinggiLimas = omaga.nextInt();
        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        System.out.println("=============================================");
        System.out.println("Nama            : " + limas.getNama());
        System.out.printf("Luas permukaan  : %.2f\n", limas.getLuasPermukaan());
        System.out.printf("Volume          : %.2f\n", limas.getVolume());

        System.out.println("=============================================");
        System.out.println("Tabung");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        int radius = omaga.nextInt();
        System.out.print("Isikan tinggi   : ");
        int tinggiTabung = omaga.nextInt();
        Tabung tabung = new Tabung(radius, tinggiTabung);
        System.out.println("=============================================");
        System.out.println("Nama            : " + tabung.getNama());
        System.out.printf("Luas permukaan  : %.2f\n", tabung.getLuasPermukaan());
        System.out.printf("Volume          : %.2f\n", tabung.getVolume());
        System.out.println("=============================================");

        omaga.close();
    }
}
