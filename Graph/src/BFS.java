import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
  }

  public static void bfsTraverser(ArrayList<Edge>[] graph) {
    Queue<Integer> queue = new LinkedList<>();
    Boolean isVisisted[] = new Boolean[graph.length];
    for (int i = 0; i < isVisisted.length; i++) {
      isVisisted[i] = false;
    }
    queue.add(0);

    while (!queue.isEmpty()) {
      int curr = queue.remove();

      if (!isVisisted[curr]) {
        System.out.print(curr + " ");
        isVisisted[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
          queue.add(graph[curr].get(i).destination);
        }
      }
    }
  }

  public static void main(String[] args) throws Exception {
    // First we create a array of the size of the vertexes
    int vertices = 5;
    ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[vertices];
    createGraph(graph);

    bfsTraverser(graph);
  }
}
