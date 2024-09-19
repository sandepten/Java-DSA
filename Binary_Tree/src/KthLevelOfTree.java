// given value of level, print the nodes in the current level of the tree

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class KthLevelOfTree {
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

        static class Info {
            Node node;
            int hd; // horizontal distance

            public Info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root, int level) {
            Queue<Info> q = new LinkedList<>();

            q.add(new Info(root, 0));
            q.add(null);
            int currLevel = 1;
            if (level == 1) {
                System.out.println(root.data);
                return;
            }
            while (!q.isEmpty()) {
                Info curr = q.remove();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        currLevel++;
                        q.add(null);
                    }
                } else {
                    if (curr.node.left != null) {
                        q.add(new Info(curr.node.left, curr.hd - 1));
                    }
                    if (curr.node.right != null) {
                        q.add(new Info(curr.node.right, curr.hd + 1));
                    }
                    if (level == currLevel) {
                        System.out.print(curr.node.data + " ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int nodes[] = { 1, 2, -1, 4, -1, 5, -1, 6, -1, -1, 3, -1, -1 };
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        BTree.topView(root, 3);
    }
}
