package JavaPrograms_141to150;

import java.util.ArrayList;
import java.util.ListIterator;

public class Problem_141_IterateoverArrayList {
	
	public static void main(String[] args) {

	    ArrayList<Integer> num = new ArrayList<>();
	    
	    num.add(1);
	    num.add(4);
	    num.add(5);
	    
	    System.out.println("ArrayList: " + num);


	    ListIterator<Integer> iterate = num.listIterator();
	    
	    System.out.println("Iterating over ArrayList:");
	    
	    while(iterate.hasNext()) {
	      System.out.print(iterate.next() + ", ");
	    }
	  }
}
