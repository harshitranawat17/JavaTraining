package JavaPrograms_131to140;

class Stack{
	private int arr[];
	private int size;
	private int top;
	
	Stack(int size){
		this.size = size;
		arr = new int[size];
		top = -1;
	}
	
	public void push(int data) {
		
		if(isFull()) {
			System.out.println("Stack overflow");
			System.exit(1);
		}
		
		System.out.println("interted");
		arr[++top] = data;
		
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			System.exit(1);
		}
		
		return arr[top--];
	}
	
	public void printStack() {
		for (int i = 0; i <= top; i++) {
		      System.out.print(arr[i] + ", ");
		}
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	
}

public class Problem_136_Implementstackdatastructure {
	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push(4);
		s.push(7);
		s.push(5);
		s.push(6);
		
		System.out.print("Stack is: ");
	    s.printStack();
		
		s.pop();
		System.out.println("\nAfter deleted");
	    s.printStack();

		
	}
	
}
