package minggu2;

public class DosenMain06 {
    public static void main(String[] args) {
        Dosen06 dsn1 = new Dosen06();
        dsn1.idDosen = "12345";
        dsn1.nama = "Aviv Ardhillah";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2017;
        dsn1.bidangKeahlian = "Kalkulus";

        dsn1.tampilInformasi();
        dsn1.ubahKeahlian("Aljabar Linear");
        System.out.println("Masa Kerja: " +dsn1.hitungMasaKerja(2026) + " tahun");
        dsn1.tampilInformasi();

        Dosen06 dsn2 = new Dosen06("12334", "Rina", false, 2010, "English Literature");
        dsn2.tampilInformasi();
        dsn2.ubahKeahlian("English for Communication");
        System.out.println("Masa Kerja: " +dsn2.hitungMasaKerja(2026) +" tahun");
        dsn2.tampilInformasi();
    }
}

