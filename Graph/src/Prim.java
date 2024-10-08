
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prim {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int s, int d, int w) {
            this.source = s;
            this.destination = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        // initialize empty arraylists at the indexes
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void prims(ArrayList<Edge>[] graph) {
        int vertices = graph.length;
        boolean visited[] = new boolean[vertices];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0; // MST cost / total min weight

        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            int node = pair.node;
            int cost = pair.cost;

            if (visited[node]) {
                continue;
            }

            visited[node] = true;
            finalCost += cost;

            for (Edge edge : graph[node]) {
                if (!visited[edge.destination]) {
                    pq.add(new Pair(edge.destination, edge.weight));
                }
            }
        }

        System.out.println("Minimum cost of the MST: " + finalCost);
    }

    public static void main(String[] args) throws Exception {
        // First we create a array of the size of the vertexes
        int vertices = 4;
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[vertices];
        createGraph(graph);

        prims(graph);
    }
}
