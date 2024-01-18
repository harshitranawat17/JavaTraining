package JavaPrograms_41to50;

public class Problem_50_CountVowelsConsonantinSentence {
	
	public static void main(String[] args) {
		
	    String name = "HARSHIT rANAWAT";
	    int vowels = 0, consonants = 0;

	    name = name.toLowerCase();
	    
	    for (int i = 0; i < name.length(); ++i) {
	      char ch = name.charAt(i);

	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	        ++vowels;
	      }
	      else if ((ch >= 'a' && ch <= 'z')) {
	        ++consonants;
	      }
	    }

	    System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);
	  }
}
