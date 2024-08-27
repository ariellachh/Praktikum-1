public class MahasiswaBeraksi {
    public static void main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();

        mahasiswa1.name = "Ratna";
        mahasiswa1.major = "Sistem Informasi";
        mahasiswa1.npm = 12345;
        mahasiswa1.modifikasi();
        mahasiswa1.membaca();
        mahasiswa1.nyontek();

        System.out.println(); 

        mahasiswa2.name = "Vidi";
        mahasiswa2.major = "Informatika";
        mahasiswa2.npm = 134580;
        mahasiswa2.modifikasi();
        mahasiswa2.membaca();
    }
    
}
