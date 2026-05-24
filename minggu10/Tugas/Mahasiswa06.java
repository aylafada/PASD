package minggu10.Tugas;

public class Mahasiswa06 {
    String nim, nama, kelas, prodi;

    public Mahasiswa06(String nim, String nama, String kelas, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.prodi = prodi;
    }

    public void tampilData() {
        System.out.println(nim +" - " +nama +" - " +kelas +" - " +prodi);
    }
}
