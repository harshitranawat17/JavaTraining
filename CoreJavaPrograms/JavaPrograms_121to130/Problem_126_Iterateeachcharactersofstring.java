package JavaPrograms_121to130;

public class Problem_126_Iterateeachcharactersofstring {
	public static void main(String[] args) {

	    String name = "Harshit";

	    System.out.println("Characters in " + name + " are:");

	    for(int i = 0; i<name.length(); i++) {
	    	
	      char a = name.charAt(i);
	      System.out.print(a + ", ");
	    }
	  }
}
