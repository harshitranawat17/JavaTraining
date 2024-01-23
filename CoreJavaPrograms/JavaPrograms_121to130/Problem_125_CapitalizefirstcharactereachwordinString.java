package JavaPrograms_121to130;

public class Problem_125_CapitalizefirstcharactereachwordinString {
	
	public static void main(String[] args) {
		
        String str = "harshit ranawat develoeper";

        String cstr = capitalizeFirstCharacter(str);

        System.out.println("Original String: " + str);
        System.out.println("Capitalized String: " + cstr);
    }

    private static String capitalizeFirstCharacter(String str) {
    	
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split("\\s");

        for (int i = 0; i < words.length; i++) {
        	
            if (!words[i].isEmpty()) {
            	
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }
        }
        return String.join(" ", words);
    }
}
