package JavaPrograms_61to70;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_67_ConvertListtoArray_ViceVersa {
	
	public static void main(String[] args) {
		
	    ArrayList languages = new ArrayList<>();

	    languages.add("harshit");
	    languages.add("roshan");
	    languages.add("Jigs");
	    
	    System.out.println("ArrayList: " + languages);

	    String[] arr = new String[languages.size()];

	    //convert to array
	    languages.toArray(arr);

	    System.out.print("Array: ");
	    for(String item:arr) {
	      System.out.print(item+", ");
	    }
	
	    //viceversa
	    
	    String[] array = {"Harshit", "roshan"};
	    System.out.println("Array: " + Arrays.toString(array));

	    // convert array to list
	    List languagess= new ArrayList<>(Arrays.asList(array));

	    System.out.println("List: " + languagess);
	
	
	
	}
}
