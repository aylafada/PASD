package minggu2;

public class MataKuliahMain06 {
    
    public static void main(String[] args) {
        MataKuliah06 mk1 = new MataKuliah06();
        mk1.kodeMK = "ASD1C";
        mk1.nama = "Praktikum Algoritma dan Struktur Data";
        mk1.sks = 4;
        mk1.jumlahJam = 8;

        mk1.tampilInformasi();
        mk1.ubahSKS(5);
        mk1.tambahJam(2);
        mk1.kurangiJam(4);
        mk1.tampilInformasi();

        MataKuliah06 mk2 = new MataKuliah06 ("BD1C", "Basis Data", 3, 6);

        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(5);
        mk2.kurangiJam(4);
        mk2.tampilInformasi();
    }
}
