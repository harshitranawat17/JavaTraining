package JavaPrograms_131to140;

class Queue {

	  private int SIZE;
	  private int items[];
	  private int front, rear;

	  Queue(int size) {
		this.SIZE  = size;
		items = new int[size];
	    front = -1;
	    rear = -1;
	  }

	  public boolean isFull() {
	    if (front == 0 && rear == SIZE - 1) {
	      return true;
	    }
	    return false;
	  }

	  public boolean isEmpty() {
	    if (front == -1)
	      return true;
	    else
	      return false;
	  }

	  public void enQueue(int element) {

	    if (isFull()) {
	      System.out.println("Queue is full");
	    }
	    else {
	      if (front == -1) {
	        front = 0;
	      }

	      rear++;
	      
	      items[rear] = element;
	      System.out.println("Insert " + element);
	    }
	  }

	  public int deQueue() {
	    int element;

	    if (isEmpty()) {
	      System.out.println("Queue is empty");
	      return (-1);
	    }
	    else {

	      element = items[front];

	      if (front >= rear) {
	        front = -1;
	        rear = -1;
	      }
	      else {

	        front++;
	      }
	      System.out.println( element + " Deleted");
	      return (element);
	    }
	  }


	  public void display() {
		  
	    int i;
	    
	    if (isEmpty()) {
	      System.out.println("Empty Queue");
	    }
	    else {

	      System.out.println("\nFront index-> " + front);

	      System.out.println("Items -> ");
	      
	      for (i = front; i <= rear; i++) {
	        System.out.print(items[i] + "  ");
	      }
	      
	      System.out.println("\nRear index-> " + rear);
	    }
	  }

}
public class Problem_137_Implementqueue {
	public static void main(String[] args) {
		Queue q = new Queue(5);

	    q.deQueue();

	    for(int i = 1; i < 6; i ++) {
	      q.enQueue(i);
	    }

	    q.enQueue(6);

	    q.display();

	    q.deQueue();

	    q.display();
	}
}
