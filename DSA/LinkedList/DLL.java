package LinkedList;

public class DLL {
    
    Node head;
    Node tail; // Add a tail reference
    private int size;
    
    DLL(){
        this.size = 0 ;
    }
    
    class Node{
        
        String data;
        Node next;
        Node prev; // Add a prev reference
        
        Node(String data){
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
            tail = newNode; // Update the tail for the first node
            return;
        }
        
        newNode.next = head;
        head.prev = newNode; // Update the previous reference for the current head
        head = newNode;
    } 
    
    // Add to the end of the list
    public void addLast(String data) {
        
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        
        newNode.prev = tail; // Update the previous reference for the new node
        tail.next = newNode;
        tail = newNode; // Update the tail to the new node
    }
    
    public void printList() {
        
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node currentNode = head;
        
        while (currentNode != null) {
            System.out.print(currentNode.data + " <-> "); // Print both next and previous nodes
            currentNode = currentNode.next;
        }
        
        System.out.println("NULL");
    }
    
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        size--;
        
        head = head.next;
        if (head != null) {
            head.prev = null; // Update the previous reference for the new head
        } else {
            tail = null; // If there's only one node, update the tail as well
        }
    }
    
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        size--;
        
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        
        tail = tail.prev; // Update the tail to the previous node
        tail.next = null;
    }
    
    public void deleteNode(String data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        size--;
        
        Node currentNode = head;
        
        while (currentNode != null && !currentNode.data.equals(data)) {
            currentNode = currentNode.next;
        }
        
        if (currentNode == null) {
            System.out.println("Node with data " + data + " not found");
            return;
        }
        
        if (currentNode.prev != null) {
            currentNode.prev.next = currentNode.next;
        } else {
            head = currentNode.next; // Update head if the node to delete is the first node
        }
        
        if (currentNode.next != null) {
            currentNode.next.prev = currentNode.prev;
        } else {
            tail = currentNode.prev; // Update tail if the node to delete is the last node
        }
    }
    
    public void searchNode(String data){
        
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node currentNode = head;
        int index = 0;
        
        while (currentNode != null) {
            
            if (currentNode.data.equals(data)) {
                System.out.println("The data is present at index " + index);
                return;
            }
            
            currentNode = currentNode.next;
            index++;
        }
        
        System.out.println("The data " + data + " is not found in the list");
    }
    
    public int getSize() {
        return size;
    }
    
    public void clearList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public void reverseTraverseDLL() {
    	if(head != null) {
    		Node tempNode = tail;
    		for (int i = 0; i < size; i++) {
				System.out.print(tempNode.data);
				if(i != size) {
					System.out.print(" <-> ");
				}
				tempNode = tempNode.prev;
			}
    	}else {
    		System.out.println("The DLL does not exist!");
    	}
    	System.out.println("NULL");
    	
    }
    
    public static void main(String[] args) {
        DLL list = new DLL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");    
        list.printList();
        
        //list.deleteLast();
        //list.printList();
        
        //list.deleteFirst();     
        //list.printList();
        
        System.out.println(list.getSize());
        
        list.reverseTraverseDLL();
        
        //list.searchNode("list");
        
        //list.deleteNode("a");
        //list.printList();
        //System.out.println(list.getSize());
        
        //list.clearList();
        //list.printList();
        //System.out.println(list.getSize());
    }
}
