
import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
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

        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));

        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));

        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));
    }

    public static void topologicalSort(ArrayList<Edge>[] graph) {
        boolean isVisisted[] = new boolean[graph.length];
        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!isVisisted[i]) {
                topologicalSortUtil(graph, i, isVisisted, result); // modified DFS
            }
        }

        while (!result.isEmpty()) {
            System.out.print(result.pop() + " ");
        }
    }

    public static void topologicalSortUtil(ArrayList<Edge>[] graph, int vertex, boolean[] isVisisted,
            Stack<Integer> result) {
        isVisisted[vertex] = true;

        for (int i = 0; i < graph[vertex].size(); i++) {
            Edge edge = graph[vertex].get(i);
            if (!isVisisted[edge.destination]) {
                topologicalSortUtil(graph, edge.destination, isVisisted, result);
            }
        }

        result.push(vertex);
    }

    public static void main(String[] args) throws Exception {
        // First we create a array of the size of the vertexes
        int vertices = 6;
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[vertices];
        createGraph(graph);

        topologicalSort(graph);
    }
}
