package Stacks;

import java.util.Arrays;

public class OrdinaryQueue {
    int front, rear, size;
    int queue[];

    OrdinaryQueue(int arraySize) {
        size = arraySize;
        queue = new int[arraySize];
        front = rear = -1;
    }

    void enqueue(int data) {
        if (rear == -1) {
            front = 0;
        }
        if (rear > size - 1) {
            System.out.println("Queue Overflow!");
            return;
        }
        queue[++rear] = data;
        System.out.println(data + " inserted!");
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = queue[front++];
        return value;
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    int peek() {
        if (rear == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[rear];
    }

    public static void main(String[] args) {
        OrdinaryQueue queue = new OrdinaryQueue(6);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        System.out.println(queue.peek());
        queue.enqueue(6655);
        queue.enqueue(4);
        System.out.println(queue.peek());

    }
}