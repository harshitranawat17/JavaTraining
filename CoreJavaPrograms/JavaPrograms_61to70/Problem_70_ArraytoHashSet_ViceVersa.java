package JavaPrograms_61to70;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem_70_ArraytoHashSet_ViceVersa {
	
	public static void main(String[] args) {

		//arry to hashset
		
        String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.asList(array));

        System.out.println("Set: " + set);
    
        //hashset to array
        
        Set<String> set1 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");

        String[] array1 = new String[set1.size()];
        set.toArray(array);

        System.out.println("Array: " + Arrays.toString(array1));
	}
}
