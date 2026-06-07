package StudiKasus2;

import java.util.Scanner;

public class DLLMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLPembeli antrian = new DLLPembeli();
        DLLPesanan daftarPesanan = new DLLPesanan();
        
        int noAntrian = 1;
        int pilih;

        do { 
            System.out.println("====== SISTEM ANTRIAN ======");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.println("============================");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("No HO: ");
                    String hp = sc.nextLine();
                    pembeli pembeliBaru = new pembeli(noAntrian, nama, hp);
                    antrian.enqueue(pembeliBaru);
                    System.out.println("Pembeli berhasil ditambahkan");
                    noAntrian++;
                    break;
                case 2:
                    antrian.printAntrian();
                    break;
                case 3:
                    pembeli pembeliDilayani = antrian.dequeue();
                    if (pembeliDilayani != null) {
                        System.out.print("Melayani: " +pembeliDilayani.namaPembeli);
                        System.out.print("Kode Pesanan: ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan: ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga: ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        pesanan pesananBaru = new pesanan(kode, namaPesanan, harga);
                        daftarPesanan.tambahPesanan(pesananBaru);
                    }
                    break;
                case 4:
                    daftarPesanan.sorting();
                    daftarPesanan.print();
                    break;
                case 5:
                    System.out.println("Teima kasih");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (pilih != 5);
    }
}
