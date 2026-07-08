package LinearData;

public class QueueLL {

    private Node front, rear;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void enqueue(int d) {
        Node new_node = new Node(d);
        if (front == null) {
            front = rear = new_node;
            return;
        }
        rear.next = new_node;
        rear = new_node;
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

    public int peek(){
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }

    public void printQueue(){
        Node curr = front;
        System.out.print("Linked List: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(32);
        q.enqueue(41);
        q.printQueue();
        q.dequeue();
        q.printQueue();

    }
}
