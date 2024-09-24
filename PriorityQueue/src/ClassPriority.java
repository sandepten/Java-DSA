import java.util.PriorityQueue;

public class ClassPriority {
    public class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) throws Exception {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Sandeep", 1)); // O(log n)
        pq.add(new Student("Sanjana", 10));
        pq.add(new Student("Shivani", 5));

        while (!pq.isEmpty()) {
            // both peek and remove - do operations on the higest priority element
            System.out.println(pq.peek().name); // O(1)
            pq.remove(); // O(log n)
        }
    }
}
