package JavaPrograms_61to70;

public class Problem_61_CheckArrayContainsGivenValue {
	
	public static void main(String[] args) {

	    int[] arr = {1, 2, 3, 4, 5};
	    int num = 3;
	    boolean found = false;
	    int pos = 0;
	    for (int n : arr) {
	      if (n == num) {
	        found = true;
	        break;
	      }
	      pos++;
	    }
	    if(found)
	      System.out.println(num + " is found at "+pos);
	    else
	      System.out.println(num + " is not found.");
	}
}
