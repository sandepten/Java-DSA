// Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise
public class SubtreeOfAnotherTree {
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

        public int[] destructureTree(Node root) {
            if (root == null) {
                return new int[-1];
            }
            int[] leftArray = destructureTree(root.left);
            int[] rightArray = destructureTree(root.right);

            return new int[];
        }

        public boolean subTreeFinder(Node root, Node subRoot) {
            int nodes[] = destructureTree(root);
            int subNodes[] = destructureTree(subRoot);

            return false;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);

        int subNodes[] = { 2, 4, -1, -1, 5, -1, -1 };
        BTree subTree = new BTree();
        Node subRoot = subTree.buildTree(subNodes);
    }
}
