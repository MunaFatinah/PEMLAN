package utp.lelang;

import java.text.NumberFormat;
import java.util.Locale;

public class Seni extends BarangLelang {
    private String seniman;
    private static final NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));

    public Seni(String namaBarang, double hargaAwal, String seniman) {
        super(namaBarang, hargaAwal);
        this.seniman = seniman;
    }

    @Override
    public void mulaiLelang() {
        statusLelang = true;
        System.out.println("Lelang untuk " + namaBarang + " telah dimulai dengan harga awal Rp" + formatter.format(hargaAwal));
        System.out.println("Karya seni ini dibuat oleh: " + seniman);
    }
}
