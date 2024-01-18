package JavaPrograms_101to110;

public class Problem_104_CalculateExecutionTimeofMethods {
	
	public void display() {
	    System.out.println("calculated");
	  }

	  public static void main(String[] args) {

		Problem_104_CalculateExecutionTimeofMethods obj = new Problem_104_CalculateExecutionTimeofMethods();

	    long start = System.nanoTime();

	    obj.display();

	    long end = System.nanoTime();

	    long execution = end - start;
	    
	    System.out.println("Execution time: " + execution + " nanoseconds");
	  }
}
