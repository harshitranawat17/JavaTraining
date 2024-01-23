package JavaPrograms_141to150;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem_144_MergeTwoList {
	
	public static void main(String[] args) {
		
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(5);
        l1.add(7);
        
        List<Integer> l2 = new ArrayList<>();
        l2.add(8);
        l2.add(9);
        l2.add(3);

        List<Integer> mergedList = mergeLists(l1, l2);

        System.out.println("List 1: " + l1);
        System.out.println("List 2: " + l2);
        
        System.out.println("Merged List: " + mergedList);
    }

    private static <T> List<T> mergeLists(List<T> l1, List<T> l2) {

        return Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());
    }
}
