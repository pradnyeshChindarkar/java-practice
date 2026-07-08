package Stacks;

public class StacksArray {
    int arrSize;
    int top;
    int stack[];

    StacksArray(int size) {
        arrSize = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int data) {
        if (top == arrSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
        System.out.println(data + " pushed");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arrSize - 1;
    }

    public static void main(String[] args) {
        StacksArray stack = new StacksArray(5);
        stack.push(3);
        stack.push(19);
        stack.push(34);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
