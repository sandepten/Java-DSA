
// Mirror a given BST (where the left subtree becomes the right and vice versa)

public class Mirror {
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

        public static Node mirrorer(Node root) {
            if (root == null) {
                return root;
            }
            Node leftSubtree = mirrorer(root.left);
            Node rightSubtree = mirrorer(root.right);
            root.left = rightSubtree;
            root.right = leftSubtree;
            return root;
        }
    }

    public static void main(String[] args) throws Exception {
        int[] nodes = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = BTree.insert(root, nodes[i]);
        }
        BTree.inorderPrint(root);
        System.out.println();
        BTree.mirrorer(root);
        BTree.inorderPrint(root);
        System.out.println();
    }
}
