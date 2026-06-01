package minggu11.Tugas;

public class mahasiswa06 {
    String nim;
    String nama;
    String prodi;

    public mahasiswa06(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampil() {
        System.out.printf("%-10s %-15s %-10s%n", nim, nama, prodi);
    }
}
