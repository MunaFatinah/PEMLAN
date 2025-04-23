package praktic.geometry.bases; // merupakan package yang diberi nama bases

public abstract class Shape { // kelas abstrak untuk semua bentuk yakni 2D dan 3D
    private String name; // untuk menyimpan nama bentuk dan diberi modifier private

    public Shape() {} // default constructor

    public void setName(String inputName) { // untuk mengatur nama 
        this.name = inputName; // meng-set nama ke input
    }

    public String getName() { // method untuk mendapatkan nama
        return name; // mengembalikan nilai nama
    }

    public abstract void printInfo(); // method abstrak untuk mencetak info
}
