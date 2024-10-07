
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
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

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int path;

        public Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }

    public static void dijstraPrint(ArrayList<Edge>[] graph, int source) {
        int dist[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (i != source) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean isVisited[] = new boolean[graph.length];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(source, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!isVisited[curr.node]) {
                isVisited[curr.node] = true;

                // neighbours
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.source;
                    int v = e.destination;
                    int weight = e.weight;

                    if (dist[u] + weight < dist[v]) { // update distance from source to v
                        dist[v] = dist[u] + weight;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        // First we create a array of the size of the vertexes
        int vertices = 6;
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[vertices];
        createGraph(graph);

        int source = 0, destination = 1;
        dijstraPrint(graph, source);
    }
}
