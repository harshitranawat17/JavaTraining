package Queue;

import java.util.Scanner;

public class CircularQueueUsingArray {
	
	int f=-1, r=-1;
	int n = 10;
	int q[] = new int[n];
	
	void enqueue(Scanner sc) {
		
		if(f==(r+1)%n) {  //overflow
			System.out.println("overflow condition");
		}
		else {
			System.out.println("enter data to add: ");
			int i = sc.nextInt();
			
			if(f==-1 && r==-1) {
				f=0;
				r=0;
				q[r] = i;
			}
			else {
				r = (r+1)%n;  //circular enqueue
				q[r] = i;
			}
		}
		
	}
	
	void dequeue() {
		if(f==-1 && r==-1) {
			System.out.println("underflow condition");
		}
		else if(f==r) {
			System.out.println("underflow condition");
			f=-1;
			r=-1;
					
		}
		else {
			f = (f+1)%n;
		}
	}
	
	void display() {
		int i;
		System.out.print("Items are: ");
		for(i=f; i!=r; i=(i+1)%n) {
			System.out.print(q[i]);
		}
		System.out.print(q[i]);
	}
	
	boolean isEmpty() {
		
		if(f==-1 && r==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean isFull() {
		
		if(r == (n-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	int peek() {
		if(!isEmpty()) {
			return q[f];
		}else {
			System.out.println("Queue is empty");
			return -1;
		}
	}
	
	void clear() {
		q = null;
		System.out.println("Queue deleted");
	}
	
	public static void main(String[] args) {
		
		CircularQueueUsingArray cq = new CircularQueueUsingArray();
		
		Scanner se = new Scanner(System.in);
	
		
	
		while(true) {
			System.out.println("Menu: ");
			System.out.println("Press 1 to add element in queue");
			System.out.println("Press 2 to delete element in queue");
			System.out.println("Press 3 to check queue is empty or not");
			System.out.println("Press 4 to check queue is full or not");
			System.out.println("Press 5 to see top element");
			System.out.println("Press 6 to display queue");
			System.out.println("Press 0 to exit");
			
			int key = se.nextInt(); 
			
			switch (key) {
				
				case 1:
					cq.enqueue(se);
					System.out.println("Data Added");
					break;
				
				case 2:
					cq.dequeue();
					System.err.println("Data deleted");
					break;
				
				case 3:
					if(cq.isEmpty()) {
						System.err.println("Yes");
					}
					else {
						System.err.println("No");
					}
					break;
				
				case 4:
					
					if(cq.isFull()) {
						System.err.println("Yes");
					}
					else {
						System.err.println("No");
					}
					break;
					
				case 5:
					int data = cq.peek();
					System.out.println("The Top element is "+data);
					break;

				case 6:
					cq.display();
					break;
					
				case 0:
				
					System.exit(0);
					break;
					
				default:
					System.out.println("invalid");
					break;
			}
		
		}
	}
}
