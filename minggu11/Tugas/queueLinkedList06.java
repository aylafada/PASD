package minggu11.Tugas;

public class queueLinkedList06 {
    node06 front;
    node06 rear;
    int size;

    public queueLinkedList06() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(mahasiswa06 data) {
        node06 temp = new node06(data);
        if(isEmpty()) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    public mahasiswa06 dequeue() {
        if(isEmpty()) {
            return null;
        }
        mahasiswa06 keluar = front.data;
        front = front.next;
        if(front == null) {
            rear = null;
        }
        size--;
        return keluar;
    }

    public void peekFront() {
        if(isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan: ");
            front.data.tampil();
        }
    }

    public void peekRear() {
        if(isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling akhir: ");
            rear.data.tampil();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian: " +size);
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        node06 temp = front;
        System.out.println("\nDaftar antrian");
        while(temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }
    }
}
