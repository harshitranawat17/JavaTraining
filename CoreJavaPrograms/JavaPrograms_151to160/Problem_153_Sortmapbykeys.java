package JavaPrograms_151to160;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Problem_153_Sortmapbykeys {
	
	public static void main(String[] args) {

        Map<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(3, "Three");
        unsortedMap.put(1, "One");
        unsortedMap.put(2, "Two");
        unsortedMap.put(4, "Four");

        System.out.println("Unsorted Map: " + unsortedMap);
        
        TreeMap<Integer, String> sortedMap = new TreeMap<>(unsortedMap);
        
        System.out.println("Sorted Map: " + sortedMap);
    }
}
