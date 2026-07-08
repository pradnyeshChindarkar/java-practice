package LinearData;

public class DoublyCircularLL {
    Node head;

    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int d) {
            data = d;
            prev = next = null;
        }
    }

    public void insertEl(int data) {
        Node new_Node = new Node(data);
        if (head == null) {
            head = new_Node;
            head.next = head;
            return;
        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        head.prev = new_Node;
        new_Node.prev = curr;
        new_Node.next = head;
        curr.next = new_Node;
    }

    public void deleteNode(int key) {
        Node curr = head;
        Node prev = null;
        if (head != null && head.data == key) {
            head.prev.next = head.next;
            head = head.next;
            System.out.println(key + " deleted and found!");
            return;
        }

        do {
            curr = curr.next;
            prev = curr.prev;
        } while (curr != head && curr.data != key);

        if (curr == head) {
            System.out.println(key + " key not found!");
            return;
        }
        curr.next.prev = prev;
        prev.next = curr.next;
        System.out.println(key + " found and deleted!");
    }

    public void printList() {
        Node curr = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyCircularLL list = new DoublyCircularLL();
        list.insertEl(32);
        list.insertEl(91);
        list.insertEl(42);
        list.printList();

        list.deleteNode(32);
        list.insertEl(69);
        list.deleteNode(91);
        list.printList();
    }
}
