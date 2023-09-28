package Stack;

public class StackUsingLinkedList {
    private Node top;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public StackUsingLinkedList() {
        top = null;
        size = 0;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push an element onto the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value indicating an empty stack
        } else {
            int poppedValue = top.data;
            top = top.next;
            size--;
            System.out.println("Popped " + poppedValue + " from the stack.");
            return poppedValue;
        }
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value indicating an empty stack
        } else {
            return top.data;
        }
    }

    // Delete the stack and reset it
    public void deleteStack() {
        top = null;
        size = 0;
        System.out.println("Stack deleted and reset.");
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack

        stack.deleteStack();
        System.out.println("Is stack empty after deletion? " + stack.isEmpty());
    }
}

