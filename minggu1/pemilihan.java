
import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=======================");
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextInt();
        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.println("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.println("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextInt();
        System.out.println("=======================");

        if (nilaiTugas<0 || nilaiTugas>100 || nilaiKuis<0 || nilaiKuis>100|| nilaiUTS<0 || nilaiUTS>100 || nilaiUAS<0 || nilaiUAS>100){
            System.out.println("=======================");
            System.out.println("Nilai tidak valid. ");
            System.out.println("=======================");
        } else {
            nilaiAkhir = (nilaiTugas*0.2) + (nilaiKuis*0.2) + (nilaiUTS*0.3) + (nilaiUAS*0.4);

            if (nilaiAkhir>80 && nilaiAkhir<=100){
                nilaiHuruf = "A";
            } else if (nilaiAkhir>73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir>65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir>60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir>50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir>39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("============================");
            System.out.println("Nilai Akhir: " +nilaiAkhir);
            System.out.println("Nilai Huruf: " +nilaiHuruf);
            System.out.println("============================");

            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }

            sc.close();

        }
    }
}
