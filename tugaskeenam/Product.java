package Marketplace; // Kelas ini berada dalam package bernama "Marketplace"

public class Product<T extends Comparable<T>> implements Comparable<Product<T>> { // Merupakan kelas generik Product dengan kategori (T) dan harus bisa dibandingkan 
    private int id; // untuk menyimpan id produk, bersifat private, dan tipe datanya int
    private String name; // untuk menyimpan nama produk bersifat private dan bertipe data String
    private T category; // untuk menyimmpan kategori produk, merupakan tipe generik T
    private double price; // untuk menyimpan harga produk dengan tipe data double dan bersifat private

    // merupakan onstruktor untuk menginisialisasi semua atribut
    public Product(int id, String name, T category, double price) {
        this.id = id; // merujuk pada id
        this.name = name; // merujuk pada nama
        this.category = category; /// merujuk pada kategori 
        this.price = price; // merujuk pada harga
    }

    // merupakan method getter untuk mengambil ID produk
    public int getId() { 
        return id; 
    }

    // method untuk mengambil nama produk
    public String getName() { 
        return name; 
    }

    // method untuk mengambil kategori produk
    public T getCategory() { 
        return category; 
    }

    // method untuk mengambil harga produk
    public double getPrice() { 
        return price; 
    }

    // method untuk membandingkan produk berdasarkan kategori
    @Override
    public int compareTo(Product<T> other) {
        return this.category.compareTo(other.category); // membandingkan berdasarkan kategori
    }

    // nethod untuk mengubah data produk ke format string 
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Category: " + category + ", Price: " + price;
    }
}

