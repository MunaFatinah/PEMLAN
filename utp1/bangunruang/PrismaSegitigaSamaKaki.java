package utp.shapes;

public class PrismaSegitigaSamaKaki extends BangunRuang {
    private double alas;
    private double kaki;
    private double tinggiSegitiga;

    public PrismaSegitigaSamaKaki(int alas, int kaki, int tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        this.tinggiSegitiga = Math.sqrt(Math.pow(kaki, 2) - Math.pow(alas/2, 2));
        setTinggi(tinggi);
        setNama("Prisma Segitiga Sama Kaki");
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getAlas() {
        return this.alas;
    }

    public void setKaki(double kaki) {
        this.kaki = kaki;
    }

    public double getKaki() {
        return this.kaki;
    }

    public double getTinggiSegitiga() {
        return this.tinggiSegitiga;
    }

    @Override
    public double getLuasPermukaan() {
        double luasAlas = 0.5 * alas * tinggiSegitiga;
        double kelilingAlas = 2 * kaki + alas;
        return 2 * luasAlas + kelilingAlas * getTinggi();
    }

    @Override
    public double getVolume() {
        double luasAlas = 0.5 * alas * tinggiSegitiga;
        return luasAlas * getTinggi();
    }
    
    @Override
    public void printInfo() {
        System.out.println("Nama         : " + getNama());
        System.out.println("Alas         : " + alas);
        System.out.println("Kaki         : " + kaki);
        System.out.println("Tinggi       : " + getTinggi());
        System.out.println("Luas Permukaan : " + getLuasPermukaan());
        System.out.println("Volume       : " + getVolume());
    }
}