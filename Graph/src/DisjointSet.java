
public class DisjointSet {
    static int n = 7;
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

    public static void main(String[] args) throws Exception {
        makeSet();
        union(1, 3);
        System.out.println("Parent of 3: " + find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println("Parent of 3: " + find(3));
        System.out.println("Parent of 4: " + find(4));
        union(1, 5);
    }
}
