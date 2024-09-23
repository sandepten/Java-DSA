
// Given a ascending sorted array, create a balanced BST (min height) 

public class SortedArrayToBalancedBST {
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

        public static Node balancedBSTBuilder(int[] nodes, int start, int end) {
            if (start > end) {
                return null;
            }
            // make the mid of array as root
            int mid = (start + end) / 2;
            Node root = new Node(nodes[mid]);
            root.left = balancedBSTBuilder(nodes, start, mid - 1);
            root.right = balancedBSTBuilder(nodes, mid + 1, end);
            return root;
        }
    }

    public static void main(String[] args) throws Exception {
        // int[] nodes = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        // Node root = null;
        // for (int i = 0; i < nodes.length; i++) {
        // root = BTree.insert(root, nodes[i]);
        // }
        int[] nodes = { 3, 5, 6, 8, 10, 11, 12 };
        Node root = BTree.balancedBSTBuilder(nodes, 0, nodes.length - 1);
        BTree.inorderPrint(root);
    }
}
