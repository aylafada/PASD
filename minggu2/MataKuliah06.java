package minggu2;

public class MataKuliah06 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " +kodeMK);
        System.out.println("Nama Mata Kuliah: " +nama);
        System.out.println("SKS: " +sks);
        System.out.println("Jumlah Jam: " +jumlahJam);
        System.out.println();
    }

    void ubahSKS (int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " +sks);
    }

    void tambahJam (int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam setelah ditambah: " +jumlahJam);
    }

    void kurangiJam (int jam) {
        if(jumlahJam>=jam){
            jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi: " +jumlahJam);
        } else if (jumlahJam<=jam) {
            System.out.println("Pengurangan tidak dapat dilakukan.");
        }
        
    }

    public MataKuliah06(){
    }

    public MataKuliah06(String kodeMK, String nm, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

}
