package minggu11;

import java.util.Scanner;

public class SLLMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList06 sll = new SingleLinkedList06();

        //modif dinamis
        // System.out.print("Masukkan NIM: ");
        // String nim = sc.nextLine();
        // System.out.print("Masukkan Nama: ");
        // String nama = sc.nextLine();
        // System.out.print("Masukkan Kelas: ");
        // String kelas = sc.nextLine();
        // System.out.print("Masukkan IPK: ");
        // double ipk = sc.nextDouble();

        // Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
        // sll.addFirst(mhs);
        // sll.print();

        Mahasiswa06 mhs1 = new Mahasiswa06("123", "Ayla", "TI-1C", 4);
        Mahasiswa06 mhs2 = new Mahasiswa06("234", "Briyani", "SIB-3G", 3);
        Mahasiswa06 mhs3 = new Mahasiswa06("456", "Empok", "SIB-1E", 3);
        Mahasiswa06 mhs4 = new Mahasiswa06("567", "Uduk", "TI-3G", 2);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Ayla", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Ayla berada pada index : " +sll.indexOf("ayla"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}
