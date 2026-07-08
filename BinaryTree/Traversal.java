package BinaryTree;

public class Traversal {
    static class Node {
        Node right, left;
        int data;

        Node(int value) {
            data = value;
            right = left = null;
        }
    }

    Node root;

    Traversal() {
        root = null;
    }

    Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (root.data > key) {
            root.left = insertNode(root.left, key);
        } else if (root.data < key) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    void insertData(int key) {
        root = insertNode(root, key);
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    void preorder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }

    }

    int search(Node root) {
        if (root.right == null) {
            return root.data;
        }
        return search(root.right);
    }

    void searchLargest() {
        System.out.println(search(root));
    }

    int searchSmall(Node root) {
        if (root.left == null) {
            return root.data;
        }
        return search(root.left);
    }

    void searchSmallest() {
        System.out.println(searchSmall(root));
        System.out.println("Count: " + counting(root));
    }

    int counting(Node root) {
        if (root == null) {
            return 0;
        }
        return counting(root.left) + counting(root.right) + 1;
    }

    public static void main(String[] args) {
        Traversal trav = new Traversal();
        trav.insertData(50);
        trav.insertData(30);
        trav.insertData(70);
        trav.insertData(20);
        trav.insertData(40);
        trav.insertData(60);
        trav.insertData(80);
        trav.searchLargest();

        trav.searchSmallest();
    }
}
