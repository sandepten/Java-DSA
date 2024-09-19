// given two nodes, find the minimum distance between them 

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MinDistanceBetweenNodes {
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

        public static Node lca(Node root, int n1, int n2) {
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftLca = lca(root.left, n1, n2);
            Node rightLca = lca(root.right, n1, n2);

            if (rightLca == null) {
                return leftLca;
            }
            if (leftLca == null) {
                return rightLca;
            }

            return root;
        }

        public static int distanceBetweenNodes(Node root, int target, int distance) {
            if (root == null) {
                return 0;
            }

            if (root.data == target) {
                return distance;
            }
            int leftDistance = distanceBetweenNodes(root.left, target, distance + 1);
            int rightDistance = distanceBetweenNodes(root.right, target, distance + 1);

            return leftDistance > 0 ? leftDistance : rightDistance;
        }

        public static int minDistance(Node root, int n1, int n2) {
            Node lca = lca(root, n1, n2);

            int n1Distance = distanceBetweenNodes(lca, n1, 0);
            int n2Distance = distanceBetweenNodes(lca, n2, 0);

            return n1Distance + n2Distance;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int nodes[] = { 1, 2, -1, 4, -1, 5, -1, 6, -1, -1, 3, -1, -1 };
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        System.out.println(BTree.minDistance(root, 4, 6));
    }
}
