package utp.shapes;

public class Tabung extends BangunRuang {
    private double radius;
    private final double PI = 22.0/7.0; 

    public Tabung(int radius, int tinggi) {
        this.radius = radius;
        setTinggi(tinggi);
        setNama("Tabung");
    }

    @Override
    public double getLuasPermukaan() {
        double luasAlas = PI * radius * radius;
        double keliling = 2 * PI * radius;
        return 2 * luasAlas + keliling * getTinggi();
    }

    @Override
    public double getVolume() {
        double luasAlas = PI * radius * radius;
        return luasAlas * getTinggi();
    }

    @Override
    public void printInfo() {
        System.out.println("Nama         : " + getNama());
        System.out.println("Radius       : " + radius);
        System.out.println("Tinggi       : " + getTinggi());
        System.out.println("Luas Permukaan : " + getLuasPermukaan());
        System.out.println("Volume       : " + getVolume());
    }
}