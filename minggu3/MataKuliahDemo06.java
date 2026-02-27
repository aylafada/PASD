package minggu3;

import java.util.Scanner;

public class MataKuliahDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MataKuliah06[] arrayOfMataKuliah06 = new MataKuliah06[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i<jumlah; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" +(i+1));
            System.out.print("Kode     : " );
            kode = sc.nextLine();
            System.out.print("Nama     : ");
            nama = sc.nextLine();
            System.out.print("SKS      : " );
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------------------");

            arrayOfMataKuliah06[i] = new MataKuliah06();
            arrayOfMataKuliah06[i].tambahData(kode, nama, sks, jumlahJam);
        }

        // for(int i=0; i<3; i++) {
        //     System.out.println("Data Mata Kuliah ke-" +(i+1));
        //     System.out.println("Kode     :" +arrayOfMataKuliah06[i].kode);
        //     System.out.println("Nama     :" +arrayOfMataKuliah06[i].nama);
        //     System.out.println("SKS      :" +arrayOfMataKuliah06[i].sks);
        //     System.out.println("Jumlah jam:" +arrayOfMataKuliah06[i].jumlahJam);
        //     System.out.println("-------------------------------------------");

        // }

        for (int i=0; i<jumlah; i++) {
            arrayOfMataKuliah06[i].cetakInfo();
        }
    }
}
