package minggu11.Tugas;

import java.util.Scanner;

public class main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queueLinkedList06 antrian = new queueLinkedList06();
        int pilih;

        do { 
            System.out.println("---- ANTRIAN MAHASISWA ----");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Paling Depan");
            System.out.println("4. Lihat Antrian Paling Belakang");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Tampilkan Semua");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    antrian.enqueue(new mahasiswa06(nim, nama, prodi));
                    break;
                case 2:
                    mahasiswa06 keluar = antrian.dequeue();
                    if(keluar != null) {
                        System.out.print("Dipanggil: ");
                        keluar.tampil();
                    }
                    break;
                case 3:
                    antrian.peekFront();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.jumlahAntrian();
                    break;
                case 6:
                    antrian.print();
                    break;
                case 7:
                    antrian.clear();
                    System.out.println("Antrian Dikosongkan");
                    break;
            }

        } while (pilih != 0);
    }
}
