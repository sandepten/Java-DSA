// Given a range, print the nodes between that range

import java.util.ArrayList;

public class RootToLeafPaths {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BTree {
        public static void inorderPrint(Node root) {
            if (root == null) {
                return;
            }
            inorderPrint(root.left);
            System.out.print(root.data + " ");
            inorderPrint(root.right);
        }

        public static Node insert(Node root, int val) {
            if (root == null) {
                return new Node(val);
            }
            if (val < root.data) {
                root.left = insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }
            return root;
        }

        public static void search(Node root, int target) {
            if (root == null) {
                System.out.println("Not Found");
                return;
            }
            if (root.data == target) {
                System.out.println("Target Found");
                return;
            }
            if (target < root.data) {
                search(root.left, target);
            } else {
                search(root.right, target);
            }
        }

        public static void printPath(ArrayList<Node> path) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i).data + " ");
            }
            System.out.println();
        }

        public static void rootLeafPaths(Node root, ArrayList<Node> path) {
            if (root == null) {
                return;
            }
            path.add(root);
            if (root.left == null && root.right == null) {
                printPath(path);
            }
            rootLeafPaths(root.left, path);
            rootLeafPaths(root.right, path);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        int[] nodes = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = BTree.insert(root, nodes[i]);
        }
        ArrayList<Node> path = new ArrayList<>();
        BTree.rootLeafPaths(root, path);
        System.out.println();
    }
}
