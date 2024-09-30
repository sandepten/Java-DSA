import java.sql.Array;
import java.util.ArrayList;

public class Search {
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
    }

    public static void main(String[] args) throws Exception {
        int[] nodes = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = BTree.insert(root, nodes[i]);
        }
        BTree.search(root, 1);
    }
}