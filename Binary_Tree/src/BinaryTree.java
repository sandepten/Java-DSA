public class BinaryTree {
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

        public static void preorderPrint(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorderPrint(root.left);
            preorderPrint(root.right);
        }

        public static void inorderPrint(Node root) {
            if (root == null) {
                return;
            }
            inorderPrint(root.left);
            System.out.print(root.data + " ");
            inorderPrint(root.right);
        }

        public void postOrderPrint(Node root) {
            if (root == null) {
                return;
            }
            postOrderPrint(root.left);
            postOrderPrint(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        tree.postOrderPrint(root);
    }
}
