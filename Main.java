package tugassatu; // kelas Main ada di tugassatu

public class Main { // deklarasi kelas Main
    public static void main(String[] args) { // method yang selalu ada di Java

        // membuat tiga objek dari kelas cireng
        Cireng cireng1 = new Cireng(); // objek cireng1
        Cireng cireng2 = new Cireng(); // objek cireng2
        Cireng cireng3 = new Cireng(); //objek cireng3
        
        // pengisisan atribut objek cireng1
        cireng1.nama = "Cireng ayam suir pedas"; // memberi nama cireng1
        cireng1.isi = "Ayam suir bumbu pedas"; // isi dari cireng1
        cireng1.harga = 3000; // harga cireng1
        cireng1.rasa = "Gurih dan pedas"; // rasa cireng1
        
        // pengisian atribut objek cireng2
        cireng2.nama = "Cireng keju"; // memberi nama cireng2
        cireng2.isi = "Keju quick melt"; // iai dari cireng2
        cireng2.harga = 3500; // harga cireng2
        cireng2.rasa = "Asin dan gurih"; // rasa cireng 2
        
        // pengisian atribut objek cireng3
        cireng3.nama = "Cireng sosis"; // memberi nama cireng3
        cireng3.isi = "Sosis ayam"; //isi dari cireng3
        cireng3.harga = 3000; // harga cireng3
        cireng3.rasa = "Sedikit manis dan gurih"; // rasa cireng 3

        cireng1.infocireng(); // memanggil method infocireng() dari kelas Cireng untuk cireng1
        System.out.println(); // untuk spasi agar output lebih rapi
        cireng2.infocireng(); // memanggil method infocireng() dari kelas Cireng untuk cireng 2
        System.out.println(); // untuk spasi
        cireng3.infocireng(); // memanggil method infocireng() dari kelas Cireng untuk cireng 2
        System.out.println(); // untuk spasi
        
    }
}
