// Delete a node from the BST
// Case 1: No children - just point the parent to null
// Case 2: 1 Child - point the parent to the child
// Case 3: 2 Child - replace value with inorder successor and delete the successor (inorder successor is the left most node in the right subtree and it always has 0 or 1 child)

public class DeleteNode {
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

        public static Node inorderSuccessorFinder(Node root) {
            if (root.left == null) {
                return root;
            }
            return inorderSuccessorFinder(root.left);
        }

        public static Node delete(Node root, int target) {
            if (target < root.data) {
                root.left = delete(root.left, target);
            } else if (target > root.data) {
                root.right = delete(root.right, target);
            } else {
                // case 1 - leaf node
                if (root.left == null && root.right == null) {
                    return null;
                }

                // case 2 - single child
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                // case 3 - two children
                Node IS = inorderSuccessorFinder(root.right); // left most node in the right subtree
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
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
        BTree.delete(root, 6);
        BTree.inorderPrint(root);
        System.out.println();
    }
}
