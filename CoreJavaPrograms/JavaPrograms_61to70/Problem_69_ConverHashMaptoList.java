package JavaPrograms_61to70;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_69_ConverHashMaptoList {
	
	public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");

        List<Integer> keyList = new ArrayList(map.keySet());
        List<String> valueList = new ArrayList(map.values());

        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);

    }
}
