package JavaPrograms_151to160;

import java.util.ArrayList;

public class Problem_155_IterateoverArrayListusingLambdaExpression {
	public static void main(String[] args) {
	
			ArrayList<String> names = new ArrayList<>();
			    names.add("Harshit");
			    names.add("Roshan");
			    names.add("Jigyasa");
		 
		    System.out.print("ArrayList of names: ");

		    //lambda funaction
		    names.forEach((e) -> {
		      System.out.print(e + ", ");
		    });
	}
}

