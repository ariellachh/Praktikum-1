public class Nilai {
    String name;
    int npm;
    double absen, tugas, uts, uas, akhir;

    void Nilai(){
        this.absen = absen*0.1;
        this.tugas = tugas*0.2;
        this.uts = uts*0.3;
        this.uas = uas*0.4;
        this.akhir = (this.absen + this.tugas + this.uts+ this.uas);

    }

    void CetakNilai(){
        System.out.println ("NPM              : " + this.npm);
        System.out.println ("Nama             : " + this.name);
        System.out.println ("Nilai Absen [10%]: " + this.absen);
        System.out.println ("Nilai Tugas [20%]: " + this.tugas);
        System.out.println ("Nilai UTS [30%]  : " + this.uts);
        System.out.println ("Nilai UAS [40%]  : " + this.uas);
        System.out.println ("Nilai Akhir      : " + this.akhir);

    }
}
