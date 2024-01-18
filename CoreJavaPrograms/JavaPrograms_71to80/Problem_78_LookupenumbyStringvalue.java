package JavaPrograms_71to80;

public class Problem_78_LookupenumbyStringvalue {
	public enum Names {
	      HARSHIT, RANAWAT, DEVELOPER, BRAINVIRE
	   }
	   public static void main(String[] args) {
	      String input_string = "developer";
	      
	      System.out.println("The string is: " +input_string);
	      
	      Names result = Names.valueOf(input_string.toUpperCase());
	      
	      System.out.println("\nThe result is: ");
	      System.out.println(result);
	   }
}
