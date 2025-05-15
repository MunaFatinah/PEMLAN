package Marketplace; // Kelas ini berada dalam package bernama "Marketplace"

public class Product<T extends Comparable<T>> implements Comparable<Product<T>> { // Merupakan kelas generik Product dengan parameter T yang g
    private int id;
    private String name;
    private T category;
    private double price;

    public Product(int id, String name, T category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId() { 
        return id; 
    }

    public String getName() { 
        return name; 
    }

    public T getCategory() { 
        return category; 
    }

    public double getPrice() { 
        return price; 
    }


    @Override
    public int compareTo(Product<T> other) {
        return this.category.compareTo(other.category);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Category: " + category + ", Price: " + price;
    }
}
