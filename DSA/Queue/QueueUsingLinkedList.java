package Queue;

import java.util.Scanner;

public class QueueUsingLinkedList {
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
			
		}	
	}
	
	Node f = null;
	Node r = null;
	
	public void enqueue(Scanner sc) {
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		
		if(f==null) {
			f = newNode;
			r = newNode;
		}
		else {
			r.next = newNode;
			r = newNode;	
		}
	}
	
	public void dequeue() {
		if(f == null) {
			System.out.println("Underflow");
		}
		else {
			f=f.next;
		}
	}
	
	public void display() {
		
		Node temp = f;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next; 
		}
	}
	
	public static void main(String[] args) {
		
		QueueUsingLinkedList llq = new QueueUsingLinkedList();
		
		Scanner se = new Scanner(System.in);
	
		
	
		while(true) {
			System.out.println("Menu: ");
			System.out.println("Press 1 to add element in queue");
			System.out.println("Press 2 to delete element in queue");
			System.out.println("Press 3 to display queue");
			System.out.println("Press 0 to exit");
			
			int key = se.nextInt(); 
			
			switch (key) {
				
				case 1:
					llq.enqueue(se);
					System.out.println("Data Added");
					break;
				
				case 2:
					llq.dequeue();
					System.err.println("Data deleted");
					break;

				case 3:
					llq.display();
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
