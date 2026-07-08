package LinearData;

public class DequeLL {
    Node front, rear;

    static class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            prev = next = null;
        }
    }

    public void insertRear(int d) {
        Node new_node = new Node(d);
        if (rear == null) {
            front = rear = new_node;
            return;
        }
        rear.next = new_node;
        new_node.prev = rear;
        rear = new_node;
    }

    public void insertFront(int d) {
        Node new_node = new Node(d);
        if (front == null) {
            front = rear = new_node;
            return;
        }
        new_node.next = front;
        front.prev = new_node;
        front = new_node;
    }

    public int removeRear() {
        if (rear == null) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int value = rear.data;

        rear = rear.prev;
        if (rear == null) {
            front = null;
        } else {
            rear.next = null;
        }
        return value;
    }

    public int removeFront() {
        if (front == null) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return value;
    }

    public void printQueue() {
        Node curr = front;
        System.out.print("Linked List: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DequeLL dequeLL = new DequeLL();
        dequeLL.insertFront(213);
        dequeLL.insertRear(44);
        dequeLL.insertFront(42);
        dequeLL.insertFront(33);
        dequeLL.removeRear();
        dequeLL.removeFront();
        dequeLL.removeFront();
        dequeLL.printQueue();
    }
}
