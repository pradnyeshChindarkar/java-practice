package LinearData;

public class DoublyLL {
    Node head = null;

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
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            last.next.prev = last;
        }
    }

    public void printListForw() {
        Node curr = head;
        System.out.print("Linked List Forward: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void printListBackw() {
        Node curr = head;
        if (curr == null)
            return;

        while (curr.next != null) {
            curr = curr.next;
        }

        System.out.print("Linked List Backward: ");

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertEl(33);
        list.insertEl(53);
        list.insertEl(98);
        list.insertEl(90);
        list.printListForw();
        list.printListBackw();

    }
}
