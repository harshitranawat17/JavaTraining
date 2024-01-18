package JavaPrograms_71to80;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Problem_80_SortMapByValues {
	public static void main(String[] args) {

        Map<String, Integer> unsortMap = new HashMap<>();
        
        unsortMap.put("Harshit", 25);
        unsortMap.put("roshan", 23);
        unsortMap.put("jigs", 22);
        unsortMap.put("abhi", 21);

        Map<String, Integer> sortedMap = sortMapByValues(unsortMap);

        System.out.println("Sorted Map by Values:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<String, Integer> sortMapByValues(Map<String, Integer> unsortMap) {
    	
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortMap.entrySet());

        Comparator<Map.Entry<String, Integer>> valueComparator = Map.Entry.comparingByValue();

        entryList.sort(valueComparator);

        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
