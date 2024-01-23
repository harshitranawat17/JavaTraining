package JavaPrograms_141to150;

import java.util.HashSet;
import java.util.Set;

public class Problem_143_IterateoverSet {
	
	public static void main(String[] args) {
	 
	    Set<Integer> num = new HashSet<>();

	
	    num.add(2);
	    num.add(3);
	    num.add(5);
	    num.add(4);
	    
	    System.out.println("Set: " + num);


	    System.out.print("Element of Set: ");

	    num.forEach((e) -> {
	      System.out.print(e + " ");
	    });
	  }
}
