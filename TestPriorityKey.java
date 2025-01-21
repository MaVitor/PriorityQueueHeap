public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(10);

        // Teste de inserção e min
        pq.insert(5);
        assert pq.min() == 5 : "Erro: min() deveria retornar 5";

        pq.insert(3);
        assert pq.min() == 3 : "Erro: min() deveria retornar 3";

        pq.insert(8);
        assert pq.min() == 3 : "Erro: min() deveria retornar 3";

        // Teste de remoção do mínimo
        assert pq.removeMin() == 3 : "Erro: removeMin() deveria retornar 3";
        assert pq.min() == 5 : "Erro: min() deveria retornar 5";

        assert pq.removeMin() == 5 : "Erro: removeMin() deveria retornar 5";
        assert pq.min() == 8 : "Erro: min() deveria retornar 8";

        assert pq.removeMin() == 8 : "Erro: removeMin() deveria retornar 8";
        assert pq.isEmpty() : "Erro: a fila de prioridade deveria estar vazia";

        System.out.println("Todos os casos de teste passaram!");
    }
}