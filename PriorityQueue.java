class Node {
    int key;

    Node(int key) {
        this.key = key;
    }
}

public class PriorityQueue {
    private Node[] heap;
    private int size;
    private int capacity;

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
        heap = new Node[capacity];
        size = 0;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public int min() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila de prioridade está vazia");
        }
        return heap[0].key;
    }

    public void insert(int key) {
        if (size == capacity) {
            throw new IllegalStateException("A fila de prioridade está cheia");
        }
        Node newNode = new Node(key);
        heap[size] = newNode;
        size++;
        upHeap(size - 1);
    }

    public int removeMin() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila de prioridade está vazia");
        }
        int min = heap[0].key;
        heap[0] = heap[size - 1];
        size--;
        downHeap(0);
        return min;
    }

    private void upHeap(int i) {
        while (i > 0 && heap[parent(i)].key > heap[i].key) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    private void downHeap(int i) {
        int smallest = i;
        int left = left(i);
        int right = right(i);

        if (left < size && heap[left].key < heap[smallest].key) {
            smallest = left;
        }

        if (right < size && heap[right].key < heap[smallest].key) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            downHeap(smallest);
        }
    }

    private void swap(int i, int j) {
        Node temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}