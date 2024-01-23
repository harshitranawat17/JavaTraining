package JavaPrograms_141to150;

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


    public void createLoop(int position) {
        if (position <= 0 || position > length()) {
            return; 
        }

        Node current = head;
        Node loopNode = null;

        for (int i = 1; i < position; i++) {
            current = current.next;
        }

        loopNode = current; 

        while (current.next != null) {
            current = current.next;
        }

        current.next = loopNode;
    }

    public boolean detectLoop() {
        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer) {
                return true; 
            }
        }

        return false;
    }

    private int length() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}


public class Problem_148_DetectloopinLinkedList {
	
	public static void main(String[] args) {
		
        LinkedList linkedList = new LinkedList();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        linkedList.createLoop(2);

        boolean hasLoop = linkedList.detectLoop();
        if (hasLoop) {
            System.out.println("Loop detected.");
        } else {
            System.out.println("No loop detected.");
        }
    }
}
