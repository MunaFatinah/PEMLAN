package utp.shapes;

public class LimasPersegi extends BangunRuang {
    private double sisi;

    public LimasPersegi(int sisi, int tinggi) {
        this.sisi = sisi;
        setTinggi(tinggi);
        setNama("Limas Persegi");
    }

    @Override
    public double getLuasPermukaan() {
        double luasAlas = sisi * sisi;
        double tinggiSisi = Math.sqrt(Math.pow(getTinggi(), 2) + Math.pow(sisi/2, 2));
        double luasSisi = tinggiSisi * sisi / 2;
        
        return 4 * luasSisi + luasAlas;
    }

    @Override
    public double getVolume() {
        return (sisi * sisi * getTinggi()) / 3;
    }

    @Override
    public void printInfo() {
        System.out.println("Nama         : " + getNama());
        System.out.println("Sisi alas    : " + sisi);
        System.out.println("Tinggi       : " + getTinggi());
        System.out.println("Luas Permukaan : " + getLuasPermukaan());
        System.out.println("Volume       : " + getVolume());
    }
}