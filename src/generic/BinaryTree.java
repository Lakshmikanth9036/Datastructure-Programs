package generic;

public class BinaryTree<T extends Comparable<T>> {

    private Node<T> root;

    private static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        Node(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void insert(T data) {
        root = insertRecursive(root, data);
    }

    private Node<T> insertRecursive(Node<T> current, T data) {
        if (current == null) {
            return new Node<>(data);
        }

        if (data.compareTo(current.data) < 0) {
            current.left = insertRecursive(current.left, data);
        } else if (data.compareTo(current.data) > 0) {
            current.right = insertRecursive(current.right, data);
        } else {
            // Duplicate values are not allowed
        }

        return current;
    }

    public boolean containsNode(T data) {
        return findNode(root, data);
    }

    private boolean findNode(Node<T> current, T data) {
        if (current == null) {
            return false;
        }

        if (data.compareTo(current.data) == 0) {
            return true;
        }

        return data.compareTo(current.data) < 0 ?
                findNode(current.left, data) : findNode(current.right, data);
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(Node<T> current) {
        if (current != null) {
            inOrderTraversalRecursive(current.left);
            System.out.print(current.data + " ");
            inOrderTraversalRecursive(current.right);
        }
    }

    public void preOrderTraversal() {
        preOrderTraversalRecursive(root);
    }

    private void preOrderTraversalRecursive(Node<T> current) {
        if (current != null) {
            System.out.print(current.data + " ");
            preOrderTraversalRecursive(current.left);
            preOrderTraversalRecursive(current.right);
        }
    }

    public void postOrderTraversal() {
        postOrderTraversalRecursive(root);
    }

    private void postOrderTraversalRecursive(Node<T> current) {
        if (current != null) {
            postOrderTraversalRecursive(current.left);
            postOrderTraversalRecursive(current.right);
            System.out.print(current.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        System.out.println("In-order traversal:");
        tree.inOrderTraversal();
        System.out.println();

        System.out.println("Pre-order traversal:");
        tree.preOrderTraversal();
        System.out.println();

        System.out.println("Post-order traversal:");
        tree.postOrderTraversal();
        System.out.println();

        System.out.println("Does the tree contain 6? " + tree.containsNode(6));
        System.out.println("Does the tree contain 10? " + tree.containsNode(10));
    }
}
