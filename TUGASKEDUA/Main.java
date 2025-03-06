package tugaskedua; // file Main berada di package tugaskedua

public class Main { // nama kelas bernama Main
        public static void main(String[] args) { // method yang selalu adda di Java
            BankAccount akun1 = new BankAccount ("897896534", "Kazuha", 200.0, "Tabungan"); // membuat akun bank dengan saldo awal serta jenis akun Tabungan
            BankAccount akun2 = new BankAccount("251678021", "Ijat", "Giro"); // membuat akun bank dengan saldo default berdasarkan jenis akun
            
            System.out.println("Informasi Akun 1"); // menampilkan informasi akun 1
            akun1.displayinfo(); // memanggil method displayinfo untuk menampilkan informasi akun 1

            System.out.println("Informasi Akun 2");  // menampilkan informasi akun 2
            akun2.displayinfo(); // // memanggil method displayinfo untuk menampilkan informasi akun 2
            
            System.out.println("Transaksi Akun 1"); // akun 1 melakukan deposit
            akun1.deposit(150.0); // akun 1 melakukan deposit sebanyak 150

            System.out.println(); // untuk spasi

            System.out.println("Transaksi Akun 2"); // akun 2 melakukan deposit
            akun2.deposit(400.0); // akun 2 melakukan deposit sebanyak 400

            System.out.println(); // untuk spasi agar lebih rapi

            System.out.println("Penarikan Uang Akun 1"); // mencetak tulisan penarikan uang akun 1
            akun1.withdraw(400.0); // akun 1 menarik uang sebanyal 400

            System.out.println(); // jeda untuk spasi

            System.out.println("Penarikan Uang Akun 2"); // mencetak akun 2 menarik uang
            akun2.withdraw(200.0); // akun 2 menarik uang sebanyal 200
            
            System.out.println(); // untuk spasi

            System.out.println("Transfer dari Kazuha ke Ijat"); // mencetak pesan bahwa kazuha melakukan transfer ke ijat
            akun1.transfer(akun2, 100.0); // Kazuha atau akun 2 transfer ke Ijat atau akun 2 sebanyak 100

            System.out.println(); // jeda untuk spasi

            System.out.println("Transfer dari Ijat ke Kazuha"); // mencetak pesan ijat ka melakukan transfer ke kazuha
            akun2.transfer(akun1, 200.0); // ijat atau akun 2 melakukan transfer ke kazuha atau akun 1 sebanyak 200
            System.out.println(); // jeda untuk spasi
    
            // untuk menampilkan info setelah transaksi
            System.out.println("Informasi Akhir Akun 1"); // mencetak tulisan informasi akhir akun 1
            akun1.displayinfo(); // memanggil method displayinfo

            System.out.println("Informasi Akun 2"); // mencetak tulisan informasi akhir akun 2
            akun2.displayinfo(); // memanggil method displayinfo
        }
}
