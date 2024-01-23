package JavaPrograms_141to150;

import java.util.HashMap;

public class Problem_145_UpdatevalueofHashMapusingkey {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> name = new HashMap<>();
		
		name.put("Harshit", 25);
		name.put("Roshan", 23);
		
	    System.out.println("HashMap: " + name);

	    int newvalue = 5;
	    
	    name.computeIfPresent("Roshan", (key,oldvalue) -> oldvalue+newvalue);
	    
	    System.out.println("HashMap with updated value: " + name);
	}
}
