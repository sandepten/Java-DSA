public class DiameterTree {
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

        public int heightOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public int diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int leftDiameter = diameter(root.left);
            int leftHeight = heightOfTree(root.left);
            int rightDiameter = diameter(root.right);
            int rightHeight = heightOfTree(root.right);

            int selfDiamter = leftHeight + rightHeight + 1;

            return Math.max(selfDiamter, Math.max(leftDiameter, rightDiameter));
        }

        public Info diameterOptimized(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }

            Info left = diameterOptimized(root.left);
            Info right = diameterOptimized(root.right);

            int selfDiamter = left.height + right.height + 1;

            int diameter = Math.max(selfDiamter, Math.max(left.diameter, right.diameter));
            int height = Math.max(left.height, right.height) + 1;
            return new Info(diameter, height);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        System.out.println(tree.diameter(root));
        System.out.println((tree.diameterOptimized(root)).diameter);
    }
}
