package tugassatu; //kelas berada di dalam folder atau package bernama tugassatu

public class Cireng { // deklarasi kelas Cireng
    public String nama; // atribut untuk cireng yaitu nama dengan tipe data string dan akses publik
    public String isi; // atribut untuk cireng yaitu isi dengan tipe data string dan akses publik
    public int harga; // atribut untuk cireng yaitu harga dengan tipe data integer dan akses publik
    public String rasa; // atribut untuk cireng yaitu rasa dengan tipe data string dan akses publik

    public void infocireng () { // method untuk menampilkan info cireng
        System.out.println("Nama: " + nama); // untuk mencetak nama cireng
        System.out.println("Isi: " + isi); // untuk mencetak isi cireng
        System.out.println("Harga: Rp " + harga); // untuk mencetak harga cireng
        System.out.println("Rasa: " + rasa); // untuk menceak rasa cireng

    }

}
