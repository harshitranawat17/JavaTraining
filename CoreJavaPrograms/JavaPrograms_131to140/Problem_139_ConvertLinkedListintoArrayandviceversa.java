package JavaPrograms_131to140;
import java.util.Arrays;
import java.util.LinkedList;

public class Problem_139_ConvertLinkedListintoArrayandviceversa {
	
	public static void main(String[] args) {
		
	    LinkedList<String> names= new LinkedList<>();

	    names.add("Harshit");
	    names.add("Ranawat");
	    names.add("Roshan");
	    names.add("praidar");

	    //making array
	    String[] arr = new String[names.size()];

	    // Convert ll to array
	    names.toArray(arr);
	    
	    System.out.print("Array: ");
	    
	    for(String item:arr) {
	      System.out.print(item+", ");
	    }
	    
	    //convert array to LL
	    
	    LinkedList<String> againLL = new LinkedList<String>(Arrays.asList(arr));
	    System.out.println();
	    System.out.println("LinkedList: "+againLL);
	    
	    
	  }
}
