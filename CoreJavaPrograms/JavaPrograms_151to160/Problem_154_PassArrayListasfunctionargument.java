package JavaPrograms_151to160;

import java.util.ArrayList;

public class Problem_154_PassArrayListasfunctionargument {
	
	  public static void main(String[] args) {

	    ArrayList<String> names = new ArrayList<>();
	    names.add("Harshit");
	    names.add("Roshan");
	    names.add("Jigyasa");

	    display(names);
	  }
	  
	  public static void display(ArrayList<String> names) {

		    System.out.print("ArrayList: ");
		    for(String name : names) {
		      System.out.print(name + ", ");
		    }
	  }
}
