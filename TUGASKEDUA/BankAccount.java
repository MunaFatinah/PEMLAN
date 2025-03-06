package tugaskedua; 

class BankAccount {
    public String norek;
    public String namapemilik;
    public double saldo;
    public String jenisakun; 

    public BankAccount (String norek, String namapemilik, double saldo, String jenisakun) {
        this.norek = norek;
        this.namapemilik = namapemilik;
        this.saldo = saldo;
        this.jenisakun = jenisakun;
    }

    public BankAccount (String norek, String namapemilik, String jenisakun) {
        this.norek = norek;
        this.namapemilik = namapemilik;
        this.jenisakun = jenisakun;
        if (jenisakun.equalsIgnoreCase("Tabungan")) {
            this.saldo = 100.0; 
        } else {
            this.saldo = 500.0;
        }
    }

    // Menampilkan informasi rekening
    public void displayinfo() {
        System.out.println("No Rekening: " + norek);
        System.out.println("Nama Pemilik: " + namapemilik);
        System.out.println("Saldo: " + saldo);
        System.out.println("Jenis Akun: " + jenisakun);
        System.out.println();
    }

    // Deposit uang ke rekening
    public void deposit(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal deposit harus lebih dari 0!");
        } else {
            saldo += nominal;
            System.out.println("Berhasil deposit Rp " + nominal + " Saldo sekarang: Rp " + saldo);
        }
    }

    // Withdraw uang dari rekening
    public void withdraw(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal penarikan harus lebih dari 0!");
        } else if (saldo < nominal) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= nominal;
            System.out.println("Berhasil tarik tunai Rp " + nominal + " Saldo sekarang Rp " + saldo);
        }
    }

    // Transfer uang ke rekening lain
    public void transfer(BankAccount tujuan, double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal transfer harus lebih dari 0!");
        } else if (saldo < nominal) {
            System.out.println("Saldo tidak mencukupi untuk transfer!");
        } else {
            saldo -= nominal;
            tujuan.saldo += nominal;
            System.out.println("Berhasil transfer " + nominal + " ke " + tujuan.namapemilik);
            System.out.println("Saldo sekarang Rp " + saldo);
        }
    }
}