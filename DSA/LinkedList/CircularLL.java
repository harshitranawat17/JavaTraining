package LinkedList;

public class CircularLL {
    
    Node head;
    
    CircularLL(){
        this.head = null;
    }
    
    class Node {
        
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    
    // Add to the beginning of the list and make it circular
    public void addfirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
        } else {
            newNode.next = head;
            head = newNode;
            Node currentNode = head;
            
            // Find the last node and update its next to point to head
            while (currentNode.next != head) {
                currentNode = currentNode.next;
            }
            currentNode.next = head; // Make it circular
        }
    }

    
    // Add to the end of the list and make it circular
    public void addLast(String data) {
        
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            head.next = head; // Make it circular
        } else {
            Node currentNode = head;
            
            while (currentNode.next != head) {
                currentNode = currentNode.next;
            }
            
            currentNode.next = newNode;
            newNode.next = head; // Make it circular
        }
    }
    
    // Delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == head) {
            // If there is only one node, make the list empty
            head = null;
        } else {
            Node currentNode = head;
            while (currentNode.next != head) {
                currentNode = currentNode.next;
            }
            head = head.next; // Move head to the next node
            currentNode.next = head; // Update the last node's next
        }
    }

    // Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == head) {
            // If there is only one node, make the list empty
            head = null;
        } else {
            Node currentNode = head;
            Node previousNode = null;
            
            while (currentNode.next != head) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            
            previousNode.next = head; // Update the last node's next to point to the head
        }
    }

    // Delete a node with specific data
    public void deleteNode(String data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data.equals(data)) {
            // If the node to delete is the head, move head to the next node
            deleteFirst();
            return;
        }

        Node currentNode = head;
        Node previousNode = null;

        do {
            previousNode = currentNode;
            currentNode = currentNode.next;

            if (currentNode.data.equals(data)) {
                // Found the node to delete, update previous node's next
                previousNode.next = currentNode.next;
                return;
            }
        } while (currentNode != head);

        System.out.println("Node with data " + data + " not found");
    }
    
    // Search for a node with specific data and return its index
    public void searchNode(String data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        int index = 0;
        Node currentNode = head;

        do {
            if (currentNode.data.equals(data)) {
                System.out.println("The data is present at index " + index);
                return;
            }

            currentNode = currentNode.next;
            index++;
        } while (currentNode != head);

        System.out.println("The data was not found in the list");
    }

    // Get the size of the circular linked list
    public int getSize() {
        if (head == null) {
            return 0;
        }

        int size = 1;
        Node currentNode = head;

        while (currentNode.next != head) {
            size++;
            currentNode = currentNode.next;
        }

        return size;
    }

    // Clear the circular linked list
    public void clearList() {
        head = null;
    }
    
    public void printList() {
        
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node currentNode = head;
        
        do {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        } while (currentNode != head);
        
        System.out.println(currentNode.data);
    }
    
    public static void main(String[] args) {
    	CircularLL list = new CircularLL();

        // Add elements to the circular linked list
        list.addLast("a");
        list.addLast("is");
        list.addLast("list");

        // Print the initial list
        System.out.println("Initial list:");
        list.printList();

        // Search for a node
        list.searchNode("is");

        // Get the size of the list
        int size = list.getSize();
        System.out.println("Size of the list: " + size);

        // Delete the first and last nodes
        list.deleteFirst();
        list.deleteLast();

        // Print the updated list
        System.out.println("\nList after deleting first and last nodes:");
        list.printList();

        // Clear the list
        list.clearList();
        
        // Print the empty list
        System.out.println("\nList after clearing:");
        list.printList();
    }
}
