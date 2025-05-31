package uap.bases; // package shape

public abstract class Shape { // kelas abstrak sebagai dasar bentuk tiga dimensi
    private String name; // untuk menyimpan nama bentuk, bertipe string dan privat

    public Shape() { // konstruktor default
        
    }

    public void setName(String inputName) { // setter untuk name
        this.name = inputName; // merujuk ke inputName
    }

    public String getName() { // getter untuk name
        return name;
    }

    public abstract void printInfo(); // method untuk mencetak info
}
