package JavaPrograms_121to130;

import java.util.Scanner;
public class Problem_128_Implementswitchstatementonstrings {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    String name = sc.next();

	    switch(name) {

	      case "Harshit":
	        System.out.println(name + " is ranawat.");
	        break;

	      case "Rosahn":
	        System.out.println(name + " is patidar");
	        break;

	      case "jigs":
	        System.out.println(name + " is yadav.");
	        break;

	      default:
	        System.out.println(name + " no record.");
	        break;
	    }
	  }
}
