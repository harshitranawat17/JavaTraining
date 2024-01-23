package JavaPrograms_131to140;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_140_ConvertArrayListintostringandviceversa {
	public static void main(String[] args) {
		
		ArrayList<String> arrl = new ArrayList<String>();
		
		arrl.add("Harshit");
		arrl.add("Ranawat");
		arrl.add("Roshan");
		arrl.add("praidar");
		
		//convert arraylist to string
		String name = arrl.toString();
		
		System.out.println("String: "+name);
		
		//convert string to arraylist
		
		String[] arr = name.split(",");
		
		ArrayList<String> arraylist = new ArrayList<String>(Arrays.asList(arr));
		
		System.out.println("Arraylist "+arraylist);
 	}
}
