package kuis1;

public class produkDemo06 {
    public static void main(String[] args) {

        produk06[] arrayOfProduk06 = new produk06[4];

        produk06 produk1 = new produk06("Beras", 75000, 23, 0.5);
        produk06 produk2 = new produk06("Gula", 17500, 58, 0.5);
        produk06 produk3 = new produk06("Roti", 17500, 58, 0.5);
        produk06 produk4 = new produk06("Susu", 17500, 58, 0.5);

        arrayOfProduk06[0] = produk1;
        arrayOfProduk06[1] = produk2;
        arrayOfProduk06[2] = produk3;
        arrayOfProduk06[3] = produk4;

        arrayOfProduk06[0].tampilkanInformasi();
        System.out.println();
        arrayOfProduk06[1].tampilkanInformasi();
        System.out.println();
        arrayOfProduk06[2].tampilkanInformasi();
        System.out.println();
        arrayOfProduk06[3].tampilkanInformasi();

        arrayOfProduk06[0].hitungHargaDiskon();
        System.out.println();
        arrayOfProduk06[1].hitungHargaDiskon();
        System.out.println();
        arrayOfProduk06[2].hitungHargaDiskon();
        System.out.println();
        arrayOfProduk06[3].hitungHargaDiskon();
        System.out.println();
    }
}
