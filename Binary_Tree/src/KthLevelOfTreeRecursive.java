// given value of level, print the nodes in the current level of the tree

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class KthLevelOfTreeRecursive {
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

        public static void kthLevelPrint(Node root, int level, int currLevel) {
            if (root == null) {
                return;
            }
            if (currLevel == level) {
                System.out.print(root.data + " ");
            }
            kthLevelPrint(root.left, level, currLevel + 1);
            kthLevelPrint(root.right, level, currLevel + 1);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int nodes[] = { 1, 2, -1, 4, -1, 5, -1, 6, -1, -1, 3, -1, -1 };
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        BTree.kthLevelPrint(root, 3, 1);
    }
}
