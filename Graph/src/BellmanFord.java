
import java.util.ArrayList;

public class BellmanFord {
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

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
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

    public static void bellmanFordFinder(ArrayList<Edge>[] graph, int source) {
        int dist[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (i != source) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < graph.length - 1; i++) {
            for (int j = 0; j < graph.length; j++) {
                for (Edge edge : graph[j]) {
                    // Relaxation
                    if (dist[edge.source] != Integer.MAX_VALUE
                            && dist[edge.source] + edge.weight < dist[edge.destination]) {
                        dist[edge.destination] = dist[edge.source] + edge.weight;
                    }
                }
            }
        }

        for (int i = 0; i < graph.length; i++) {
            System.out.println("Distance from " + source + " to " + i + " is " + dist[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        // First we create a array of the size of the vertexes
        int vertices = 6;
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[vertices];
        createGraph(graph);

        int source = 0;
        bellmanFordFinder(graph, source);
    }
}
