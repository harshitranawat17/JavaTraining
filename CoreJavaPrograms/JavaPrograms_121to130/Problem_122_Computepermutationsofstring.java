package JavaPrograms_121to130;

public class Problem_122_Computepermutationsofstring {
	
	static void printPermutn(String str, String ans){
		
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
 
            String s = str.substring(0, i) +
                        str.substring(i + 1);

            printPermutn(s, ans + ch);
        }
    }

    public static void main(String[] args)
    {
        String s = "abb";
        
        printPermutn(s, "");
    }
}
