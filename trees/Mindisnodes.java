public class Mindisnodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftFound = lca(root.left, n1, n2);
        Node rightFound = lca(root.right, n1, n2);

        if (leftFound == null) {
            return rightFound;
        }
        if (rightFound == null) {
            return leftFound;
        }
        return root;
    }

    public static int dist(Node root, int value) {
        if (root == null) {
            return -1;
        }
        if (root.data == value) {
            return 0;
        }

        int left = dist(root.left, value);
        if (left != -1) {
            return left + 1;
        }

        int right = dist(root.right, value);
        return right == -1 ? -1 : right + 1;
    }

    public static int min_dis_btw_node(Node root, int n1, int n2) {
        Node ancestor = lca(root, n1, n2);
        if (ancestor == null) {
            return -1;
        }

        int distance1 = dist(ancestor, n1);
        int distance2 = dist(ancestor, n2);
        if (distance1 == -1 || distance2 == -1) {
            return -1;
        }
        return distance1 + distance2;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(min_dis_btw_node(root, 4, 6));
    }
}
