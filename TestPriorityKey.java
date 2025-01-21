public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(10);

        pq.insert(15);
        pq.insert(10);
        pq.insert(20);
        pq.insert(5);

        System.out.println("Min: " + pq.min()); // Deve imprimir 5
        System.out.println("Remove Min: " + pq.removeMin()); // Deve imprimir 5
        System.out.println("Min: " + pq.min()); // Deve imprimir 10
        pq.insert(2);
        System.out.println("Min: " + pq.min()); // Deve imprimir 2
        System.out.println("Size: " + pq.getSize()); // Deve imprimir 4
        System.out.println("Is Empty: " + pq.isEmpty()); // Deve imprimir false

        // Teste de capacidade máxima
        for (int i = 0; i < 10; i++) {
            if (pq.getSize() < pq.capacity) {
                pq.insert(i);
            } else {
                System.out.println("A fila de prioridade está cheia"); // Deve imprimir quando a capacidade for atingida
                break;
            }
        }

        // Teste de remoção de um elemento de uma fila vazia
        PriorityQueue emptyPQ = new PriorityQueue(10);
        if (emptyPQ.isEmpty()) {
            System.out.println("A fila de prioridade está vazia"); // Deve imprimir quando a fila estiver vazia
        } else {
            emptyPQ.removeMin();
        }

        // Teste de obtenção do menor elemento de uma fila vazia
        if (emptyPQ.isEmpty()) {
            System.out.println("A fila de prioridade está vazia"); // Deve imprimir quando a fila estiver vazia
        } else {
            emptyPQ.min();
        }

        // Teste de métodos auxiliares
        System.out.println("Parent of 1: " + pq.parent(1)); // Deve imprimir 0
        System.out.println("Left of 0: " + pq.left(0)); // Deve imprimir 1
        System.out.println("Right of 0: " + pq.right(0)); // Deve imprimir 2
    }
}