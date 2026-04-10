package kuis1;

public class produk06 {
    public String nama;
    public double harga;
    public int stok;
    public double diskon;

    public produk06 (String nama, double harga, int stok, double diskon) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.diskon = diskon;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("Diskon: " + diskon);
    }

    public void hitungHargaDiskon() {
        harga = harga-(harga*diskon/100);
        System.out.println("Harga setelah diskon adalah: " +harga);
    }
}