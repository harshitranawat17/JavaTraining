package JavaPrograms_121to130;

public class Problem_124_ClearStringBuffer {
	
	public static void main(String[] args) {

	    StringBuffer str = new StringBuffer();

	    str.append("Harshit");
	    str.append(" Ranawat");
	    str.append(" Developer.");
	    
	    System.out.println("Before delete StringBuffer: " + str);

	    str.delete(0, str.length());
	    
	    System.out.println("After delete StringBuffer: " + str);
	  }
}
