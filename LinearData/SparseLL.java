package LinearData;

public class SparseLL {
    Node head;

    static class Node {
        int row;
        int col;
        int data;
        Node next;

        Node(int r, int c, int d) {
            row = r;
            col = c;
            data = d;
            next = null;
        }
    }

    public void insert(int row, int col, int data) {
        Node new_node = new Node(row, col, data);
        if (head == null) {
            head = new_node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void printList() {
        Node curr = head;
        System.out.print("Linked List: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SparseLL list = new SparseLL();
        int sparseMatrix[][] = {
                { 0, 0, 3, 0, 4 },
                { 0, 0, 5, 7, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 2, 6, 0, 0 }
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (sparseMatrix[i][j] != 0) {
                    list.insert(i, j, sparseMatrix[i][j]);
                }
            }
        }

        list.printList();
    }
}
