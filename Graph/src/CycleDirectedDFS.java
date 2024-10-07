
import java.util.ArrayList;

public class CycleDirectedDFS {
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

        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));

        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 0, 1));
    }

    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean isVisisted[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!isVisisted[i]) {
                if (isCycleUtil(graph, i, isVisisted, stack)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int vertex, boolean[] isVisisted,
            boolean[] stack) {
        if (stack[vertex]) {
            return true;
        }

        if (isVisisted[vertex]) {
            return false;
        }

        isVisisted[vertex] = true;
        stack[vertex] = true;

        for (int i = 0; i < graph[vertex].size(); i++) {
            if (isCycleUtil(graph, graph[vertex].get(i).destination, isVisisted, stack)) {
                return true;
            }
        }

        stack[vertex] = false;
        return false;
    }

    public static void main(String[] args) throws Exception {
        // First we create a array of the size of the vertexes
        int vertices = 4;
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[vertices];
        createGraph(graph);

        Boolean isVisisted[] = new Boolean[vertices];
        for (int i = 0; i < isVisisted.length; i++) {
            isVisisted[i] = false;
        }

        if (isCycle(graph)) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle detected");
        }
    }
}
