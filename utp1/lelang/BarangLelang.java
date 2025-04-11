package utp.lelang;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class BarangLelang {
    protected String namaBarang;
    protected double hargaAwal;
    protected double penawaranTertinggi;
    protected Peserta pemenang;
    protected boolean statusLelang;

    private static final NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));

    public BarangLelang(String namaBarang, double hargaAwal) {
        this.namaBarang = namaBarang;
        this.hargaAwal = hargaAwal;
        this.penawaranTertinggi = 0;
        this.statusLelang = false;
    }

    public abstract void mulaiLelang();

    public void terimaPenawaran(Peserta peserta, double jumlah) {
        System.out.println(peserta.getNama() + " menawar Rp" + formatter.format(jumlah));
        if (!statusLelang) {
            System.out.println("Penawaran tidak valid! Lelang sudah ditutup");
            return;
        }

        if (jumlah <= penawaranTertinggi || jumlah <= hargaAwal) {
            System.out.println("Penawaran tidak valid! penawaran harus lebih tinggi dari Rp" +
                               formatter.format(Math.max(hargaAwal, penawaranTertinggi)));
        } else if (jumlah > peserta.getSaldo()) {
            System.out.println("Penawaran tidak valid! Saldo " + peserta.getNama() + " tidak mencukupi");
        } else {
            penawaranTertinggi = jumlah;
            pemenang = peserta;
            System.out.println("Penawaran disetujui!");
        }
    }

    public void tutupLelang() {
        statusLelang = false;
        if (pemenang != null) {
            pemenang.setSaldo(pemenang.getSaldo() - penawaranTertinggi);
            System.out.println("Lelang ditutup! " + namaBarang + " terjual dengan harga Rp" +
                               formatter.format(penawaranTertinggi) + " kepada " + pemenang.getNama());
            System.out.println("Sisa saldo " + pemenang.getNama() + ": Rp" + formatter.format(pemenang.getSaldo()));
        } else {
            System.out.println("Lelang ditutup! Tidak ada pemenang.");
        }
    }
}
