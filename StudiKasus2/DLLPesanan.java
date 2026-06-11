package StudiKasus2;

public class DLLPesanan {
    nodePesanan head, tail;
    int size;

    public DLLPesanan() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    //enqueue
    public void tambahPesanan(pesanan data) {
        nodePesanan newNode = new nodePesanan(data);

        if(isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void sorting() {
        if (isEmpty() || head == tail) {
            return;
        }
        boolean swap;
        do { 
            swap = false;
            nodePesanan current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swap = true;
                }
                current = current.next;
            } 
        } while(swap);
    }

    void print() {
        if(isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }
        System.out.println("========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("========================================");
        System.out.printf("%-10s %-20s %-10s\n", "Kode", "Nama Pesanan", "Harga");
        nodePesanan current = head;
        while (current != null) {
            System.out.printf("%-10d %-20s %-10d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            current = current.next;
        }
    }

}
