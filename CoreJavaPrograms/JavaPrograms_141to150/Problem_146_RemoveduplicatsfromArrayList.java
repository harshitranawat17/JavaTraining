package JavaPrograms_141to150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem_146_RemoveduplicatsfromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> name  = new ArrayList<Integer>(Arrays.asList(1,2,3,5,2,4,3));
		System.out.println("Arraylist before: "+name);
		
		Stream<Integer> stream = name.stream().distinct();
		
		name = (ArrayList<Integer>) stream.collect(Collectors.toList());
		
		System.out.println("Arraylist after: "+name);
		
		
	}
}
