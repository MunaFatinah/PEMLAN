// Tujuan program ini adalah untuk menentukan shift kerja yakni hari dan waktu, exception yang digunakan adalah NumberFormatException dan IllegalArgumentException

import java.util.Scanner;  // merupakan kelas scanner untuk membaca input dari pengguna

public class TugasTujuh { // kelas utama bernama TugasTujuh
    public static void main(String[] args) {  
        Scanner dor = new Scanner(System.in); // membuat objek dor untuk input dari pengguna

        try {  // blok untuk menangani kemungkinan error saat input atau proses
            System.out.print("Masukkan nama hari: "); //  meminta input hari dari pengguna
            String hari = dor.nextLine(); // membaca input hari sebagai string

            System.out.print("Masukkan jam masuk (6-12) dan (13-18): "); // meminta pengguna untuk input jam masuk
            int jamMasuk = Integer.parseInt(dor.nextLine()); // membaca input jam masuk dan konversi ke integer dengan parseInt

            tampilkanShift(hari, jamMasuk); // memanggil method tampilkanShift yang bisa melempar exception
        } catch (NumberFormatException e) { // menangkap error jika input jam masuk bukan angka yang valid
            System.out.println("Kesalahan input: Jam masuk harus berupa angka."); // menampilkan pesan error
            throw e; // melempar lagi exception supaya stack trace tetap muncul
        } catch (IllegalArgumentException e) { // menangkap error jika input hari atau jam tidak valid sesuai aturan
            System.out.println("Kesalahan input: " + e.getMessage()); // menampilkan pesan error dari exception
            throw e; // meempar lagi exception supaya stack trace tetap muncul
        } finally { // blok untuk menutup try catch
            dor.close(); // menutup objek scanner
        }
    }

    // merupakan method untuk menentukan shift berdasarkan hari dan jam masuk, bisa melempar IllegalArgumentException
    public static void tampilkanShift(String hari, int jamMasuk) throws IllegalArgumentException {
        switch (hari.toLowerCase()) { // menggunakan toLowerCase supaya case-insensitive
            case "senin": // menggunakan switch case untuk logika percabangan
            case "rabu": // hari 
            case "jumat": // hari
                if (jamMasuk < 6 || jamMasuk > 12) { // untuk validasi jam masuk shift pagi (6-12)
                    throw new IllegalArgumentException("Shift pagi hanya boleh masuk antara jam 6-12"); // melempar error jika tidak valid
                }
                System.out.println("Shift pagi"); // mnampilkan info shift pagi
                break; // break

            case "selasa": // hari
            case "kamis": // hari
                if (jamMasuk < 13 || jamMasuk > 18) { // memvalidasi jam masuk shift siang (13-18)
                    throw new IllegalArgumentException("Shift siang hanya boleh masuk antara jam 13-18"); // melempar error jika tidak valid
                }
                System.out.println("Shift siang"); // menampilkan info shift siang
                break; // break

            case "sabtu": // hari
            case "minggu": // hari
                System.out.println("Libur"); // hari libur, tidak ada shift
                break; // break

            default: 
                throw new IllegalArgumentException("Hari tidak valid: " + hari); // melempar error jika hari tidak dikenal
        }
    }
}
