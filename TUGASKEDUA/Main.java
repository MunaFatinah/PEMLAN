package tugaskedua;

import java.net.Socket;

public class Main {
        public static void main(String[] args) {
            BankAccount akun1 = new BankAccount ("897896534", "Kazuha", 200.0, "Tabungan");
            BankAccount akun2 = new BankAccount("251678021", "Ijat", "Giro");
            
            System.out.println("Informasi Akun 1");
            akun1.displayinfo();

            System.out.println("Informasi Akun 2");
            akun2.displayinfo();
            
            System.out.println("Transaksi Akun 1");
            akun1.deposit(150.0);

            System.out.println();

            System.out.println("Transaksi Akun 2");
            akun2.deposit(400.0);

            System.out.println();

            System.out.println("Penarikan Uang Akun 1");
            akun1.withdraw(400.0);

            System.out.println();

            System.out.println("Penarikan Uang Akun 2");
            akun2.withdraw(200.0);
            
            System.out.println();

            System.out.println("Transfer dari Kazuha ke Ijat");
            akun1.transfer(akun2, 100.0);

            System.out.println();

            System.out.println("Transfer dari Ijat ke Kazuha");
            akun2.transfer(akun1, 200.0);
            System.out.println();
    
            // Menampilkan info setelah transaksi
            System.out.println("Informasi Akhir Akun 1");
            akun1.displayinfo();

            System.out.println("Informasi Akun 2");
            akun2.displayinfo();
        }
}
