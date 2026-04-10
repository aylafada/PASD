package minggu5;

public class mahasiswa06 {
    String nim, nama, kelas;
    double ipk;

    mahasiswa06(){

    }

    mahasiswa06(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }
    
    void tampilInformasi() {
        System.out.println("Nama: " +nama);
        System.out.println("NIM: " +nim);
        System.out.println("Kelas: " +kelas);
        System.out.println("IPK: " +ipk);
    }

    
}
