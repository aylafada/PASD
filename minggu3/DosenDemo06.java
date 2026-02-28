package minggu3;

import java.util.Scanner;

public class DosenDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen06[] arrayOfDosen06 = new Dosen06[3];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        for (int i=0; i<3;i++) {
            System.out.println("Masukkan Data Dosen ke-" +(i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine(); 
            System.out.print("Jenis Kelamin : ");
            dummy = sc.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");

            arrayOfDosen06[i] = new Dosen06(kode, nama, jenisKelamin, usia);
        }

        //untuk menampilkan data
        // for(int i=0; i<3;i++) {
        //     System.out.println("Data Dosen ke- " +(i+1));
        //     arrayOfDosen06[i].cetakInfo();
        //     System.out.println("--------------------------------------");
        // }

        DataDosen06 data = new DataDosen06();

        System.out.println("---- Semua Data Dosen ----");
        data.dataSemuaDosen06(arrayOfDosen06);
        System.out.println();
        System.out.println("---- Jumlah Dosen Per Jenis Kelamin ----");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen06);
        System.out.println();
        System.out.println("---- Rata-rata Usia Per Jenis Kelamin ----");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen06);
        System.out.println();
        System.out.println("---- Dosen Paling Tua ----");
        data.infoDosenPalingTua(arrayOfDosen06);
        System.out.println();
        System.out.println("---- Dosen Paling Muda ----");
        data.infoDosenPalingMuda(arrayOfDosen06);
    }
}
