package minggu9;

public class StackTugasMhs06 {

    Mahasiswa06[] stack;
    int top;
    int size;

    //konstruktor berparameter: inisialisasi kapasitas maksimum data tugas mhs
    public StackTugasMhs06(int size) {
        this.size = size;
        stack = new Mahasiswa06[size];
        top = -1;
    }

    //isFull: cek tumpukan apakah tumpukan tugas mhs udah penuh
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    //isEmpty: cek apakah tumpukan tugas masih kosong
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    //push: menambahkan elemen/tugas mhs ke tumpukan stack
    public void push (Mahasiswa06 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    //pop: mengeluarkan tugas yang akan dinilai
    public Mahasiswa06 pop() {
        if (!isEmpty()) {
            Mahasiswa06 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    //peek: cek tumpukan teratas
    public Mahasiswa06 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    //print: menampilkan semua daftar tugas
    public void print() {
        for (int i=top; i<=0; i++) {
            System.out.println(stack[i].nama +"\t" +stack[i].nim +"\t" +stack[i].kelas);
        }
        System.out.println("");
    }

    //Modif nomor 4 lihat yg pertama ngumpulin (Percobaan 1)
    public Mahasiswa06 peekBottom() {
        if (!isEmpty()) {
            return stack[0]; //indeks 0: tugas yg pertama masuk
        } else {
            System.out.println("Stack kosong! Tidak ada tugas.");
            return null;
        }
    }

    //Modif nomor 5 lihat jumlah tugas (Percobaan 1)
    public int hitungTugas() {
        return top+1; //top = -1: 0 tugas, top=0: 1 tugas, dst
    }
}
