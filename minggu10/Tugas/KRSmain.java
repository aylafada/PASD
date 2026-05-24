package minggu10.Tugas;

import java.util.Scanner;

public class KRSmain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilih;

        do {
            System.out.println("\n===== ANTRIAN KRS =====");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Cek Jumlah yang Sudah Proses KRS");
            System.out.println("8. Cek Jumlah yang Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, prodi);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.layani();
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    antrian.tampil2Terdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    antrian.jumlahAntrian();
                    break;
                case 7:
                    antrian.jumlahDiproses();
                    break;
                case 8:
                    antrian.belumProses();
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 0);
        sc.close();
    }
}

