package minggu2;

//deklarasi class
public class MahasiswaMain06 {
    
    public static void main(String[] args) {
        //object
        Mahasiswa06 mhs1 = new Mahasiswa06();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        //data sebelum diubah 
        mhs1.tampilkanInformasi();
        //memberikan nilai atribut dari object mhs1
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        //data sesudah diubah (menjalankan method dari object mhs1)
        mhs1.tampilkanInformasi();

        //instansiasi: pembuatan object dari class (new)
        //konstruktor (istimewa): nama method sama dengan nama class, tdk ada tipe data 
        Mahasiswa06 mhs2 = new Mahasiswa06 ("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk (3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa06 mhsAyla = new Mahasiswa06 ("Aylafada Syakira", "2541070116", 3.95, "TI 1C");
        mhsAyla.updateIpk (4.00);
        mhsAyla.tampilkanInformasi();
    }
}
