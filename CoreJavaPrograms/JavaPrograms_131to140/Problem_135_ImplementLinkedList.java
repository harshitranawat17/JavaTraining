package JavaPrograms_131to140;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    //insert
    public void insert(int data) {
    	
        Node newNode = new Node(data);

        if (head == null) {
        	
            head = newNode;
            
        } else {
        	
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public int getmiddle() {
   	
    	if (head == null) {
            return -1; 
        }
    	Node slow = head;
    	Node fast = head;
    	
    	while(fast != null && fast.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	return slow.data;
    }

    // display 
    public void display() {
        Node current = head;

        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


public class Problem_135_ImplementLinkedList {
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();

        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);

        linkedList.display();
	}
}
