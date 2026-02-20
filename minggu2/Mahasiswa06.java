package minggu2;

//class: template untuk membuat object
public class Mahasiswa06 {
    //atribut: data yang memiliki object 
    String nama;
    String nim;
    String kelas;
    double ipk;

    //method/fungsi: digunakan object untuk berinteraksi dengan object yang lain 
    void tampilkanInformasi () {
        System.out.println("Nama: " +nama);
        System.out.println("NIM: " +nim);
        System.out.println("IPK: " +ipk);
        System.out.println("Kelas: " +kelas);
    }

    void ubahKelas (String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk (double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0){
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup ";
        } else {
            return "Kinerja kurang";
        } 
    }

    //konstruktor default
    public Mahasiswa06(){
    }

    //konstruktor berparameter
    public Mahasiswa06 (String nm, String nim, double ipk, String kls) {
        //digunakan untuk mengakses atribut 
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

}


