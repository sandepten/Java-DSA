import java.util.ArrayList;
import java.util.Collections;

public class Kruskal {
    static class Edge implements Comparable<Edge> {
        int source;
        int destination;
        int weight;

        public Edge(int s, int d, int w) {
            this.source = s;
            this.destination = d;
            this.weight = w;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.weight - e2.weight;
        }
    }

    static void createGraph(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 3, 50));
    }

    static int n = 4; // number of vertices
    static int parent[] = new int[n];
    static int rank[] = new int[n];

    public static void makeSet() {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    // we are using path compression optimization
    public static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public static void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        if (xRoot == yRoot) {
            return;
        }

        if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (rank[yRoot] < rank[xRoot]) {
            parent[yRoot] = xRoot;
        } else {
            parent[yRoot] = xRoot;
            rank[xRoot] = rank[xRoot] + 1;
        }
    }

    public static void kruskalMST(ArrayList<Edge> graph, int vertices) {
        makeSet();
        Collections.sort(graph);
        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < vertices - 1; i++) {
            Edge edge = graph.get(i);
            int x = find(edge.source);
            int y = find(edge.destination);

            if (x != y) {
                union(x, y);
                mstCost += edge.weight;
                count++;
            }
        }

        System.out.println("MST Cost: " + mstCost);
    }

    public static void main(String[] args) throws Exception {
        int vertices = 4;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);

        kruskalMST(graph, vertices);
    }
}
