package minggu5;

import java.util.Scanner;

public class mahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        mahasiswaBerprestasi06 list = new mahasiswaBerprestasi06();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" +(i+1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama  = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas  = sc.nextLine();

            System.out.print("IPK: ");
            double ipk  = sc.nextDouble();
            sc.nextLine();

            mahasiswa06 m = new mahasiswa06(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    
        // mahasiswa06 m1 = new mahasiswa06("111", "Ayla", "1C", 4.0);
        // mahasiswa06 m2 = new mahasiswa06("222", "Sulis", "3A", 3.8);
        // mahasiswa06 m3 = new mahasiswa06("333", "Fada", "1C", 4.0);
        // mahasiswa06 m4 = new mahasiswa06("444", "Gibran", "2G", 2.3);
        // mahasiswa06 m5 = new mahasiswa06("555", "Syakira", "1C", 4.0);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);
    }
    
}
