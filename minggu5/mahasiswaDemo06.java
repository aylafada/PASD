package minggu5;

public class mahasiswaDemo06 {
    public static void main(String[] args) {
        mahasiswaBerprestasi06 list = new mahasiswaBerprestasi06();
        mahasiswa06 m1 = new mahasiswa06("111", "Ayla", "1C", 4.0);
        mahasiswa06 m2 = new mahasiswa06("222", "Sulis", "3A", 3.8);
        mahasiswa06 m3 = new mahasiswa06("333", "Fada", "1C", 4.0);
        mahasiswa06 m4 = new mahasiswa06("444", "Gibran", "2G", 2.3);
        mahasiswa06 m5 = new mahasiswa06("555", "Syakira", "1C", 4.0);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
    
}
