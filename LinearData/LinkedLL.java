package LinearData;

public class LinkedLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insert(int d) {
        Node new_node = new Node(d);
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

    public boolean deleteByKey(int key) {
        Node prev = null;
        Node curr = head;

        if (curr != null && curr.data == key) {
            head = curr.next;
            System.out.println(key + " found and deleted!");
            return true;
        }
        // else if (curr.next != null) {
        // prev = curr;
        // curr = curr.next;
        // // System.out.println(prev.data);
        // while (curr != null) {
        // if (curr.data == key) {
        // System.out.println(key + " found and deleted!");
        // prev.next = curr.next;
        // return true;
        // }
        // prev = curr;
        // curr = prev.next;
        // }
        // }


        // Case 2: key is somewhere after head
        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        // Case 3: key not found
        if (curr == null) {
            System.out.println(key + " not found!");
            return false;
        }

        // Key found: unlink node
        prev.next = curr.next;
        System.out.println(key+" found and deleted!");
        return true;
    }

    public static void main(String[] args) {
        LinkedLL ll = new LinkedLL();
        ll.insert(2);
        ll.insert(23);
        ll.insert(44);
        ll.insert(887);
        ll.insert(37);
        ll.insert(57);
        ll.insert(137);

        ll.printList();
        ll.deleteByKey(912);
        ll.deleteByKey(40);
        ll.deleteByKey(37);
        ll.insert(577);
        ll.deleteByKey(37);
        ll.printList();

    }
}