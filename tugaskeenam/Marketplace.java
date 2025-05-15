package Marketplace; // file ini berada di package marketplace
import java.util.List; // mengimpor list dari java util
import java.util.*; // untuk mengimpor semua kelas


public class Marketplace { // merupakan kelas utama atau main untuk menjalankan semua method
    public static void main(String[] args) { // merupakan titik awal program java 
        ProductManager manager = new ProductManager(); // merupakan instansiasi dari ProductManager

        // membuat 4 produk dengan kategori string
        Product<String> p1 = new Product<>(1, "Laptop", "Elektronik", 7000000); // membuat produk dengan naa produk, kategori, dan harganya
        Product<String> p2 = new Product<>(2, "Kaos", "Pakaian", 100000); // membuat produk dengan naa produk, kategori, dan harganya
        Product<String> p3 = new Product<>(3, "Smartphone", "Elektronik", 5000000); // membuat produk dengan naa produk, kategori, dan harganya
        Product<String> p4 = new Product<>(4, "Celana", "Pakaian", 150000); // membuat produk dengan naa produk, kategori, dan harganya

        // menambahkan semua produk ke dalam ProductManager
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);
        manager.addProduct(p4);

        // menampilkan seluruh produk yang sudah ditambahkan dalam keadaan urut berdasarkan kategori
        System.out.println("\n== Semua Produk (Terurut) ==");
        manager.showSortedProducts(); // memanggil method showSortedProducts

        // menampilkan semua kategori unik dari produk yang tersedia
        System.out.println("\n== Kategori Unik ==");
        manager.showCategories(); // memanggil method showCategories

        // mencari produk bernama kaos dengan kategori pakaian
        System.out.println("\n== Mencari Produk 'Kaos' di kategori 'Pakaian' ==");
        List<Product<?>> result = manager.searchProduct("Kaos", "Pakaian"); // untuk mencari kaos
        result.forEach(System.out::println); // menampilkan hasil pencarian

        // memproses dua produk untuk masuk ke dalam antrian
        System.out.println("\n== Proses Produk =="); 
        manager.processProduct(p2);
        manager.processProduct(p4);

        // menampilkan daftar produk yang telah diproses
        System.out.println("\nDaftar Produk yang Telah Diproses:");
        manager.showProcessedQueue(); // memangggil method showProcessedQueue

        // menghapus produk dengan ID 3 
        System.out.println("\n== Hapus Produk ID 3 ==");
        manager.removeProductById(3); // untuk menghapus
        manager.showSortedProducts(); // menampilkan kembali produk yang tersisa
    }
}
