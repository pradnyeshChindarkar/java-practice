package BinaryTree;

public class CreateBST {
    static class Node {
        Node left, right;
        int data;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    Node root; // (Root Node) ==> Node head;

    CreateBST() {
        root = null;
    }

    Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            System.out.println("root: "+root.data);
            return root;
        }

        if (root.data > data) {
            root.left = insertNode(root.left, data);
        } else if (root.data < data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    void insertData(int key){
        root = insertNode(root, key);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        CreateBST bst = new CreateBST();
        bst.insertData(28);
        bst.insertData(8);
        
        System.out.println("BST Created successfully!");
    }
}
