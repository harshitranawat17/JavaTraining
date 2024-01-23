package JavaPrograms_151to160;

import java.util.HashSet;
import java.util.Set;

public class Problem_152_Checkifsetisthesubsetofanotherset {
	public static void main(String[] args) {

	    Set<Integer> num1 = new HashSet<>();
	    num1.add(2);
	    num1.add(3);
	    System.out.println("num: " + num1);


	    Set<Integer> num = new HashSet<>();
	    num.add(1);
	    num.add(3);
	    num.add(2);
	    num.add(5);
	    System.out.println("numbers: " + num);
	    
	    boolean result = num.containsAll(num1);
	    System.out.println("is it contains?" + result);
	  }
}
