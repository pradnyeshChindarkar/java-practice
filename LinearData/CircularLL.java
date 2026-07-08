package LinearData;

public class CircularLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertEl(int data) {
        Node new_Node = new Node(data);
        if (head == null) {
            head = new_Node;
            new_Node.next = head;
            return;
        }

        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = new_Node;
        new_Node.next = head;
    }

    public void printList() {
        Node curr = head;
        System.out.println("Circular Linked List: ");
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLL cc = new CircularLL();
        cc.insertEl(32);
        cc.insertEl(12);
        cc.insertEl(62);
        cc.insertEl(412);
        cc.insertEl(432);
        cc.printList();
    }
}
