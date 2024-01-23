package JavaPrograms_141to150;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Problem_142_IterateoverHashMap {
	
	public static void main(String[] args) {

	    HashMap<String, String> name = new HashMap<>();
	    
	    name.put("Harshit", "Ranawat");
	    name.put("Roshan", "Paridar");
	    name.put("Jigyasa", "yadav");
	    name.put("Jigyasa", "yadav");
	    
	    System.out.println("HashMap: " + name);


	    Iterator<Entry<String, String>> iterate1 = name.entrySet().iterator();


	    System.out.print("Entries: ");
	    
	    while(iterate1.hasNext()) {
	      System.out.print(iterate1.next());
	      System.out.print(", ");
	    }

	    Iterator<String> iterate2 = name.keySet().iterator();
	    
	    System.out.print("\nKeys: ");
	    
	    while(iterate2.hasNext()) {
	      System.out.print(iterate2.next());
	      System.out.print(", ");
	    }

	    Iterator<String> iterate3 = name.values().iterator();
	    
	    System.out.print("\nValues: ");
	    
	    while(iterate3.hasNext()) {
	      System.out.print(iterate3.next());
	      System.out.print(", ");
	    }
	  }
}
