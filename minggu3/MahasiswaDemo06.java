package minggu3;

import java.util.Scanner;

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa06[] arrayOfMahasiswa06 = new Mahasiswa06[3];
        String dummy;

        for (int i=0; i<3; i++) {
            arrayOfMahasiswa06[i] = new Mahasiswa06();

            System.out.println("Masukkan Data Mahasiswa ke-" +(i+1));
            // System.out.print("NIM     :");
            // arrayOfMahasiswa06[i].nim = sc.nextLine();
            // System.out.print("Nama    :");
            // arrayOfMahasiswa06[i].nama = sc.nextLine();
            // System.out.print("Kelas   :");
            // arrayOfMahasiswa06[i].kelas = sc.nextLine();
            // System.out.print("IPK     :");
            // dummy = sc.nextLine();
            // arrayOfMahasiswa06[i].ipk = Float.parseFloat(dummy);
            arrayOfMahasiswa06[i].cetakInfo();
            System.out.println("------------------------------------");

        }

        for (int i=0; i<3; i++) {
            System.out.println("Data Mahasiswa ke-" +(i+1));
            System.out.println("NIM     : " +arrayOfMahasiswa06[i].nim);
            System.out.println("Nama    : " +arrayOfMahasiswa06[i].nama);
            System.out.println("Kelas   : " +arrayOfMahasiswa06[i].kelas);
            System.out.println("IPK     : " +arrayOfMahasiswa06[i].ipk);
            System.out.println("-----------------------------------------");

        }

        // arrayOfMahasiswa06[0] = new Mahasiswa06();
        // arrayOfMahasiswa06[0].nim = "2441070003";
        // arrayOfMahasiswa06[0].nama = "AGNES TITANIA KINANTI";
        // arrayOfMahasiswa06[0].kelas = "SIB-1E";
        // arrayOfMahasiswa06[0].ipk = (float) 3.75;

        // arrayOfMahasiswa06[1] = new Mahasiswa06();
        // arrayOfMahasiswa06[1].nim = "2441070002";
        // arrayOfMahasiswa06[1].nama = "ACHMAD MAULANA HAMZAH";
        // arrayOfMahasiswa06[1].kelas = "TI-2A";
        // arrayOfMahasiswa06[1].ipk = (float) 3.36;
        
        // arrayOfMahasiswa06[2] = new Mahasiswa06();
        // arrayOfMahasiswa06[2].nim = "2441070001";
        // arrayOfMahasiswa06[2].nama = "DIRHMAWAN PUTRANTO";
        // arrayOfMahasiswa06[2].kelas = "TI-2E";
        // arrayOfMahasiswa06[2].ipk = (float) 3.80;

        // System.out.println("NIM     : " +arrayOfMahasiswa06[0].nim);
        // System.out.println("Nama    : " +arrayOfMahasiswa06[0].nama);
        // System.out.println("Kelas   : " +arrayOfMahasiswa06[0].kelas);
        // System.out.println("IPK     : " +arrayOfMahasiswa06[0].ipk);
        // System.out.println("--------------------------------------" );
        // System.out.println("NIM     : " +arrayOfMahasiswa06[1].nim);
        // System.out.println("Nama    : " +arrayOfMahasiswa06[1].nama);
        // System.out.println("Kelas   : " +arrayOfMahasiswa06[1].kelas);
        // System.out.println("IPK     : " +arrayOfMahasiswa06[1].ipk);
        // System.out.println("--------------------------------------" );
        // System.out.println("NIM     : " +arrayOfMahasiswa06[2].nim);
        // System.out.println("Nama    : " +arrayOfMahasiswa06[2].nama);
        // System.out.println("Kelas   : " +arrayOfMahasiswa06[2].kelas);
        // System.out.println("IPK     : " +arrayOfMahasiswa06[2].ipk);
        // System.out.println("--------------------------------------" );
        

    }
}
