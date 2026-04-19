public class DataPeminjaman {
    Peminjaman[] data = new Peminjaman[5];
    int idx = 0;

    //tambah data
    void tambah (Peminjaman p) {
        if (idx<data.length) {
            data [idx] = p;
            idx++;
        }
    }

    //tampil data
    void tampil () {
        for (int i = 0; i<idx; i++) {
            data[i].tampilPeminjaman();
        }
    }

    //Insertion Sort (denda terbesar)
    void insertionSortDenda() {
        for (int i = 1; i<idx; i++) {
            Peminjaman temp = data [i];
            int j = i-1;

            while (j >= 0 && data[j].denda < temp.denda) {
                data [j+1] = data[j];
                j--;
            } 
            data[j+1] = temp;
        }
    }

    // sorting 
    void sortNIM() {
        for (int i = 1; i < idx; i++) {
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
        int left = 0, right = idx - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int hasil = data[mid].mhs.nim.compareTo(nim);

            if (hasil == 0) return mid;
            else if (hasil < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // cari data
    void cariNIM(String nim) {
        sortNIM(); //sebelum binary di sorting dl

        int idx = binarySearch(nim);

        if (idx != -1) {
            data[idx].tampilPeminjaman();
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
