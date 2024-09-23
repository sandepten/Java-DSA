// Given a range, print the nodes between that range

public class RangePrinter {
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

        public static void printRange(Node root, int start, int end) {
            if (root == null) {
                return;
            }
            if (start <= root.data && end > root.data) {
                printRange(root.left, start, end);
                System.out.print(root.data + " ");
                printRange(root.right, start, end);
            } else if (end < root.data) {
                printRange(root.right, start, end);
            } else {
                printRange(root.left, start, end);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int[] nodes = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = BTree.insert(root, nodes[i]);
        }
        BTree.printRange(root, 4, 11);
        System.out.println();
    }
}
