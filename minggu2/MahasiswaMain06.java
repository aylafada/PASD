package minggu2;

public class MahasiswaMain06 {
    
    public static void main(String[] args) {
        Mahasiswa06 mhs1 = new Mahasiswa06();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2J");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa06 mhs2 = new Mahasiswa06 ("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk (3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa06 mhsAyla = new Mahasiswa06 ("Aylafada Syakira", "2541070116", 3.95, "TI 1C");
        mhsAyla.updateIpk (4.00);
        mhsAyla.tampilkanInformasi();
    }
}
