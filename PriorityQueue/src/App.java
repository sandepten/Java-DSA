import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for the reverse order i.e. descending
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3); // O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            // both peek and remove - do operations on the higest priority element
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(log n)
        }
    }
}
