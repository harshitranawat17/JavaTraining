package JavaPrograms_121to130;

public class Problem_127_DifferentiateStringequaloperators {
	
	public static void main(String[] args) {

	    String name1 = new String("Harshit");
	    String name2 = new String("Harshit");

	    boolean result1 = (name1 == name2);
	    System.out.println("Using(==)perator: " + result1);

	    boolean result2 = name1.equals(name2);
	    System.out.println("Using equals(): " + result2);
	  }
}
