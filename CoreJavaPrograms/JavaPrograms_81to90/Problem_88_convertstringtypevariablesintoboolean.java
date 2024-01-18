package JavaPrograms_81to90;

public class Problem_88_convertstringtypevariablesintoboolean {
	public static void main(String[] args) {

	    String str1 = "true";
	    String str2 = "false";

	    boolean b1 = Boolean.parseBoolean(str1);
	    boolean b2 = Boolean.valueOf(str2);

	    System.out.println(b1);  
	    System.out.println(b2);    
	  }
}
