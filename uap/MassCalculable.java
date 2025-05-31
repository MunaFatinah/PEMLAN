package uap.interfaces; // package untuk interface 

public interface MassCalculable { // kelas public, interface, bernama MassCalculable
    int DENSITY = 8; // konstanta untuk densitas dan bertipe int
    double THICKNESS = 0.5; // ketebalan bertipe data double
    double getMassa(); // method untuk menghitung massa 
}
