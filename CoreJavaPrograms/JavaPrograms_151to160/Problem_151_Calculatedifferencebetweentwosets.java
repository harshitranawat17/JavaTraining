package JavaPrograms_151to160;

import java.util.HashSet;
import java.util.Set;

public class Problem_151_Calculatedifferencebetweentwosets {
	public static void main(String[] args) {

	    Set<Integer> num1 = new HashSet<>();
	    num1.add(2);
	    num1.add(3);
	    System.out.println("nums: " + num1);


	    Set<Integer> num = new HashSet<>();
	    num.add(1);
	    num.add(3);
	    System.out.println("numbers: " + num);
	    
	    num.removeAll(num1);
	    System.out.println("numbers after differece: " + num);
	  }
}
