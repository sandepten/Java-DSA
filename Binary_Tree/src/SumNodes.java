public class SumNodes {
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

        public int countSumOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int leftCount = countSumOfTree(root.left);
            int rightCount = countSumOfTree(root.right);

            return leftCount + rightCount + root.data;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        System.out.println(tree.countSumOfTree(root));
    }
}
