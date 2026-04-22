public class DataPeminjaman {
    Peminjaman[] data = new Peminjaman[5];
    int idx = 0;

    void tambah (Peminjaman p) {
        if (idx<data.length) {
            data [idx] = p;
            idx++;
        }
    }

    void tampil () {
        for (int i=0; i<idx; i++) {
            data[i].tampilPeminjaman();
        }
    }

    void insertionSortDenda() {
        for (int i=1; i<idx; i++) {
            Peminjaman temp = data [i];
            int j = i-1;

            while (j >= 0 && data[j].denda < temp.denda) {
                data [j+1] = data[j];
                j--;
            } 
            data[j+1] = temp;
        }
    }

    void sortNIM() {
        for (int i=1; i<idx; i++) {
            Peminjaman temp = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    int binarySearch(String nim) {
        int left = 0, right = idx-1;

        while (left <= right) {
            int mid = (left+right) / 2;

            int hasil = data[mid].mhs.nim.compareTo(nim);

            if (hasil == 0) return mid;
            else if (hasil<0) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }

    void cariNIM(String nim) {
        sortNIM(); 

        int idx = binarySearch(nim);

        if (idx != -1) {
            data[idx].tampilPeminjaman();
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    //Modifikasi B2
    void cariJudul(String judul) {
        for (int i=0; i<idx; i++) {
            if (data[i].buku.judul.equalsIgnoreCase(judul)) {
                data[i].tampilPeminjaman();
            }
        }
    }

    //Modifikasi C2
    void totalLamaPerMahasiswa() {
        for (int i=0; i<idx; i++) {
            boolean sudahDitampil = false;

            for (int k=0; k<i; k++) {
                if (data[i].mhs.nim.equals(data[k].mhs.nim)) {
                    sudahDitampil = true;
                    break;
                }
            }

            if (!sudahDitampil) {
                int total=0;

                for (int j=0; j<idx; j++) {
                    if (data[i].mhs.nim.equals(data[j].mhs.nim)) {
                        total += data[j].lamaPinjam;
                    }
                }
                System.out.println(data[i].mhs.nama +" = " +total +" hari");
            }
        }
    }
}
