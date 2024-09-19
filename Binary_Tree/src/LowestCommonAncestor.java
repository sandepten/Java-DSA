// provided two nodes n1 and n2, find the lowest common ancestor between them 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LowestCommonAncestor {
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

    static class Info {
        int diameter;
        int height;

        Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    static class BTree {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static boolean getPath(Node root, int target, ArrayList<Node> path) {
            if (root == null) {
                return false;
            }

            path.add(root);
            if (root.data == target) {
                return true;
            }

            boolean foundLeft = getPath(root.left, target, path);
            boolean foundRight = getPath(root.right, target, path);

            if (foundLeft || foundRight) {
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }

        public static int findLowestCommonAncestor(Node root, int n1, int n2) {
            ArrayList<Node> n1Path = new ArrayList<>();
            ArrayList<Node> n2Path = new ArrayList<>();
            getPath(root, n1, n1Path);
            getPath(root, n2, n2Path);

            int i = 0;
            for (; i < n1Path.size() && i < n2Path.size(); i++) {
                if (n1Path.get(i) != n2Path.get(i)) {
                    break;
                }
            }
            return n1Path.get(i - 1).data;
        }

        public static Node efficientLCA(Node root, int n1, int n2) {
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftLca = efficientLCA(root.left, n1, n2);
            Node rightLca = efficientLCA(root.right, n1, n2);

            if (rightLca == null) {
                return leftLca;
            }
            if (leftLca == null) {
                return rightLca;
            }

            return root;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int nodes[] = { 1, 2, -1, 4, -1, 5, -1, 6, -1, -1, 3, -1, -1 };
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(BTree.findLowestCommonAncestor(root, 4, 5));
        System.out.println(BTree.efficientLCA(root, 4, 5).data);
    }
}
