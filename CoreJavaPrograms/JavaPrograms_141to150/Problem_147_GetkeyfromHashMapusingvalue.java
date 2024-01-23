package JavaPrograms_141to150;

import java.util.HashMap;
import java.util.Map.Entry;

public class Problem_147_GetkeyfromHashMapusingvalue {
	
	public static void main(String[] args) {

	    HashMap<String, Integer> name = new HashMap<>();
	    
	    name.put("Harshit", 25);
	    name.put("Roshan", 23);
	    name.put("Abhigyan", 22);
	    
	    System.out.println("HashMap: " + name);

	    Integer value = 22;

	    for(Entry<String, Integer> entry: name.entrySet()) {

	      if(entry.getValue() == value) {
	        System.out.println("The key for value " + value + " is " + entry.getKey());
	        break;
	      }
	    }
	  }
}
