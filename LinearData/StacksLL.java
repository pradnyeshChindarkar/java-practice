package LinearData;

public class StacksLL {
    Node top;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int d) {
        Node new_node = new Node(d);
        new_node.next = top;
        top = new_node;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    public void printStack() {
        Node curr = top;
        System.out.print("Stack: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StacksLL stackLL = new StacksLL();
        stackLL.push(92); 
        stackLL.push(37); 
        stackLL.push(72); 
        stackLL.push(41); 
        stackLL.printStack();
        stackLL.pop();
        stackLL.printStack();
        stackLL.peek();

    }
}
