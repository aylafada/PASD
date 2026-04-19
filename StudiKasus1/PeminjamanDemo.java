import java.util.Scanner;

public class PeminjamanDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] buku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        DataPeminjaman data = new DataPeminjaman();

        data.tambah(new Peminjaman(mhs[0], buku[0], 7));
        data.tambah(new Peminjaman(mhs[1], buku[1], 3));
        data.tambah(new Peminjaman(mhs[2], buku[2], 10));
        data.tambah(new Peminjaman(mhs[2], buku[3], 6));
        data.tambah(new Peminjaman(mhs[0], buku[1], 4));

        int pilih;
        do {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    for (Mahasiswa m : mhs) m.tampilMahasiswa();
                    break;

                case 2:
                    for (Buku b : buku) b.tampilBuku();
                    break;

                case 3:
                    data.tampil();
                    break;

                case 4:
                    data.insertionSortDenda();
                    data.tampil();
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    data.cariNIM(nim);
                    break;
            }

        } while (pilih != 0);
    }
}