public class DemoNilai {
    public static void main (String[] args){
        Nilai mahasiswa1 = new Nilai();
        Nilai mahasiswa2 = new Nilai();

        mahasiswa1.npm = 12345;
        mahasiswa1.name = "Suti";
        mahasiswa1.absen = 100;
        mahasiswa1.tugas = 95;
        mahasiswa1.uts = 98;
        mahasiswa1.uas = 100;
        mahasiswa1.Nilai();
        mahasiswa1.CetakNilai();

        System.out.println();

        mahasiswa2.npm = 134565;
        mahasiswa2.name = "Aryo";
        mahasiswa2.absen = 100;
        mahasiswa2.tugas = 100;
        mahasiswa2.uts = 100;
        mahasiswa2.uas = 100;
        mahasiswa2.Nilai();
        mahasiswa2.CetakNilai();
    }
}
