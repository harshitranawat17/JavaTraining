package JavaPrograms_161to167;

import java.util.LinkedList;

public class Problem_167_AccesselementsfromLinkedList {
	public static void main(String[] args) {
	    LinkedList<String> names = new LinkedList<>();

	    names.add("Harshit");
	    names.add("Rosdhan");
	    names.add("jigyasas");
	    System.out.println("LinkedList: " + names);

	    String str = names.get(1);
	    System.out.print("name at index 1: " + str);
	  }
}
