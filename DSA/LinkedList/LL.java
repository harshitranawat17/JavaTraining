package LinkedList;

public class LL {
	
	Node head;
	private int size;
	
	LL(){
		this.size = 0 ;
	}
	
	class Node{
		
		String data;
		Node next;
		
		
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	//add-first, last
	public void addfirst(String data) {
		
		Node newNode = new Node(data);
		
		if(head== null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	} 
	
	public void addLast(String data) {
		
		Node newNode = new Node(data);
		
		if(head== null) {
			head = newNode;
			return;
		}
		
		Node currentNode = head;
		
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		currentNode.next = newNode;
		
	}
	
	public void printList() {
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		Node currentNode = head;
		
		while(currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		
		System.out.println("NULL");
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		size--;
		
		head = head.next;
		
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		size--;
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		//Node secondLast = head;
		Node lastNode = head;
		
//		while(lastNode.next!= null) {
//		
//			lastNode = lastNode.next;
//			//secondLast = secondLast.next;
//		}
//		lastNode =null;
		
		
		while(lastNode.next.next!=null) {
			lastNode=lastNode.next;
		}
		lastNode.next=null;
	}
	
	public void deleteNode(String data) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		size--;
		
		Node currentNode = head;
		Node previousNode = null;
		
		if(currentNode != null && currentNode.data == data) {
			head = currentNode.next;
            return;
		}
		
		while(currentNode != null && currentNode.data != data) {
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		
		if (currentNode == null) {
	        System.out.println("Node with data " + data + " not found");
	        return;
		}
		
		previousNode.next = currentNode.next;
		
	}
	
	public void searchNode(String data){
		
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		Node currentNode = head;
		
		for(int i=0; i<size; i++) {
			
			if(currentNode.data == data) {
				System.out.println("The data is present at index "+i);
				return;
			}
			
			currentNode = currentNode.next;
			
		}	
		
	}
	
	public int getSize() {
		return size;
	}
	
	public void clearList() {
		head = null;
		size = 0;
	}
	
	
	public static void main(String[] args) {
		LL list = new LL();
		list.addfirst("a");
		list.addfirst("is");
		list.addLast("list");
		
		list.printList();
		
		//list.deleteLast();
		
		//list.printList();
		
		//list.deleteFirst();
		
		//list.printList();
		
		System.out.println(list.getSize());
		
		//list.searchNode("list");
		
		list.deleteNode("a");
		list.printList();
		System.out.println(list.getSize());
		
		list.clearList();
		list.printList();
		System.out.println(list.getSize());
		
	}
}
