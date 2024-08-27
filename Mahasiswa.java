public class Mahasiswa {
    String name, major;
    int npm;

    void membaca(){
        System.out.println ("Mahasiswa diberikan tugas untuk membaca jurnal tentang Java");
    }

    void nyontek(){
        System.out.println ("Dan tidak boleh mencotek hasil rangkuman dari teman sekelaasnya");
    }

    void modifikasi(){
        System.out.println ("Nama: " + this.name);
        System.out.println ("Jurusan: " + this.major);
        System.out.println ("NPM: " + this.npm);
        System.out.println ("Semua hasil rangkuman dari membaca jurnal tersebut dikumpulkan hari ini di classroom paling lambat pukul 23.59");
    }
}
