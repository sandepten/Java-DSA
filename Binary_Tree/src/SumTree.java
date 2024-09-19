// change the value of the current node to the sum of the left and right subtree 

public class SumTree {
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

        public static void preorderPrint(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorderPrint(root.left);
            preorderPrint(root.right);
        }

        public static int convertToSumTree(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = convertToSumTree(root.left);
            int rightSum = convertToSumTree(root.right);
            int totalSum = leftSum + rightSum;
            int rootData = root.data;
            root.data = totalSum;
            return totalSum + rootData;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 7, -1, -1, 6, -1, -1 };
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        BTree.convertToSumTree(root);
        BTree.preorderPrint(root);
    }
}
