package minggu10.Tugas;

public class AntrianKRS {
    Mahasiswa06[] data;
    int front, rear, size, max, jumlahDiproses;

    public AntrianKRS(int max) {
        this.max = max;
        data = new Mahasiswa06[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    // 1. kosong?
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    //2. penuh?
    public boolean isFull() {
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    //3. clear
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    //4. enqueue
    public void tambahAntrian(Mahasiswa06 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
        } else{
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max-1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = mhs;
            size++;
        }
    }

    //5. layani 2 mhs
    public void layani() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        } 

        int jumlah;
        if (size>= 2) {
            jumlah = 2;
        } else {
            jumlah = size;
        }

        for (int i =0; i<jumlah; i++) {
            Mahasiswa06 mhs = data[front];
            mhs.tampilData();
            front = (front+1) % max;
            size--;
            jumlahDiproses++;
        }
    }

    //6. print all
    public void print() {
        if(isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Daftar mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - KELAS - PRODI");
        for (int i=0; i<size; i++) {
            int index = (front+i) % max;
            System.out.print((i+1) +". ");
            data[index].tampilData(); 
        }
    }

    //7. tampil 2 terdepan
    public void tampil2Terdepan() {
        if(isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("2 Antrian terdepan: ");
        int jumlah;
        if (size >= 2) {
            jumlah = 2;
        } else {
            jumlah = size;
        }

        for (int i = 0; i<jumlah; i++) {
            int index = (front+i) % max;
            data[index].tampilData();
        }
    }

    //8. print paling belakang
    public void lihatAkhir() {
        if(isEmpty()) {
            System.out.println("Antrian Kosong");
            // return;
        } else {
            System.out.println("Antrian paling belakang: ");
            data[rear].tampilData();
        }
    }

    //jumlah antrian
    public void jumlahAntrian() {
        System.out.println("Jumlah antrian: " +size);
    }

    //jumlah proses
     public void jumlahDiproses() {
        System.out.println("Jumlah mahasiswa sudah proses KRS: " +jumlahDiproses);
    }

    //belum proses
    public void belumProses() {
        int totalMahasiswa = 30;
        System.out.println("Mahasiswa yang belum proses KRS: " +(totalMahasiswa-jumlahDiproses));
    }
}
