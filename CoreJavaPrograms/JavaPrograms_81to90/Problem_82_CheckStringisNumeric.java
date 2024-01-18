package JavaPrograms_81to90;

public class Problem_82_CheckStringisNumeric {
	
	public static void main(String[] args) {

        String str = "753247.5";
        
        boolean numeric = true;

        try {
        	
            Double num = Double.parseDouble(str);
            
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(str + " is a number");
        else
            System.out.println(str + " is not a number");
    }
}
