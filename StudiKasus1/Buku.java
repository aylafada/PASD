public class Buku {

    String kodeBuku, judul;
    int tahunTerbit;

    public Buku (String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilBuku(){
        System.out.println("Kode: " +kodeBuku +" | " +"Judul: " +judul +" | " +"Tahun: " +tahunTerbit );
    }

    //Modifikasi B2
    static void cariJudul(Buku[]buku, String judul) {
        for(Buku b:buku) {
            if (b.judul.equalsIgnoreCase(judul)) {
                b.tampilBuku();
            }
        }
    }
}
