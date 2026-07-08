package LinearData;

public class PriorityQueue {
    Node front, rear;

    static class Node {
        int data;
        Node next;
        int priority;

        Node(int d, int p) {
            data = d;
            next = null;
            priority = p;
        }
    }

    public void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);
        if (front == null || front.priority > priority) {
            newNode.next = front;
            front = newNode;
            return;
        }

        Node curr = front;
        while (curr.next != null && curr.next.priority <= priority) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

    }

    public int dequeue() {
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
        System.out.print("Linked List (front --> rear): ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue pQueue = new PriorityQueue();
        pQueue.enqueue(32, 3);
        pQueue.enqueue(22, 2);
        pQueue.enqueue(12, 1);
        pQueue.enqueue(30, 5);
        pQueue.printQueue();
        pQueue.dequeue();
        pQueue.dequeue();
        pQueue.dequeue();
        pQueue.printQueue();
    }
}
