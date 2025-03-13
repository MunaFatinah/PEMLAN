package praktic.geometry.mains;
import praktic.geometry.shapes.*;
import java.util.*;


public class Main {

    static String perwarnaTulisan = "\u001B[32m";

    public static void printGaris() {
        System.out.println( perwarnaTulisan + "============================================");
        
    } 

    public static void main(String[] args) {
       Scanner pui = new Scanner (System.in); 

       printGaris();
       System.out.print("Nama: ");
       String nama = pui.nextLine(); 

       System.out.print("NIM: ");
       String NIM = pui.nextLine(); 
       printGaris();

       System.out.println("Circle");
       printGaris();

       System.out.print("Isikan ID: ");
       int id = pui.nextInt(); 

       System.out.print("Isikan Radius: ");
       double radius = pui.nextDouble(); 

       printGaris();

       Circle lingkaran = new Circle(); 
       lingkaran.setId(id);
       lingkaran.setRadius(radius);

       lingkaran.printDeskripsi();
       printGaris();

       pui.close();

    }
}           
