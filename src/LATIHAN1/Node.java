package LATIHAN1;

public class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static class BinaryTree {
        public Node root;

        public BinaryTree() {
            root = null;
        }

        public void addRoot(int data) {
            root = new Node(data);
        }


        public void inOrder(Node node) {
            if (node != null) {
                inOrder(node.left);
                System.out.print(node.data + " ");
                inOrder(node.right);
            }
        }


        public void preOrder(Node node) {
            if (node != null) {
                System.out.print(node.data + " ");
                preOrder(node.left);
                preOrder(node.right);
            }
        }


        public void postOrder(Node node) {
            if (node != null) {
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(node.data + " ");
            }
        }

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();

            tree.addRoot(20); // Root
            tree.root.left = new Node(2);
            tree.root.right = new Node(25);
            tree.root.left.left = new Node(37);
            tree.root.left.right = new Node(12);
            tree.root.right.right = new Node(16);

            System.out.println("\nPre Order: ");
            tree.preOrder(tree.root);
            System.out.println("\nIn Order: ");
            tree.inOrder(tree.root);
            System.out.println("\nPost Order: ");
            tree.postOrder(tree.root);
        }
    }
}
