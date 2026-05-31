package minggu11;

public class Mahasiswa06 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa06 (String nm, String name, String kls, double ip){
        nim =  nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-15s %-8s %-5s\n", nama, nim, kelas, ipk);
    }
}