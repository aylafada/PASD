package minggu10P2;

public class AntrianLayanan06 {

    //atribut-atribut queue
    Mahasiswa06[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan06 (int n) {
        this.max = n;
        this.data = new Mahasiswa06[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    //isEmpty
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    //isFull
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    //peek
    public void lihatTerdepan () {
        if(isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if(isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian paling belakang: ");
            data[rear].tampilkanData();
        }
    }

    //print
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        } 
        System.out.println("Daftar mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i=0; i<size; i++) {
            int index = (front+i) % max;
            System.out.print((i+1) +". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    //clear
    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    //enqueue
    public void tambahAntrian(Mahasiswa06 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear+1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama +" berhasil masuk ke antrian");
    }

    //dequeue
    public Mahasiswa06 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } 
        Mahasiswa06 mhs = data[front];
        front = (front+1) % max;
        size--;
        return mhs;
    }

}

