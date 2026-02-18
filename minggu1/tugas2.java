
import java.util.Scanner;

public class tugas2 {
    static Scanner sc = new Scanner (System.in);
    static void jadwal(String [][] jadwal, int n) {
        for(int i=0; i<n; i++){
            System.out.println("Jadwal ke-" +(i+1));
            System.out.println("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.println("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.println("Hari: ");
            jadwal[i][2] = sc.nextLine();
            System.out.println("Jam: ");
            jadwal[i][3] = sc.nextLine();
            System.out.println();
        }
    }
        
    static void tampil(String[][] jadwal, int n) {
        System.out.println("==== Daftar Jadwal ====");
        System.out.println("===========================================================================");
        System.out.printf("%-20s %-15s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("===========================================================================");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15s %-10s %-15s\n",
            jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    } 

    static void cariHari(String[][] jadwal, int n, String hariCari) {
        System.out.println("\nJadwal hari " + hariCari + ":");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariCari)) {
                System.out.println(jadwal[i][0] + " | " + jadwal[i][1] + " | " +  jadwal[i][3]);
            }
        }
    }

    static void cariMataKuliah(String[][] jadwal, int n, String mkCari) {
        System.out.println("\nJadwal mata kuliah " + mkCari + ":");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mkCari)) {
                System.out.println("Hari: " + jadwal[i][2]);
                System.out.println("Ruang: " + jadwal[i][1]);
                System.out.println("Jam: " + jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal: ");
        int n = sc.nextInt();
        sc.nextLine(); // buang enter

        String[][] jadwal = new String[n][4];

        jadwal(jadwal, n);
        tampil(jadwal, n);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        cariHari(jadwal, n, hari);

        System.out.print("\nCari berdasarkan nama mata kuliah: ");
        String mk = sc.nextLine();
        cariMataKuliah(jadwal, n, mk);
    }
}
