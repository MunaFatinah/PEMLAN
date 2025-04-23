package praktic.geometry.bases; // merupakan package yang diberi nama bases

public abstract class CircularShape extends Shape { // kelas abstrak sebagai dasar bentuk melingkar seperti lingkaran
    private double radius; // untuk menyimpan jari-jari dan dibuat dengan modifier private
    protected static final int PI_NUMERATOR = 22; // merupakan pembilang konstanta pi dan bersifat final
    protected static final int PI_DENOMINATOR = 7; // merupakan penyebut konstanta pi dan bersifat final

    public CircularShape() {} // default constructor

    public void setRadius(double inputRadius) { // merupakan setter untuk mengatur nilai radius 
        this.radius = inputRadius; // mengatur nilai radius dari input
    }

    public double getRadius() { // untuk mendapatkan nilai radius 
        return radius; // mengembalikan nilai radius
    }
}
