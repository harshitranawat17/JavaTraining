package JavaPrograms_51to60;

public class Problem_55_RemoveWhitespacesfromString {
	
	public static void main(String[] args) {
        String sentence = "No all    go     od   ti   me";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}
