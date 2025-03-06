package tugaskedua; // kelas BankAccount ada di dalam package tugaskedua

class BankAccount { // kelas untuk akun bank
    public String norek; // atribut bank yakni nomor rekening
    public String namapemilik; // atribut nama pemilik 
    public double saldo; // atribut saldo
    public String jenisakun; // atribut jenis akun

    public BankAccount (String norek, String namapemilik, double saldo, String jenisakun) { // konstruktor dengan saldo awal yang sudah ditentukan
        this.norek = norek; // memanggil norek dengan this, yakni dari parameter ke atribut
        this.namapemilik = namapemilik; // memanggil nama pemilik dengan this
        this.saldo = saldo; // menyimpan saldo dari parameter ke atribut
        this.jenisakun = jenisakun; //  menyimpan jenis akun dengan this dari parameter ke atribut
    }

    public BankAccount (String norek, String namapemilik, String jenisakun) { // konstruktor dengan saldo berdasarkan jenis akun
        this.norek = norek; //memanggil norek dari parameter ke atribut
        this.namapemilik = namapemilik; //  menyimpan namapemilik dari parameter ke atribut
        this.jenisakun = jenisakun; // menyimpan jenisakun dari parameter ke atribut
        if (jenisakun.equalsIgnoreCase("Tabungan")) {
            this.saldo = 100.0; // saldo default untuk Tabungan
        } else {
            this.saldo = 500.0; // saldo default untuk Giro
        }
    }

    // method untuk menampilkan informasi rekening
    public void displayinfo() { // nama method nya adalah displayinfo
        System.out.println("No Rekening: " + norek); // mencetak norek
        System.out.println("Nama Pemilik: " + namapemilik); // menampilkan nama pemilik
        System.out.println("Saldo: " + saldo); // menampilkan saldo
        System.out.println("Jenis Akun: " + jenisakun); // menampilkan jenis akun
        System.out.println(); // spasi untuk jeda dan kerapian
    }

    // method untuk deposit atau tambah saldo
    public void deposit(double nominal) { // method diberi nama deposit 
        if (nominal <= 0) { // untuk mengecek apakah nominal lebih dari atau sama dengan nol
            System.out.println("Nominal deposit harus lebih dari 0!"); // pesan apabila nominal kuranh dari 0
        } else {
            saldo += nominal; // menambahkan nominal ke saldo yang sudah ada
            System.out.println("Berhasil deposit Rp " + nominal + " Saldo sekarang: Rp " + saldo); // mencetak pesan dan saldo terbaru
        }
    }

    // method untuk withdraw uang dari rekening
    public void withdraw(double nominal) {  // method diberi nama withdraw
        if (nominal <= 0) { // untuk mengecek apakah nominal kurang dari atau sama dengan nol
            System.out.println("Nominal penarikan harus lebih dari 0!"); // mencetak pesan apabila penarikan kurang dari nol
        } else if (saldo < nominal) { // untuk mengecek apanila saldo kurang dari nominal
            System.out.println("Saldo tidak mencukupi!"); // mencetak pesan apabila saldo tidak mencukuupi
        } else {
            saldo -= nominal; // untuk mengurangi saldo dengan nominal yang ditarik
            System.out.println("Berhasil tarik tunai Rp " + nominal + " Saldo sekarang Rp " + saldo); // untuk menampilkan pesan berhasil dan saldo terbaru
        }
    }

    // Tmethod untuk transfer uang ke rekening lain
    public void transfer(BankAccount tujuan, double nominal) { // method diberi nama transfer
        if (nominal <= 0) { // untuk mengecek apakah nominal kurang dari sama dengan nol
            System.out.println("Nominal transfer harus lebih dari 0!"); // mencetak pesan apabila nominal kurang dari nol
        } else if (saldo < nominal) { // untuk mengecek apakah saldo kurang dari nominal
            System.out.println("Saldo tidak mencukupi untuk transfer!"); // mencetak pesan apabila saldo tidak cukup untuk transfer
        } else {
            saldo -= nominal; // mengurangi saldo dengan jumlah nominal yang sudah ditransfer ke rekening lain
            tujuan.saldo += nominal; // menambahkan nominal ke saldo rekening tujuan
            System.out.println("Berhasil transfer " + nominal + " ke " + tujuan.namapemilik); // menampilkan pesan berhasil 
            System.out.println("Saldo sekarang Rp " + saldo); // cetak saldo terbaru
        }
    }
}
