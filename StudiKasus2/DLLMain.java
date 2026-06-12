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
            System.out.println("==========================================");
            System.out.println("        SISTEM ANTRIAN ROYAL DELISH       ");
            System.out.println("==========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Pesanan Termahal");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    String hp = sc.nextLine();
                    pembeli pembeliBaru = new pembeli(noAntrian, nama, hp);
                    antrian.enqueue(pembeliBaru);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " +noAntrian +"\n");
                    noAntrian++;
                    break;
                case 2:
                    antrian.printAntrian();
                    System.out.println();
                    break;
                case 3:
                    pembeli pembeliDilayani = antrian.dequeue();
                    if (pembeliDilayani != null) {
                        System.out.print("Kode Pesanan: ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan: ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga       : ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        pesanan pesananBaru = new pesanan(kode, namaPesanan, harga);
                        daftarPesanan.tambahPesanan(pesananBaru);
                        System.out.println(pembeliDilayani.namaPembeli +" telah memesan " +namaPesanan);
                    }
                    break;
                case 4:
                    daftarPesanan.sorting();
                    daftarPesanan.print();
                    System.out.println();
                    break;
                case 5:
                    daftarPesanan.pesananTermahal();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (pilih != 0);
    }
}
