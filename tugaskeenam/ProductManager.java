package Marketplace; // kelas ini ada di dalam package 'Marketplace'

import java.util.*; // untuk mengimpor semua kelas

public class ProductManager { // kelas untuk mengelola produk

    // daftar produk utama (menggunakan wildcard untuk fleksibilitas tipe)
    private List<Product<?>> products = new ArrayList<>();

    // set untuk menyimpan kategori produk yang unik 
    private Set<String> categories = new HashSet<>();

    // queue untuk menyimpan produk yang sudah diproses 
    private Queue<Product<?>> processedQueue = new LinkedList<>();

    // method untuk menambahkan produk ke dalam daftar dan menyimpan kategori
    public void addProduct(Product<?> product) {
        products.add(product); // menambahkan produk ke list
        categories.add(product.getCategory().toString()); // menyimpan kategori dalam bentuk string
    }

    // method untuk menghapus produk berdasarkan ID
    public void removeProductById(int id) {
        products.removeIf(p -> p.getId() == id); // untuk menghapus produk jika ID-nya cocok
    }

    // method untuk mencari produk berdasarkan nama dan kategori
    public List<Product<?>> searchProduct(String name, String category) {
        List<Product<?>> result = new ArrayList<>(); // list untuk menampung hasil pencarian
        for (Product<?> p : products) {
            // untuk membandingkan nama dan kategori tanpa memperhatikan huruf kapital
            if (p.getName().equalsIgnoreCase(name) && 
                p.getCategory().toString().equalsIgnoreCase(category)) {
                result.add(p); // menambahkan ke hasil jika cocok
            }
        }
        return result; // untuk mengembalikan hasil pencarian
    }

    // method untuk menampilkan produk secara terurut berdasarkan kategori
    public void showSortedProducts() {
        List<Product<?>> sorted = new ArrayList<>(products); // untuk menyalin list produk
        // untuk mengurutkan berdasarkan string kategori
        sorted.sort((p1, p2) -> p1.getCategory().toString().compareTo(p2.getCategory().toString()));
        for (Product<?> p : sorted) {
            System.out.println(p); // untuk menampilkan setiap produk
        }
    }

    // method untuk menampilkan kategori unik yang tersedia
    public void showCategories() {
        System.out.println("Unique Categories:");
        for (String c : categories) {
            System.out.println("- " + c); // mencetak setiap kategori
        }
    }

    // method untuk memproses produk dan menambahkan ke antrian
    public void processProduct(Product<?> product) {
        processedQueue.add(product); // menambahkan ke queue
        // untuk menampilkan bahwa produk berhasil diproses
        System.out.println("Produk '" + product.getName() + "' berhasil ditambahkan ke antrian proses.");
    }

    // method untuk menampilkan produk-produk yang sudah diproses
    public void showProcessedQueue() {
        System.out.println("Processed Products:");
        for (Product<?> p : processedQueue) {
            System.out.println(p); // mencetak setiap produk dalam queue
        }
    }
}
