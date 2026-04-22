public class Peminjaman {

    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam, denda, terlambat;
    int batasPeminjaman=5;
    String kategoriDenda;

    public Peminjaman (Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.hitungDenda();
    }

    void hitungDenda() {
        if (lamaPinjam > batasPeminjaman) {
            terlambat = lamaPinjam - batasPeminjaman;
            denda = terlambat*2000;
        } else {
            terlambat = 0;
            denda = 0;
        }

        // Modifikasi A2
        if (denda <= 5000) {
            kategoriDenda = "Ringan";
        } else if (denda <= 10000) {
            kategoriDenda = "Sedang";
        } else {
            kategoriDenda = "Berat";
        }
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama +" | " +buku.judul +" | Lama: " +lamaPinjam +" | Terlambat: " +terlambat +" | Denda: " +denda + " | Kategori: " + kategoriDenda);
    }

}
