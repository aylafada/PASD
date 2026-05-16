package minggu9;

import java.util.Scanner;

public class SuratDemo06 {
    public static void main(String[] args) {
        StackSurat06 stack = new StackSurat06(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    // Terima surat baru → push
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat06 surat = new Surat06(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.printf("Surat izin dari %s berhasil diterima.\n", nama);
                    break;
                case 2:
                    Surat06 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("\n=== Memproses Surat ===");
                        System.out.println("ID Surat: " + diproses.idSurat);
                        System.out.println("Nama: " + diproses.namaMhs);
                        System.out.println("Kelas: " + diproses.kelas);
                        System.out.println("Jenis Izin: " + (diproses.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi: " + diproses.durasi + " hari");
                        System.out.println("Surat berhasil diproses.");
                    }
                    break;
                case 3:
                    Surat06 teratas = stack.peek();
                    if (teratas != null) {
                        System.out.println("\n=== Surat Izin Terakhir ===");
                        System.out.println("ID Surat: " + teratas.idSurat);
                        System.out.println("Nama: " + teratas.namaMhs);
                        System.out.println("Kelas: " + teratas.kelas);
                        System.out.println("Jenis Izin: " + (teratas.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi: " + teratas.durasi + " hari");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = scan.nextLine();
                    stack.cariSurat(cari);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
