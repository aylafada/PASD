package minggu3;

public class DataDosen06 {
    void dataSemuaDosen06(Dosen06[] arrayOfDosen06) {
        for(int i=0; i<arrayOfDosen06.length;i++) {
            System.out.println("Data Dosen ke-" +(i+1));
            arrayOfDosen06[i].cetakInfo();
            System.out.println("--------------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen06[] arrayOfDosen06){
        int pria = 0;
        int wanita = 0;
        for(int i=0; i<arrayOfDosen06.length; i++) {
            if (arrayOfDosen06[i].jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria adalah: " +pria);
        System.out.println("Jumlah Dosen Wanita adalah: " +wanita) ;
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen06[] arrayOfDosen06) {
        int totalPria=0, totalWanita=0;
        int jumlahPria=0, jumlahWanita=0;

        for(int i=0; i<arrayOfDosen06.length;i++) {
            if (arrayOfDosen06[i].jenisKelamin) {
                totalPria += arrayOfDosen06[i].usia;
                jumlahPria++;
            } else {
                totalWanita += arrayOfDosen06[i].usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria>0) {
            System.out.println("Rata-rata usia dosen pria:" +(totalPria/jumlahPria));
        }

        if (jumlahWanita>0) {
            System.out.println("Rata-rata usia dosen wanita adalah: " +(totalWanita/jumlahWanita));
        }
    }

    void infoDosenPalingTua (Dosen06[] arrayOfDosen06) {
        int idxTertua = 0;

        for(int i =0; i<arrayOfDosen06.length; i++) {
            if(arrayOfDosen06[i].usia > arrayOfDosen06[idxTertua].usia) {
                idxTertua=i;
            }
        }

        System.out.println("Dosen paling tua: ");
        arrayOfDosen06[idxTertua].cetakInfo();

    }

    void infoDosenPalingMuda (Dosen06[] arrayOfDosen06) {
        int idxTermuda = 0;

        for(int i =0; i<arrayOfDosen06.length; i++) {
            if(arrayOfDosen06[i].usia<arrayOfDosen06[idxTermuda].usia) {
                idxTermuda=i;
            }
        }

        System.out.println("Dosen paling muda: ");
        arrayOfDosen06[idxTermuda].cetakInfo();
    }
}
