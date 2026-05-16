package minggu9;

public class StackSurat06 {
    
    Surat06[] stack;
    int size, top;

    public StackSurat06(int size) {
        this.size = size;
        stack = new Surat06[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat06 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi");
        }
    }

    public Surat06 pop() {
        if (!isEmpty()) {
            Surat06 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk di proses");
            return null;
        }
    }

    public Surat06 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ketemu = false;

        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMhs.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan!");
                System.out.println("ID Surat: " + stack[i].idSurat);
                System.out.println("Nama: " + stack[i].namaMhs);
                System.out.println("Kelas: " + stack[i].kelas);
                System.out.println("Jenis Izin: " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin"));
                System.out.println("Durasi: " + stack[i].durasi + " hari");
                ketemu = true;
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
