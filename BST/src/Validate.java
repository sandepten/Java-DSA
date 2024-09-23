
// validate BST
// Approach 1 - Inorder print of the tree and check if its sorted or not
// Approach 2 - Check if max value in left subtree (inorder predessessor) < node and min value in right subtree > node (inorder successor)
import java.util.ArrayList;

public class Validate {
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

        public static boolean isValidBST(Node root, Node min, Node max) {
            if (root == null) {
                return true;
            }
            if (min != null && root.data <= min.data) {
                return false;
            } else if (max != null && root.data >= max.data) {
                return false;
            }

            return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
        }

    }

    public static void main(String[] args) throws Exception {
        int[] nodes = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = BTree.insert(root, nodes[i]);
        }
        System.out.println(BTree.isValidBST(root, null, null));
    }
}
