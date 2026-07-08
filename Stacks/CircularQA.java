package Stacks;

public class CircularQA {
    int rear, front, arraySize;
    int queue[];

    CircularQA(int size) {
        arraySize = size;
        rear = front = -1;
        queue = new int[size];
    }

    void insertion(int data) {
        if ((rear + 1) % arraySize == front) {
            System.out.println("Queue Overflow!");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % arraySize;
        }
        queue[rear] = data;

    }

    void display() {
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % arraySize;
        }
        System.out.println();
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % arraySize;
        }
        return 1;
    }

    int peek(){
        return queue[rear];
    }

    public static void main(String[] args) {
        CircularQA queue = new CircularQA(5);
        queue.insertion(4);
        queue.insertion(352);
        queue.insertion(53);
        queue.insertion(12);
        queue.insertion(59);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.insertion(593);
        queue.display();
        System.out.println(queue.peek());
    }
}
