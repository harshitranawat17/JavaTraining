package JavaPrograms_41to50;

public class Problem_49_FrequencyofCharacterinString {
	public static void main(String[] args) {
		
        String str = "Harshit Ranawat";
        char ch = 'a';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}
