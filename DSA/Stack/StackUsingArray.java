package Stack;

public class StackUsingArray {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackUsingArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value indicating an empty stack
        } else {
            int poppedValue = stackArray[top--];
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
            return stackArray[top];
        }
    }

    // Delete the stack and reset it
    public void deleteStack() {
        stackArray = new int[maxSize];
        top = -1;
        System.out.println("Stack deleted and reset.");
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack

        stack.deleteStack();
        System.out.println("Is stack empty after deletion? " + stack.isEmpty());
    }
}

