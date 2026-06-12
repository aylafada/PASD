package StudiKasus2;

public class DLLPembeli {
    nodePembeli head;
    nodePembeli tail;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(pembeli data) {
        nodePembeli newNode = new nodePembeli(data);

        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public pembeli dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        }

        pembeli dataKeluar = head.data;
        //head = head.next;
        //head = head.next;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return dataKeluar;
    }

    public void printAntrian() {
        if(isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }

        System.out.println("================================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("================================================");
        System.out.printf("%-15s %-20s %-10s\n", "No Antrian", "Nama", "No HP");
        nodePembeli current = head;

        while (current != null) {
            System.out.printf("%-15s %-20s %-10s\n", current.data.noAntrian, current.data.namaPembeli, current.data.noHp);
            current = current.next;
        }

    }
   
}
