package utp.lelang;

import java.text.NumberFormat;
import java.util.Locale;

public class Elektronik extends BarangLelang {
    private int garansi;
    private static final NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));

    public Elektronik(String namaBarang, double hargaAwal, int garansi) {
        super(namaBarang, hargaAwal);
        this.garansi = garansi;
    }

    @Override
    public void mulaiLelang() {
        statusLelang = true;
        System.out.println("Lelang untuk " + namaBarang + " telah dimulai dengan harga awal Rp" + formatter.format(hargaAwal));
        System.out.println("Barang elektronik ini memiliki garansi: " + garansi + " tahun");
    }
}
