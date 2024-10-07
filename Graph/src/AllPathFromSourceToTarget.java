
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AllPathFromSourceToTarget {
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

        graph[0].add(new Edge(0, 3, 1));
        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));

        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));

        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));
    }

    public static void pathsFromSourceToTargetPrint(ArrayList<Edge>[] graph, int source, int destination, String path) {
        if (source == destination) {
            System.out.println(path + destination);
            return;
        }

        for (int i = 0; i < graph[source].size(); i++) {
            Edge curr = graph[source].get(i);
            pathsFromSourceToTargetPrint(graph, curr.destination, destination, path + source);
        }
    }

    public static void main(String[] args) throws Exception {
        // First we create a array of the size of the vertexes
        int vertices = 6;
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[vertices];
        createGraph(graph);

        int source = 5, destination = 1;

        pathsFromSourceToTargetPrint(graph, source, destination, "");
    }
}
