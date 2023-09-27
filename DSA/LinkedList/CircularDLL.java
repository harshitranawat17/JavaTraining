package LinkedList;

public class CircularDLL {
    
    Node head;
    private int size;
    
    CircularDLL() {
        this.size = 0;
    }
    
    class Node {
        
        String data;
        Node next;
        Node prev;
        
        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }
    
    // Add to the front of the list
    public void addFirst(String data) {
        
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
            head.prev = head; // Make it circular
            return;
        }
        
        newNode.next = head;
        newNode.prev = head.prev;
        head.prev.next = newNode;
        head.prev = newNode;
        head = newNode;
    } 
    
    // Add to the end of the list
    public void addLast(String data) {
        
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
            head.prev = head; // Make it circular
            return;
        }
        
        newNode.next = head;
        newNode.prev = head.prev;
        head.prev.next = newNode;
        head.prev = newNode;
    }
    
    public void printList() {
        
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node currentNode = head;
        
        do {
            System.out.print(currentNode.data + " <-> ");
            currentNode = currentNode.next;
        } while (currentNode != head);
        
        System.out.println(currentNode.data);
    }
    
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        size--;
        
        if (head.next == head) {
            head = null;
        } else {
            head.prev.next = head.next;
            head.next.prev = head.prev;
            head = head.next;
        }
    }
    
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        size--;
        
        if (head.next == head) {
            head = null;
        } else {
            head.prev.prev.next = head;
            head.prev = head.prev.prev;
        }
    }
    
    public void deleteNode(String data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        size--;
        
        Node currentNode = head;
        
        do {
            if (currentNode.data.equals(data)) {
                if (currentNode == head) {
                    deleteFirst();
                    return;
                }
                currentNode.prev.next = currentNode.next;
                currentNode.next.prev = currentNode.prev;
                return;
            }
            currentNode = currentNode.next;
        } while (currentNode != head);
        
        System.out.println("Node with data " + data + " not found");
    }
    
    public void searchNode(String data){
        
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node currentNode = head;
        int index = 0;
        
        do {
            if (currentNode.data.equals(data)) {
                System.out.println("The data is present at index " + index);
                return;
            }
            currentNode = currentNode.next;
            index++;
        } while (currentNode != head);
        
        System.out.println("The data " + data + " is not found in the list");
    }
    
    public int getSize() {
        return size;
    }
    
    public void clearList() {
        head = null;
        size = 0;
    }
    
    public void reverseTraverseCircularDLL() {
        if (head != null) {
            Node tempNode = head.prev; // Start from the tail node (last node)
            do {
                System.out.print(tempNode.data);
                System.out.print(" <-> ");
                tempNode = tempNode.prev;
            } while (tempNode != head.prev); // Continue until we reach the head.prev node again
        } else {
            System.out.println("The CircularDLL does not exist!");
        }
        System.out.println(head.prev.data);
    }

    
    public static void main(String[] args) {
        CircularDLL list = new CircularDLL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addLast("that");
        list.addLast("made");
        
        list.printList();
        
        // list.deleteLast();
        
        // list.printList();
        
        // list.deleteFirst();
        
        // list.printList();
        
        System.out.println(list.getSize());
        
        list.reverseTraverseCircularDLL();
        
        // list.searchNode("list");
        
        //list.deleteNode("a");
        //list.printList();
        System.out.println(list.getSize());
        
        //list.clearList();
        //list.printList();
        //System.out.println(list.getSize());
    }
}
