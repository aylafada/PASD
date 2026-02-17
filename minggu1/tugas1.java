import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] kodePlat = {'A', 'B', 'D', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] namaKota = {{'B', 'A', 'N', 'T', 'E', 'N'}, {'J', 'A', 'K', 'A', 'R', 'T', 'A'}, {'B', 'A', 'N', 'D', 'U', 'N', 'G'}, {'C','I','R','E','B','O','N'}, {'B','O','G','O','R'}, {'P','E','K','A','L','O','N','G','A','N'}, {'S','E','M','A','R','A','N','G'}, {'S','U','R','A','B','A','Y','A'}, {'M','A','L','A','N','G'}, {'T','E','G','A','L'} };

        System.out.println("Masukkan kode plat");
        char cari = sc.next().toUpperCase().charAt(0);

        for(int i=0; i<kodePlat.length; i++) {
            if(cari == kodePlat[i]) {
                System.out.println("Kota: ");
                for (int j=0; j<namaKota[i].length; j++) {
                    System.out.println(namaKota[i][j]);
                } 
                break;
            }
        }
    }
}
