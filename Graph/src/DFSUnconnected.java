
import java.util.ArrayList;

public class DFSUnconnected {
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

        // 0 vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 vertex
        graph[1].add(new Edge(1, 1, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 2, 2));

        // 5 vertex
        graph[5].add(new Edge(5, 6, 2));

        // 6 vertexe
        graph[6].add(new Edge(6, 5, 2));
    }

    public static void dfsTraverser(ArrayList<Edge>[] graph, Boolean[] isVisisted,
            Integer vertex) {
        System.out.print(vertex + " ");
        isVisisted[vertex] = true;

        for (int i = 0; i < graph[vertex].size(); i++) {
            Integer currVertex = graph[vertex].get(i).destination;
            if (!isVisisted[currVertex]) {
                dfsTraverser(graph, isVisisted, currVertex);
            }
        }
    }

    public static void dfsTraverserUtil(ArrayList<Edge>[] graph, Boolean[] isVisisted) {
        for (int i = 0; i < graph.length; i++) {
            if (!isVisisted[i]) {
                dfsTraverser(graph, isVisisted, i);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // First we create a array of the size of the vertexes
        int vertices = 7;
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[vertices];
        createGraph(graph);

        Boolean isVisisted[] = new Boolean[vertices];
        for (int i = 0; i < isVisisted.length; i++) {
            isVisisted[i] = false;
        }
        // dfsTraverser(graph, isVisisted, 0);
        dfsTraverserUtil(graph, isVisisted);
    }
}
